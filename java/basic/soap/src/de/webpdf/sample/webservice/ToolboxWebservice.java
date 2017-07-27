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

        mergeType.setPage(2);
        mergeType.setSourceIsZip(false);

        // set merge file data
        mergeType.setData(new MergeFileDataType());
        mergeType.getData().setFormat(FileDataFormatType.PDF);

        // add merge type as one operation to the toolbox operation list
        operation.getAnnotationOrAttachmentOrDelete().add(mergeType);
        try {
            mergeType.getData().setValue(Files.readAllBytes(Paths.get("./files/lorem-ipsum.pdf")));
        } catch (IOException ex) {
            System.out.println("Unable to add merge file data to params!");
            System.out.println(ex.getMessage());
        }

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
