
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConverterHtmlType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConverterHtmlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="downloadImages" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="adjustFonts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="baseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterHtmlType")
public class ConverterHtmlType {

    @XmlAttribute(name = "downloadImages")
    protected Boolean downloadImages;
    @XmlAttribute(name = "adjustFonts")
    protected Boolean adjustFonts;
    @XmlAttribute(name = "baseURL")
    @XmlSchemaType(name = "anyURI")
    protected String baseURL;

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
     * Ruft den Wert der baseURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseURL() {
        if (baseURL == null) {
            return "";
        } else {
            return baseURL;
        }
    }

    /**
     * Legt den Wert der baseURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseURL(String value) {
        this.baseURL = value;
    }

}
