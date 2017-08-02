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

public class BarcodeWebservice extends AbstractWebservice {

    public BarcodeWebservice(URL serverURL, URI sourceFile, HttpAccept httpAccept) throws IOException {
        super(serverURL, sourceFile, httpAccept);
    }

    @Override
    protected void executeService() throws JAXBException, IOException, URISyntaxException {

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
        operation.getBarcode().getAdd().getAztecOrCodabarOrCode128().add(qrBarcodeType);

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

        operation.getBarcode().getAdd().getAztecOrCodabarOrCode128().add(ean8BarcodeType);

        String request = this.httpAccept.equals(HttpAccept.XML)
                ? WebserviceHelper.toXML(operation, Operation.class)
                : WebserviceHelper.toJSON(operation);

        StringEntity convertEntity = new StringEntity(request);
        convertEntity.setContentType(this.httpAccept.getMimeType());

        HttpUriRequest httpUriRequest = getRequest(HttpMethod.POST, this.httpAccept,
                "/rest/barcode/" + this.documentFile.getDocumentId(), convertEntity);

        this.documentFile = executeRequest(httpUriRequest, false, DocumentFile.class);
        System.out.println("Barcodes applied: " + documentFile.getDocumentId());
    }
}
