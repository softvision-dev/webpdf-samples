package de.webpdf.sample.webservice;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.xml.bind.DatatypeConverter;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.MTOMFeature;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Authenticator;
import java.net.URI;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implements a base wrapper for all web services
 *
 * @param <T_Service> type of service
 * @param <T_Port>    port of the service
 */
public abstract class AbstractWebservice<T_Service, T_Port> implements Webservice {

    private static final String USER_NAME = "admin";
    private static final String USER_PASSWORD = "admin";
    MTOMFeature mtomFeature = new MTOMFeature(true);
    T_Service service;
    T_Port port;
    URL serverURL;
    DataHandler result = null;
    boolean useDataHandler = true;
    URL contentURL;
    DataHandler contentDataHandler;
    private boolean useAuthorization = false;
    private boolean isServerProtected = false;

    /**
     * Initialize the web service wrapper
     *
     * @param serverURL  base URL of the webPDF server
     * @param sourceFile source file to use for web service call
     * @throws IOException source file
     */
    AbstractWebservice(URL serverURL, URI sourceFile) throws IOException {
        this.serverURL = serverURL;
        this.contentURL = sourceFile.toURL();
        if (sourceFile.getScheme().startsWith("file")) {
            this.contentDataHandler = new DataHandler(new FileDataSource(new File(sourceFile)));
        }
    }

    /**
     * Builds the parameter for the web service and calls the 'execute' method of the web service.
     */
    abstract void executeService();

    /**
     * Initializes the web service (builds the URL and get the service and port)
     *
     * @throws IOException initialization error
     */
    abstract void initialize() throws IOException;

    @Override
    public void execute(File targetFile) throws IOException {

        // if the server access is protected, use a default authenticator (e.g. for WSDL access)
        if (isServerProtected) {
            // auth for server
            Authenticator.setDefault(new WebserviceAuthenticator(USER_NAME, USER_PASSWORD));
        }

        // initialize the web service
        initialize();

        // add authorization header to the web service request
        if (this.useAuthorization) {
            addAuthorizationHeader();
        }

        // executes the web service
        executeService();

        // save the web service result to file
        if (this.result != null) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(targetFile)) {
                this.result.writeTo(fileOutputStream);
            }
        }
    }

    /**
     * Adds a authorization header to the web service request
     */
    private void addAuthorizationHeader() {
        BindingProvider bindingProvider = (BindingProvider) this.port;
        String basicAuth = "Basic " + DatatypeConverter.printBase64Binary((USER_NAME + ":" + USER_PASSWORD).getBytes());
        Map<String, List<String>> headers = new HashMap<>();
        headers.put("Authorization", Collections.singletonList(basicAuth));
        Map<String, Object> requestContext = bindingProvider.getRequestContext();
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
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
     * Sets the server protection. If the server uses a 'security constraint', then a server
     * authentication is required. Otherwise even the WSDL cannot be fetched from the server.
     *
     * @param serverProtected true = server uses a 'security constraint'
     */
    public void setServerProtected(boolean serverProtected) {
        isServerProtected = serverProtected;
    }
}
