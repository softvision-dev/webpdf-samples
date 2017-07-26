
package de.webpdf.sample.stubs.converter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterMailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterMailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="downloadImages" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="adjustFonts" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="attachmentMode" type="{http://schema.webpdf.de/1.0/operation}AttachmentModeType" />
 *       &lt;attribute name="ignoreMissingBodyChunk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterMailType")
public class ConverterMailType {

    @XmlAttribute(name = "downloadImages")
    protected Boolean downloadImages;
    @XmlAttribute(name = "adjustFonts")
    protected Boolean adjustFonts;
    @XmlAttribute(name = "attachmentMode")
    protected AttachmentModeType attachmentMode;
    @XmlAttribute(name = "ignoreMissingBodyChunk")
    protected Boolean ignoreMissingBodyChunk;

    /**
     * Gets the value of the downloadImages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownloadImages() {
        return downloadImages;
    }

    /**
     * Sets the value of the downloadImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownloadImages(Boolean value) {
        this.downloadImages = value;
    }

    /**
     * Gets the value of the adjustFonts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustFonts() {
        return adjustFonts;
    }

    /**
     * Sets the value of the adjustFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustFonts(Boolean value) {
        this.adjustFonts = value;
    }

    /**
     * Gets the value of the attachmentMode property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentModeType }
     *     
     */
    public AttachmentModeType getAttachmentMode() {
        return attachmentMode;
    }

    /**
     * Sets the value of the attachmentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentModeType }
     *     
     */
    public void setAttachmentMode(AttachmentModeType value) {
        this.attachmentMode = value;
    }

    /**
     * Gets the value of the ignoreMissingBodyChunk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreMissingBodyChunk() {
        return ignoreMissingBodyChunk;
    }

    /**
     * Sets the value of the ignoreMissingBodyChunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreMissingBodyChunk(Boolean value) {
        this.ignoreMissingBodyChunk = value;
    }

}
