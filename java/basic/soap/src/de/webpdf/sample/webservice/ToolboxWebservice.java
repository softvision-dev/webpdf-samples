package de.webpdf.sample.webservice;

import de.webpdf.sample.stubs.toolbox.*;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ToolboxWebservice extends AbstractWebservice<ToolboxService, Toolbox> {

    public ToolboxWebservice(URL serverURL, URI sourceFile) throws IOException {
        super(serverURL, sourceFile);
    }

    @Override
    void initialize() throws IOException {
        URL url = new URL(this.serverURL.toString() + "/webPDF/soap/toolbox?wsdl");
        QName qName = new QName("http://schema.webpdf.de/1.0/soap/toolbox", "ToolboxService");
        this.service = new ToolboxService(url, qName);
        this.port = this.service.getToolboxPort(this.mtomFeature);
    }

    @Override
    void executeService() {

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
