package de.webpdf.sample.webservice;

import de.webpdf.sample.helper.HttpAccept;
import de.webpdf.sample.helper.HttpMethod;
import de.webpdf.sample.helper.WebserviceHelper;
import de.webpdf.sample.schema.beans.DocumentFile;
import de.webpdf.sample.schema.operation.ConverterType;
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

public class ConverterWebservice extends AbstractWebservice {

    public ConverterWebservice(URL serverURL, URI sourceFile, HttpAccept httpAccept) throws IOException {
        super(serverURL, sourceFile, httpAccept);
    }

    @Override
    public void executeService() throws JAXBException, IOException, URISyntaxException {

        // build the parameter for the operation
        Operation operation = new Operation();
        operation.setConverter(new ConverterType());

        operation.getConverter().setPages("1-5");
        operation.getConverter().setEmbedFonts(true);

        operation.getConverter().setPdfa(new PdfaType());

        operation.getConverter().getPdfa().setConvert(new PdfaType.Convert());
        operation.getConverter().getPdfa().getConvert().setLevel("3b");
        operation.getConverter().getPdfa().getConvert().setErrorReport(PdfaErrorReportType.MESSAGE);

        String request = this.httpAccept.equals(HttpAccept.XML)
                ? WebserviceHelper.toXML(operation, Operation.class)
                : WebserviceHelper.toJSON(operation);

        StringEntity convertEntity = new StringEntity(request);
        convertEntity.setContentType(this.httpAccept.getMimeType());

        HttpUriRequest httpUriRequest = getRequest(HttpMethod.POST, this.httpAccept,
                "/rest/converter/" + this.documentFile.getDocumentId(), convertEntity);

        this.documentFile = executeRequest(httpUriRequest, false, DocumentFile.class);
        System.out.println("Conversion successful: " + documentFile.getDocumentId());
    }
}
