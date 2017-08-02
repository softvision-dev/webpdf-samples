
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OcrType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OcrType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="page" type="{http://schema.webpdf.de/1.0/operation}OcrPageType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="language" type="{http://schema.webpdf.de/1.0/operation}OcrLanguageType" default="eng" /&gt;
 *       &lt;attribute name="outputFormat" default="pdf"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schema.webpdf.de/1.0/operation}OcrOutputType"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="checkResolution" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="imageDpi" default="200"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schema.webpdf.de/1.0/operation}DpiType"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="forceEachPage" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OcrType", propOrder = {

})
public class OcrType {

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
     * Ruft den Wert der page-Eigenschaft ab.
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
     * Legt den Wert der page-Eigenschaft fest.
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
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OcrLanguageType }
     *     
     */
    public OcrLanguageType getLanguage() {
        if (language == null) {
            return OcrLanguageType.ENG;
        } else {
            return language;
        }
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
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
     * Ruft den Wert der outputFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OcrOutputType }
     *     
     */
    public OcrOutputType getOutputFormat() {
        if (outputFormat == null) {
            return OcrOutputType.PDF;
        } else {
            return outputFormat;
        }
    }

    /**
     * Legt den Wert der outputFormat-Eigenschaft fest.
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
     * Ruft den Wert der checkResolution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCheckResolution() {
        if (checkResolution == null) {
            return true;
        } else {
            return checkResolution;
        }
    }

    /**
     * Legt den Wert der checkResolution-Eigenschaft fest.
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
     * Ruft den Wert der imageDpi-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getImageDpi() {
        if (imageDpi == null) {
            return  200;
        } else {
            return imageDpi;
        }
    }

    /**
     * Legt den Wert der imageDpi-Eigenschaft fest.
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
     * Ruft den Wert der forceEachPage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForceEachPage() {
        if (forceEachPage == null) {
            return false;
        } else {
            return forceEachPage;
        }
    }

    /**
     * Legt den Wert der forceEachPage-Eigenschaft fest.
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
