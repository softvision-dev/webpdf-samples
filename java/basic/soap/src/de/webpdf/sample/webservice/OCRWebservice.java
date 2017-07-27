package de.webpdf.sample.webservice;

import de.webpdf.sample.stubs.ocr.*;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class OCRWebservice extends AbstractWebservice<OCRService, OCR> {

    public OCRWebservice(URL serverURL, URI sourceFile) throws IOException {
        super(serverURL, sourceFile);
    }

    @Override
    void initialize() throws IOException {
        URL url = new URL(this.serverURL.toString() + "/webPDF/soap/ocr?wsdl");
        QName qName = new QName("http://schema.webpdf.de/1.0/soap/ocr", "OCRService");
        this.service = new OCRService(url, qName);
        this.port = this.service.getOCRPort(this.mtomFeature);
    }

    @Override
    void executeService() {

        // build the parameter for the operation
        Operation operation = new Operation();
        operation.setOcr(new OcrType());
        operation.getOcr().setLanguage(OcrLanguageType.ENG);
        operation.getOcr().setOutputFormat(OcrOutputType.PDF);
        operation.getOcr().setCheckResolution(false);
        operation.getOcr().setForceEachPage(true);
        operation.getOcr().setImageDpi(300);
        // set OcrPageType
        operation.getOcr().setPage(new OcrPageType());
        operation.getOcr().getPage().setHeight(297);
        operation.getOcr().getPage().setWidth(210);
        operation.getOcr().getPage().setMetrics(MetricsType.MM);

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
