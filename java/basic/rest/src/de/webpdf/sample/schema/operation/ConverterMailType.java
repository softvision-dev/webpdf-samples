
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConverterMailType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConverterMailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="downloadImages" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="adjustFonts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="attachmentMode" type="{http://schema.webpdf.de/1.0/operation}AttachmentModeType" default="embed" /&gt;
 *       &lt;attribute name="ignoreMissingBodyChunk" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Ruft den Wert der downloadImages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDownloadImages() {
        if (downloadImages == null) {
            return false;
        } else {
            return downloadImages;
        }
    }

    /**
     * Legt den Wert der downloadImages-Eigenschaft fest.
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
     * Ruft den Wert der adjustFonts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdjustFonts() {
        if (adjustFonts == null) {
            return false;
        } else {
            return adjustFonts;
        }
    }

    /**
     * Legt den Wert der adjustFonts-Eigenschaft fest.
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
     * Ruft den Wert der attachmentMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentModeType }
     *     
     */
    public AttachmentModeType getAttachmentMode() {
        if (attachmentMode == null) {
            return AttachmentModeType.EMBED;
        } else {
            return attachmentMode;
        }
    }

    /**
     * Legt den Wert der attachmentMode-Eigenschaft fest.
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
     * Ruft den Wert der ignoreMissingBodyChunk-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreMissingBodyChunk() {
        if (ignoreMissingBodyChunk == null) {
            return false;
        } else {
            return ignoreMissingBodyChunk;
        }
    }

    /**
     * Legt den Wert der ignoreMissingBodyChunk-Eigenschaft fest.
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
