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

public class SignatureWebservice extends AbstractWebservice {

    public SignatureWebservice(URL serverURL, URI sourceFile, HttpAccept httpAccept) throws IOException {
        super(serverURL, sourceFile, httpAccept);
    }

    @Override
    protected void executeService() throws JAXBException, IOException, URISyntaxException {

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
            SignatureFileDataType signatureFileDataType = new SignatureFileDataType();
            signatureFileDataType.setValue(Files.readAllBytes(Paths.get("./files/logo.png")));
            signatureImageType.setData(signatureFileDataType);
            operation.getSignature().getAdd().getAppearance().setImage(signatureImageType);
        } catch (IOException ex) {
            System.out.println("Unable to add image to signature: " + ex.getMessage());
        }

        String request = this.httpAccept.equals(HttpAccept.XML)
                ? WebserviceHelper.toXML(operation, Operation.class)
                : WebserviceHelper.toJSON(operation);

        StringEntity convertEntity = new StringEntity(request);
        convertEntity.setContentType(this.httpAccept.getMimeType());

        HttpUriRequest httpUriRequest = getRequest(HttpMethod.POST, this.httpAccept,
                "/rest/signature/" + this.documentFile.getDocumentId(), convertEntity);

        this.documentFile = executeRequest(httpUriRequest, false, DocumentFile.class);
        System.out.println("Signature successful applied: " + documentFile.getDocumentId());
    }

}
