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
        operation.getSignature().getAdd().setContact("John Doe");
        operation.getSignature().getAdd().setKeyName("Generic self-signed certificate");

        // set signature parameters
        operation.getSignature().getAdd().setAppearance(new SignatureType.Add.Appearance());
        operation.getSignature().getAdd().getAppearance().setPage(1);
        operation.getSignature().getAdd().getAppearance().setName("John Doe, Company");

        SignatureIdentifierType signatureIdentifierType = new SignatureIdentifierType();
        signatureIdentifierType.setShowCommonName(true);
        signatureIdentifierType.setShowOrganisationName(false);
        signatureIdentifierType.setShowSignedBy(true);
        signatureIdentifierType.setShowCountry(false);
        signatureIdentifierType.setShowMail(false);
        signatureIdentifierType.setShowOrganisationUnit(false);
        operation.getSignature().getAdd().getAppearance().setIdentifierElements(signatureIdentifierType);

        // set signature position and size
        SignaturePositionType signaturePositionType = new SignaturePositionType();
        signaturePositionType.setX(5.0f);
        signaturePositionType.setY(5.0f);
        signaturePositionType.setWidth(80.0f);
        signaturePositionType.setHeight(15.0f);
        operation.getSignature().getAdd().getAppearance().setPosition(signaturePositionType);

        SignatureImageType signatureImageType = new SignatureImageType();
        signatureImageType.setPosition(SignatureImagePositionType.LEFT);

        // set image for signature
        try {
            signatureImageType.setData(Files.readAllBytes(Paths.get("./files/logo.png")));
            operation.getSignature().getAdd().getAppearance().setImage(signatureImageType);
        } catch (IOException ex) {
            System.out.println("Unable to add image to signature: " + ex.getMessage());
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
