package de.webpdf.sample.webservice;

import de.webpdf.sample.helper.HttpAccept;
import de.webpdf.sample.helper.HttpMethod;
import de.webpdf.sample.helper.WebserviceHelper;
import de.webpdf.sample.schema.beans.DocumentFile;
import de.webpdf.sample.schema.beans.ExceptionBean;
import de.webpdf.sample.schema.beans.SessionToken;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.*;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Implements a base wrapper for all web services
 */
public abstract class AbstractWebservice implements Webservice, AutoCloseable {

    private static final String USER_NAME = "admin";
    private static final String USER_PASSWORD = "admin";
    HttpAccept httpAccept = HttpAccept.XML;
    DocumentFile documentFile;
    URL contentURL;
    private URL serverURL;
    private File targetFile;
    private CloseableHttpClient closeableHttpClient;
    private SessionToken sessionToken;
    private boolean useAuthorization = false;

    /**
     * Initialize the web service wrapper
     *
     * @param serverURL  base URL of the webPDF server
     * @param sourceFile source file to use for web service call
     * @param httpAccept parameter format
     * @throws IOException if source file has invalid syntax
     */
    AbstractWebservice(URL serverURL, URI sourceFile, HttpAccept httpAccept) throws IOException {
        this.serverURL = serverURL;
        this.contentURL = sourceFile.toURL();
        this.httpAccept = httpAccept;
        closeableHttpClient = HttpClients.createDefault();
    }

    /**
     * Close the HTTP connection
     *
     * @throws IOException if this resource cannot be closed
     */
    @Override
    public void close() throws IOException {
        if (closeableHttpClient != null) {
            closeableHttpClient.close();
        }
    }

    /**
     * Sets the usage of the authorization header.
     * This is required, when the web service requires authentication.
     *
     * @param useAuthorization true = enables authorization header
     */
    public void setUseAuthorization(boolean useAuthorization) {
        this.useAuthorization = useAuthorization;
    }

    /**
     * Check the response of the HTTP request. If the response is an error, it can contain a webPDF server error bean.
     *
     * @param httpResponse HTTP response
     * @throws IOException   extracted error message
     * @throws JAXBException unable to convert the error object
     */
    private void checkResponse(HttpResponse httpResponse) throws IOException, JAXBException {

        // any error?
        StatusLine statusLine = httpResponse.getStatusLine();
        if (statusLine.getStatusCode() == HttpStatus.SC_OK) {
            return;
        }

        // get the response
        HttpEntity httpEntity = httpResponse.getEntity();
        if (httpEntity == null) {
            throw new IOException("No content in answer");
        }

        String responseOutput;

        // is this a webPDF server response or a general server error?
        Header header = httpEntity.getContentType();
        if (header.getValue().equals(HttpAccept.XML.getMimeType())
                || header.getValue().equals(HttpAccept.JSON.getMimeType())) {

            ExceptionBean exceptionBean = this.httpAccept.equals(HttpAccept.XML)
                    ? WebserviceHelper.fromXML(httpEntity, ExceptionBean.class)
                    : WebserviceHelper.fromJSON(httpEntity, ExceptionBean.class);

            responseOutput = "Server error: " + exceptionBean.getErrorMessage()
                    + " (" + exceptionBean.getErrorCode() + ")\n"
                    + (!exceptionBean.getStackTrace().isEmpty() ? "Server stack trace: "
                    + exceptionBean.getStackTrace() + "\n" : "");
        } else {
            responseOutput = EntityUtils.toString(httpEntity);
        }

        // throw the extracted error message
        throw new IOException(statusLine.getStatusCode() + " " + statusLine.getReasonPhrase() + "\n" + responseOutput);
    }

    /**
     * Build a HTTP request
     *
     * @param httpMethod HTTP method (GET, POST, ...)
     * @param httpAccept request and response data type
     * @param url        REST URL
     * @param httpEntity data to send with request (POST)
     * @return a new HTTP request
     * @throws IOException        if the HTTP method is unknown
     * @throws URISyntaxException if the URL has invalid structure
     */
    HttpUriRequest getRequest(HttpMethod httpMethod, HttpAccept httpAccept, String url, HttpEntity httpEntity)
            throws IOException, URISyntaxException {

        URIBuilder uriBuilder = new URIBuilder(this.serverURL.toString());
        uriBuilder.setPath(uriBuilder.getPath() + url);
        URI uri = uriBuilder.build();

        RequestBuilder requestBuilder;

        switch (httpMethod) {
            case GET:
                requestBuilder = RequestBuilder.get(uri);
                break;
            case POST:
                requestBuilder = RequestBuilder.post(uri);
                break;
            default:
                throw new IOException("Unknown HTTP method");
        }

        if (this.useAuthorization) {
            String basicAuth = "Basic " + new String(Base64.encodeBase64((USER_NAME + ":" + USER_PASSWORD).getBytes()));
            requestBuilder.addHeader(HttpHeaders.AUTHORIZATION, basicAuth);
        }

        requestBuilder.addHeader("Accept", httpAccept.getMimeType());

        if (this.sessionToken != null) {
            requestBuilder.addHeader("Token", this.sessionToken.getToken());
        }

        if (httpEntity != null) {
            requestBuilder.setEntity(httpEntity);
        }

        return requestBuilder.build();
    }

    /**
     * Executes the HTTP request
     *
     * @param httpUriRequest HTTP URI request
     * @param isFile         true = store response as file
     * @param type           class name for response
     * @param <T>            class for response
     * @return response object
     * @throws IOException   if HTTP entity should be save as file
     * @throws JAXBException if HTTP entity can't be parsed by JAXB
     */
    <T> T executeRequest(HttpUriRequest httpUriRequest, boolean isFile, Class<T> type) throws IOException, JAXBException {

        try (CloseableHttpResponse closeableHttpResponse = this.closeableHttpClient.execute(httpUriRequest)) {

            checkResponse(closeableHttpResponse);

            HttpEntity httpEntity = closeableHttpResponse.getEntity();
            if (isFile) {
                FileOutputStream fos = new FileOutputStream(this.targetFile);
                httpEntity.writeTo(fos);
                fos.close();
                return null;
            }

            if (type == null || httpEntity.getContent().available() <= 0) {
                return null;
            }

            return this.httpAccept.equals(HttpAccept.XML)
                    ? WebserviceHelper.fromXML(httpEntity, type)
                    : WebserviceHelper.fromJSON(httpEntity, type);
        }
    }

    /**
     * Login into the server and get a token
     *
     * @throws IOException        HTTP access error
     * @throws JAXBException      JAXB parse error
     * @throws URISyntaxException invalid REST URL
     */
    private void login() throws IOException, JAXBException, URISyntaxException {
        HttpUriRequest httpUriRequest = getRequest(HttpMethod.GET, this.httpAccept, "/rest/authentication/user/login", null);
        this.sessionToken = executeRequest(httpUriRequest, false, SessionToken.class);
    }

    /**
     * Logout from the server
     *
     * @throws IOException        HTTP access error
     * @throws JAXBException      JAXB parse error
     * @throws URISyntaxException invalid REST URL
     */
    private void logout() throws IOException, JAXBException, URISyntaxException {
        HttpUriRequest httpUriRequest = getRequest(HttpMethod.GET, this.httpAccept, "/rest/authentication/user/logout", null);
        executeRequest(httpUriRequest, false, null);
    }

    /**
     * Upload the file to the server and get a ID for the file
     *
     * @throws IOException        HTTP access error
     * @throws JAXBException      JAXB parse error
     * @throws URISyntaxException invalid REST URL
     */
    private void upload() throws IOException, JAXBException, URISyntaxException {
        FileBody uploadBody = new FileBody(new File(this.contentURL.toURI()));
        HttpEntity uploadEntity = MultipartEntityBuilder.create().addPart("filedata", uploadBody).build();

        HttpUriRequest httpUriRequest = getRequest(HttpMethod.POST, this.httpAccept, "/rest/documents", uploadEntity);
        this.documentFile = executeRequest(httpUriRequest, false, DocumentFile.class);
    }

    /**
     * Download file from server
     *
     * @throws IOException        HTTP access error
     * @throws JAXBException      JAXB parse error
     * @throws URISyntaxException invalid REST URL
     */
    private void download() throws IOException, JAXBException, URISyntaxException {
        HttpUriRequest httpUriRequest = getRequest(HttpMethod.GET, HttpAccept.OCTET,
                "/rest/documents/" + this.documentFile.getDocumentId(), null);
        executeRequest(httpUriRequest, true, null);
    }

    /**
     * Calls the 'execute' method of the web service.
     */
    protected abstract void executeService() throws JAXBException, IOException, URISyntaxException;

    /**
     * Execute all operations
     *
     * @param targetFile output file
     * @throws IOException        HTTP access error
     * @throws JAXBException      JAXB parse error
     * @throws URISyntaxException invalid REST URL
     */
    @Override
    public void execute(File targetFile) throws IOException, JAXBException, URISyntaxException {

        this.targetFile = targetFile;

        // login and get a token
        login();

        // valid token?
        if (this.sessionToken == null) {
            throw new IOException("Unable to login");
        }

        System.out.println("Login successful with token " + this.sessionToken.getToken());

        // upload file to server
        if (this.contentURL.toURI().getScheme().startsWith("file")) {
            upload();

            if (this.documentFile == null) {
                throw new IOException("Unable to upload file");
            }

            System.out.println("Document uploaded with id " + this.documentFile.getDocumentId());
        }

        // call the 'execute' method of the Webservice
        executeService();

        // download the file from server and store it on disk
        download();

        // logout from the server
        logout();

        System.out.println("Logout successful");
    }
}
