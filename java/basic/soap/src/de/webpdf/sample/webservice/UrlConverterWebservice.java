package de.webpdf.sample.webservice;

import de.webpdf.sample.stubs.urlconverter.*;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class UrlConverterWebservice extends AbstractWebservice<URLConverterService, URLConverter> {

    public UrlConverterWebservice(URL baseURL, URI sourceURL) throws IOException {
        super(baseURL, sourceURL);
    }

    @Override
    void initialize() throws IOException {
        URL url = new URL(this.serverURL.toString() + "/webPDF/soap/urlconverter?wsdl");
        QName qname = new QName("http://schema.webpdf.de/1.0/soap/urlconverter", "URLConverterService");
        this.service = new URLConverterService(url, qname);
        this.port = service.getURLConverterPort(this.mtomFeature);
    }

    @Override
    void executeService() {

        // build the parameter for the operation
        Operation operation = new Operation();
        operation.setUrlconverter(new UrlConverterType());
        operation.getUrlconverter().setUrl(this.contentURL.toString());

        // execute web service
        try {
            this.result = this.port.execute(operation);
        } catch (WebserviceException ex) {
            System.out.println("Code: " + ex.getFaultInfo().getErrorCode());
            System.out.println("Message: " + ex.getFaultInfo().getErrorMessage());
            System.out.println("Stack trace: " + ex.getFaultInfo().getStackTrace());
        }
    }
}
