package de.webpdf.sample.webservice;

import de.webpdf.sample.stubs.pdfa.*;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class PdfaWebservice extends AbstractWebservice<PdfaService, Pdfa> {

    public PdfaWebservice(URL serverURL, URI sourceFile) throws IOException {
        super(serverURL, sourceFile);

    }

    @Override
    void initialize() throws IOException {
        URL url = new URL(this.serverURL + "/webPDF/soap/pdfa?wsdl");
        QName qName = new QName("http://schema.webpdf.de/1.0/soap/pdfa", "PdfaService");
        this.service = new PdfaService(url, qName);
        this.port = this.service.getPdfaPort(this.mtomFeature);
    }

    @Override
    void executeService() {

        // build the parameter for the operation
        Operation operation = new Operation();
        operation.setPdfa(new PdfaType());
        operation.getPdfa().setConvert(new PdfaType.Convert());
        operation.getPdfa().getConvert().setLevel("1b");
        operation.getPdfa().getConvert().setErrorReport(PdfaErrorReportType.MESSAGE);
        operation.getPdfa().getConvert().setImageQuality(100);

        // set some additional information
        operation.setBilling(new BillingType());
        operation.getBilling().setUserName("John Doe");
        operation.getBilling().setApplicationName("webPDF Sample Application");
        operation.getBilling().setCustomerCode("ABC123");

        // execute web service
        try {
            this.result = this.port.execute(
                    operation,
                    this.useDataHandler ? this.contentDataHandler : null,
                    this.useDataHandler ? null : this.contentURL.toString());
        } catch (WebserviceException ex) {
            System.out.println("Code: " + ex.getFaultInfo().getErrorCode());
            System.out.println("Message: " + ex.getFaultInfo().getErrorMessage());
            System.out.println("Stack trace: " + ex.getFaultInfo().getStackTrace());
        }

    }


}
