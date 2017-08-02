package de.webpdf.sample.webservice;

import de.webpdf.sample.helper.HttpAccept;
import de.webpdf.sample.helper.HttpMethod;
import de.webpdf.sample.helper.WebserviceHelper;
import de.webpdf.sample.schema.beans.DocumentFile;
import de.webpdf.sample.schema.operation.*;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class OcrWebservice extends AbstractWebservice {

    public OcrWebservice(URL serverURL, URI sourceFile, HttpAccept httpAccept) throws IOException {
        super(serverURL, sourceFile, httpAccept);
    }

    @Override
    protected void executeService() throws JAXBException, IOException, URISyntaxException {

        // build the parameter for the operation
        Operation operation = new Operation();
        operation.setOcr(new OcrType());
        operation.getOcr().setLanguage(OcrLanguageType.ENG);
        operation.getOcr().setOutputFormat(OcrOutputType.PDF);
        operation.getOcr().setCheckResolution(false);
        operation.getOcr().setImageDpi(200);

        // set page size to A5
        operation.getOcr().setPage(new OcrPageType());
        operation.getOcr().getPage().setHeight(210);
        operation.getOcr().getPage().setWidth(148);
        operation.getOcr().getPage().setMetrics(MetricsType.MM);

        String request = this.httpAccept.equals(HttpAccept.XML)
                ? WebserviceHelper.toXML(operation, Operation.class)
                : WebserviceHelper.toJSON(operation);

        StringEntity convertEntity = new StringEntity(request);
        convertEntity.setContentType(this.httpAccept.getMimeType());

        HttpUriRequest httpUriRequest = getRequest(HttpMethod.POST, this.httpAccept,
                "/rest/ocr/" + this.documentFile.getDocumentId(), convertEntity);

        this.documentFile = executeRequest(httpUriRequest, false, DocumentFile.class);
        System.out.println("OCR successful executed: " + documentFile.getDocumentId());
    }

}
