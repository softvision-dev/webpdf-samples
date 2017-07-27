
package de.webpdf.sample.stubs.ocr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OcrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OcrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="page" type="{http://schema.webpdf.de/1.0/operation}OcrPageType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="language" type="{http://schema.webpdf.de/1.0/operation}OcrLanguageType" />
 *       &lt;attribute name="outputFormat" type="{http://schema.webpdf.de/1.0/operation}OcrOutputType" />
 *       &lt;attribute name="checkResolution" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="imageDpi" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="forceEachPage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OcrType", propOrder = {
    "page"
})
public class OcrType {

    @XmlElement(namespace = "http://schema.webpdf.de/1.0/operation")
    protected OcrPageType page;
    @XmlAttribute(name = "language")
    protected OcrLanguageType language;
    @XmlAttribute(name = "outputFormat")
    protected OcrOutputType outputFormat;
    @XmlAttribute(name = "checkResolution")
    protected Boolean checkResolution;
    @XmlAttribute(name = "imageDpi")
    protected Integer imageDpi;
    @XmlAttribute(name = "forceEachPage")
    protected Boolean forceEachPage;

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link OcrPageType }
     *     
     */
    public OcrPageType getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link OcrPageType }
     *     
     */
    public void setPage(OcrPageType value) {
        this.page = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link OcrLanguageType }
     *     
     */
    public OcrLanguageType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link OcrLanguageType }
     *     
     */
    public void setLanguage(OcrLanguageType value) {
        this.language = value;
    }

    /**
     * Gets the value of the outputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link OcrOutputType }
     *     
     */
    public OcrOutputType getOutputFormat() {
        return outputFormat;
    }

    /**
     * Sets the value of the outputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link OcrOutputType }
     *     
     */
    public void setOutputFormat(OcrOutputType value) {
        this.outputFormat = value;
    }

    /**
     * Gets the value of the checkResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckResolution() {
        return checkResolution;
    }

    /**
     * Sets the value of the checkResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckResolution(Boolean value) {
        this.checkResolution = value;
    }

    /**
     * Gets the value of the imageDpi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageDpi() {
        return imageDpi;
    }

    /**
     * Sets the value of the imageDpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageDpi(Integer value) {
        this.imageDpi = value;
    }

    /**
     * Gets the value of the forceEachPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceEachPage() {
        return forceEachPage;
    }

    /**
     * Sets the value of the forceEachPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceEachPage(Boolean value) {
        this.forceEachPage = value;
    }

}
