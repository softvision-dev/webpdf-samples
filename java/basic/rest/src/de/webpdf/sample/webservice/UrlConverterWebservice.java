package de.webpdf.sample.webservice;

import de.webpdf.sample.helper.HttpAccept;
import de.webpdf.sample.helper.HttpMethod;
import de.webpdf.sample.helper.WebserviceHelper;
import de.webpdf.sample.schema.beans.DocumentFile;
import de.webpdf.sample.schema.operation.Operation;
import de.webpdf.sample.schema.operation.PageType;
import de.webpdf.sample.schema.operation.UrlConverterType;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UrlConverterWebservice extends AbstractWebservice {

    public UrlConverterWebservice(URL serverURL, URI sourceFile, HttpAccept httpAccept) throws IOException {
        super(serverURL, sourceFile, httpAccept);
    }

    @Override
    protected void executeService() throws JAXBException, IOException, URISyntaxException {

        // build the parameter for the operation
        Operation operation = new Operation();
        operation.setUrlconverter(new UrlConverterType());
        operation.getUrlconverter().setUrl(this.contentURL.toString());

        operation.getUrlconverter().setPage(new PageType());
        operation.getUrlconverter().getPage().setWidth(150);
        operation.getUrlconverter().getPage().setHeight(200);
        operation.getUrlconverter().getPage().setTop(0);
        operation.getUrlconverter().getPage().setLeft(0);
        operation.getUrlconverter().getPage().setRight(0);
        operation.getUrlconverter().getPage().setBottom(0);

        String request = this.httpAccept.equals(HttpAccept.XML)
                ? WebserviceHelper.toXML(operation, Operation.class)
                : WebserviceHelper.toJSON(operation);

        StringEntity convertEntity = new StringEntity(request);
        convertEntity.setContentType(this.httpAccept.getMimeType());

        HttpUriRequest httpUriRequest = getRequest(HttpMethod.POST, this.httpAccept,
                "/rest/urlconverter/", convertEntity);

        this.documentFile = executeRequest(httpUriRequest, false, DocumentFile.class);
        System.out.println("Conversion successful: " + documentFile.getDocumentId());
    }
}

