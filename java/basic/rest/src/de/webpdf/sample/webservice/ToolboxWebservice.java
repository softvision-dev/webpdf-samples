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
import java.nio.file.Files;
import java.nio.file.Paths;

public class ToolboxWebservice extends AbstractWebservice {

    public ToolboxWebservice(URL serverURL, URI sourceFile, HttpAccept httpAccept) throws IOException {
        super(serverURL, sourceFile, httpAccept);
    }

    @Override
    protected void executeService() throws JAXBException, IOException, URISyntaxException {

        // build the parameter for the operation
        Operation operation = new Operation();

        MergeType mergeType = new MergeType();
        mergeType.setPage(1);
        mergeType.setSourceIsZip(false);
        mergeType.setMode(MergeModeType.AFTER_PAGE);

        // set merge file data
        mergeType.setData(new MergeFileDataType());
        mergeType.getData().setFormat(FileDataFormatType.PDF);

        try {
            mergeType.getData().setValue(Files.readAllBytes(Paths.get("./files/merge.pdf")));
        } catch (IOException ex) {
            System.out.println("Unable to add merge file data to params: " + ex.getMessage());
        }

        // add merge operation to the toolbox operation list
        operation.getAnnotationOrAttachmentOrDelete().add(mergeType);

        // add rotate operation to the toolbox operation list
        RotateType rotateType = new RotateType();
        rotateType.setPages("1-5");
        rotateType.setDegrees(90);
        operation.getAnnotationOrAttachmentOrDelete().add(rotateType);

        // add rotate operation to the toolbox operation list
        DeleteType deleteType = new DeleteType();
        deleteType.setPages("5-8");
        operation.getAnnotationOrAttachmentOrDelete().add(deleteType);

        String request = this.httpAccept.equals(HttpAccept.XML)
                ? WebserviceHelper.toXML(operation, Operation.class)
                : WebserviceHelper.toJSON(operation);

        StringEntity convertEntity = new StringEntity(request);
        convertEntity.setContentType(this.httpAccept.getMimeType());

        HttpUriRequest httpUriRequest = getRequest(HttpMethod.POST, this.httpAccept,
                "/rest/toolbox/" + this.documentFile.getDocumentId(), convertEntity);

        this.documentFile = executeRequest(httpUriRequest, false, DocumentFile.class);
        System.out.println("Toolbox operations applied: " + documentFile.getDocumentId());
    }

}
