package de.webpdf.sample.webservice;

import de.webpdf.sample.stubs.signature.*;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SignatureWebservice extends AbstractWebservice<SignatureService, Signature> {


    public SignatureWebservice(URL serverURL, URI sourceFile) throws IOException {
        super(serverURL, sourceFile);
    }


    @Override
    void initialize() throws IOException {
        URL url = new URL(this.serverURL.toString() + "/webPDF/soap/signature?wsdl");
        QName qName = new QName("http://schema.webpdf.de/1.0/soap/signature", "SignatureService");
        this.service = new SignatureService(url, qName);
        this.port = this.service.getSignaturePort(this.mtomFeature);
    }

    @Override
    void executeService() {

        // build the parameter for the operation
        Operation operation = new Operation();
        operation.setSignature(new SignatureType());
        operation.getSignature().setAdd(new SignatureType.Add());

        operation.getSignature().getAdd().setCertificationLevel(CertificationLevelType.NO_CHANGES);
        operation.getSignature().getAdd().setContact("John Doe Company");
        operation.getSignature().getAdd().setKeyName("Generic self-signed certificate");

        // set appearance parameters
        operation.getSignature().getAdd().setAppearance(new SignatureType.Add.Appearance());
        operation.getSignature().getAdd().getAppearance().setPage(1);
        operation.getSignature().getAdd().getAppearance().setName("John Doe");

        SignatureIdentifierType signatureIdentifierType = new SignatureIdentifierType();
        signatureIdentifierType.setShowCommonName(true);
        signatureIdentifierType.setShowOrganisationName(true);
        signatureIdentifierType.setShowSignedBy(true);
        operation.getSignature().getAdd().getAppearance().setIdentifierElements(signatureIdentifierType);

        SignaturePositionType signaturePositionType = new SignaturePositionType();
        signaturePositionType.setX(5.0F);
        signaturePositionType.setY(5.0F);
        signaturePositionType.setWidth(50.0F);
        signaturePositionType.setHeight(50.0F);
        operation.getSignature().getAdd().getAppearance().setPosition(signaturePositionType);

        // set image for signature
        try {
            SignatureImageType signatureImageType = new SignatureImageType();
            signatureImageType.setData(Files.readAllBytes(Paths.get("./files/logo.png")));
            operation.getSignature().getAdd().getAppearance().setImage(signatureImageType);
        } catch (IOException ex) {
            System.out.println(String.format("Unable to add %s to parameter data!", SignatureImageType.class.getSimpleName()));
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
