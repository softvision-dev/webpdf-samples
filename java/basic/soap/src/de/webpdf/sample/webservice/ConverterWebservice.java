package de.webpdf.sample.webservice;

import de.webpdf.sample.stubs.converter.*;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class ConverterWebservice extends AbstractWebservice<ConverterService, Converter> {

    public ConverterWebservice(URL baseURL, URI sourceFile) throws IOException {
        super(baseURL, sourceFile);
    }

    @Override
    void initialize() throws IOException {
        URL url = new URL(this.serverURL.toString() + "/webPDF/soap/converter?wsdl");
        QName qname = new QName("http://schema.webpdf.de/1.0/soap/converter", "ConverterService");
        this.service = new ConverterService(url, qname);
        this.port = service.getConverterPort(this.mtomFeature);
    }

    @Override
    public void executeService() {

        // build the parameter for the operation
        Operation operation = new Operation();
        operation.setConverter(new ConverterType());
        operation.getConverter().setEmbedFonts(true);
        operation.getConverter().setCompression(true);
        operation.getConverter().setPages("1-5,10");

        // call the PDF/A conversion after document conversion
        operation.getConverter().setPdfa(new PdfaType());
        operation.getConverter().getPdfa().setConvert(new PdfaType.Convert());
        operation.getConverter().getPdfa().getConvert().setLevel("3b");

        // set some additional information
        operation.setBilling(new BillingType());
        operation.getBilling().setUserName("John Doe");
        operation.getBilling().setApplicationName("webPDF Sample Application");
        operation.getBilling().setCustomerCode("ABC123");

        // execute web service
        try {
            if (this.useDataHandler) {
                this.result = this.port.execute(
                        operation,
                        this.useDataHandler ? this.contentDataHandler : null,
                        this.useDataHandler ? null : this.contentURL.toString());
            }
        } catch (WebserviceException ex) {
            System.out.println("Code: " + ex.getFaultInfo().getErrorCode());
            System.out.println("Message: " + ex.getFaultInfo().getErrorMessage());
            System.out.println("Stack trace: " + ex.getFaultInfo().getStackTrace());
        }
    }
}
