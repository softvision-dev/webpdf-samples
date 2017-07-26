
package de.webpdf.sample.stubs.converter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterHtmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterHtmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="downloadImages" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="adjustFonts" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="baseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the baseURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseURL() {
        return baseURL;
    }

    /**
     * Sets the value of the baseURL property.
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
