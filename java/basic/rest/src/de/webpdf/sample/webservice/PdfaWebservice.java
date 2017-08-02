package de.webpdf.sample.webservice;

import de.webpdf.sample.helper.HttpAccept;
import de.webpdf.sample.helper.HttpMethod;
import de.webpdf.sample.helper.WebserviceHelper;
import de.webpdf.sample.schema.beans.DocumentFile;
import de.webpdf.sample.schema.operation.BillingType;
import de.webpdf.sample.schema.operation.Operation;
import de.webpdf.sample.schema.operation.PdfaErrorReportType;
import de.webpdf.sample.schema.operation.PdfaType;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class PdfaWebservice extends AbstractWebservice {

    public PdfaWebservice(URL serverURL, URI sourceFile, HttpAccept httpAccept) throws IOException {
        super(serverURL, sourceFile, httpAccept);
    }

    @Override
    protected void executeService() throws JAXBException, IOException, URISyntaxException {

        // build the parameter for the operation
        Operation operation = new Operation();
        operation.setPdfa(new PdfaType());
        operation.getPdfa().setConvert(new PdfaType.Convert());
        operation.getPdfa().getConvert().setLevel("3b");
        operation.getPdfa().getConvert().setErrorReport(PdfaErrorReportType.MESSAGE);
        operation.getPdfa().getConvert().setImageQuality(90);

        // set some additional information
        operation.setBilling(new BillingType());
        operation.getBilling().setUserName("John Doe");
        operation.getBilling().setApplicationName("webPDF Sample Application");
        operation.getBilling().setCustomerCode("ABC123");

        String request = this.httpAccept.equals(HttpAccept.XML)
                ? WebserviceHelper.toXML(operation, Operation.class)
                : WebserviceHelper.toJSON(operation);

        StringEntity convertEntity = new StringEntity(request);
        convertEntity.setContentType(this.httpAccept.getMimeType());

        HttpUriRequest httpUriRequest = getRequest(HttpMethod.POST, this.httpAccept,
                "/rest/pdfa/" + this.documentFile.getDocumentId(), convertEntity);

        this.documentFile = executeRequest(httpUriRequest, false, DocumentFile.class);
        System.out.println("PDF/A conversion successful: " + documentFile.getDocumentId());
    }

}
