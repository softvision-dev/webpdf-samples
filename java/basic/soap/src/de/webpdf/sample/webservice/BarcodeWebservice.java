package de.webpdf.sample.webservice;

import de.webpdf.sample.stubs.barcode.*;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class BarcodeWebservice extends AbstractWebservice<BarcodeService, Barcode> {

    public BarcodeWebservice(URL serverURL, URI sourceFile) throws IOException {
        super(serverURL, sourceFile);
    }

    @Override
    void initialize() throws IOException {
        URL url = new URL(this.serverURL.toString() + "/webPDF/soap/barcode?wsdl");
        QName qname = new QName("http://schema.webpdf.de/1.0/soap/barcode", "BarcodeService");
        this.service = new BarcodeService(url, qname);
        this.port = this.service.getBarcodePort(this.mtomFeature);
    }

    @Override
    void executeService() {

        // build the parameter for the operation
        Operation operation = new Operation();

        BarcodeType barcodeType = new BarcodeType();
        BarcodeType.Add add = new BarcodeType.Add();
        // build an desired barcode type
        AztecBarcodeType aztecBarcodeType = new AztecBarcodeType();
        // set the position and the size for the barcode type
        RectangleType position = new RectangleType();
        position.setX(5.0F);
        position.setY(5.0F);
        position.setHeight(23.0F);
        position.setWidth(23.0F);
        aztecBarcodeType.setPosition(position);
        // set the barcode content value
        aztecBarcodeType.setValue("https://www.webpdf.de");
        // set the page for the barcode type
        aztecBarcodeType.setPages("1");
        // add barcode type(aztec) to aztec barcode types
        add.getAztec().add(aztecBarcodeType);
        barcodeType.setAdd(add);

        operation.setBarcode(barcodeType);

        // execute web service
        try {
            this.result = this.port.execute(operation,
                    this.useDataHandler ? this.contentDataHandler : null,
                    this.useDataHandler ? null : this.contentURL.toString());
        } catch (WebserviceException ex) {
            System.out.println("Code: " + ex.getFaultInfo().getErrorCode());
            System.out.println("Message: " + ex.getFaultInfo().getErrorMessage());
            System.out.println("Stack trace: " + ex.getFaultInfo().getStackTrace());
        }

    }


}
