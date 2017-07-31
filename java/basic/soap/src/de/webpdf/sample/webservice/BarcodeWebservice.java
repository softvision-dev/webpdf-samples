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

        operation.setBarcode(new BarcodeType());
        operation.getBarcode().setAdd(new BarcodeType.Add());

        // build a desired barcode type
        QrBarcodeType qrBarcodeType = new QrBarcodeType();

        // set the position and the size for the barcode type
        RectangleType position = new RectangleType();
        position.setX(2.0f);
        position.setY(2.0f);
        position.setHeight(20.0f);
        position.setWidth(20.0f);

        qrBarcodeType.setPosition(position);
        qrBarcodeType.setPages("1-3");

        // set the barcode content value
        qrBarcodeType.setValue("https://www.webpdf.de");

        // add barcode type
        operation.getBarcode().getAdd().getQrcode().add(qrBarcodeType);

        // create a second barcode (EAN8)
        Ean8BarcodeType ean8BarcodeType = new Ean8BarcodeType();
        position = new RectangleType();
        position.setX(190.0f);
        position.setY(2.0f);
        position.setHeight(40.0f);
        position.setWidth(10.0f);
        ean8BarcodeType.setPosition(position);

        ean8BarcodeType.setValue("90311017");
        ean8BarcodeType.setPages("*");
        ean8BarcodeType.setRotation(90);

        operation.getBarcode().getAdd().getEan8().add(ean8BarcodeType);

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
