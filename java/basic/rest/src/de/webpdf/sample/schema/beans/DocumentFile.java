package de.webpdf.sample.schema.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DocumentFile {

    private String documentId;

    public String getDocumentId() {
        return documentId;
    }

    @XmlElement(name = "documentId")
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

}
