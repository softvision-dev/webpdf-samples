
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BarcodeSelectionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BarcodeSelectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="scanArea" type="{http://schema.webpdf.de/1.0/operation}RectangleType"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="resolution" default="200"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="pureBarcode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="gs1" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="tryHarder" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="allowedLengths" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="barcode39CheckDigit" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="codabarStartEndDigits" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="upcEanExtensions" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="charset" type="{http://www.w3.org/2001/XMLSchema}string" default="utf-8" /&gt;
 *       &lt;attribute name="formats" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarcodeSelectionType", propOrder = {

})
public class BarcodeSelectionType {

    @XmlElement(required = true)
    protected RectangleType scanArea;
    @XmlAttribute(name = "pages")
    protected String pages;
    @XmlAttribute(name = "resolution")
    protected Integer resolution;
    @XmlAttribute(name = "pureBarcode")
    protected Boolean pureBarcode;
    @XmlAttribute(name = "gs1")
    protected Boolean gs1;
    @XmlAttribute(name = "tryHarder")
    protected Boolean tryHarder;
    @XmlAttribute(name = "allowedLengths")
    protected String allowedLengths;
    @XmlAttribute(name = "barcode39CheckDigit")
    protected Boolean barcode39CheckDigit;
    @XmlAttribute(name = "codabarStartEndDigits")
    protected Boolean codabarStartEndDigits;
    @XmlAttribute(name = "upcEanExtensions")
    protected String upcEanExtensions;
    @XmlAttribute(name = "charset")
    protected String charset;
    @XmlAttribute(name = "formats", required = true)
    protected String formats;

    /**
     * Ruft den Wert der scanArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RectangleType }
     *     
     */
    public RectangleType getScanArea() {
        return scanArea;
    }

    /**
     * Legt den Wert der scanArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RectangleType }
     *     
     */
    public void setScanArea(RectangleType value) {
        this.scanArea = value;
    }

    /**
     * Ruft den Wert der pages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPages() {
        if (pages == null) {
            return "";
        } else {
            return pages;
        }
    }

    /**
     * Legt den Wert der pages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPages(String value) {
        this.pages = value;
    }

    /**
     * Ruft den Wert der resolution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getResolution() {
        if (resolution == null) {
            return  200;
        } else {
            return resolution;
        }
    }

    /**
     * Legt den Wert der resolution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResolution(Integer value) {
        this.resolution = value;
    }

    /**
     * Ruft den Wert der pureBarcode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPureBarcode() {
        if (pureBarcode == null) {
            return false;
        } else {
            return pureBarcode;
        }
    }

    /**
     * Legt den Wert der pureBarcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPureBarcode(Boolean value) {
        this.pureBarcode = value;
    }

    /**
     * Ruft den Wert der gs1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGs1() {
        if (gs1 == null) {
            return false;
        } else {
            return gs1;
        }
    }

    /**
     * Legt den Wert der gs1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGs1(Boolean value) {
        this.gs1 = value;
    }

    /**
     * Ruft den Wert der tryHarder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTryHarder() {
        if (tryHarder == null) {
            return true;
        } else {
            return tryHarder;
        }
    }

    /**
     * Legt den Wert der tryHarder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTryHarder(Boolean value) {
        this.tryHarder = value;
    }

    /**
     * Ruft den Wert der allowedLengths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedLengths() {
        if (allowedLengths == null) {
            return "";
        } else {
            return allowedLengths;
        }
    }

    /**
     * Legt den Wert der allowedLengths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedLengths(String value) {
        this.allowedLengths = value;
    }

    /**
     * Ruft den Wert der barcode39CheckDigit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBarcode39CheckDigit() {
        if (barcode39CheckDigit == null) {
            return false;
        } else {
            return barcode39CheckDigit;
        }
    }

    /**
     * Legt den Wert der barcode39CheckDigit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBarcode39CheckDigit(Boolean value) {
        this.barcode39CheckDigit = value;
    }

    /**
     * Ruft den Wert der codabarStartEndDigits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCodabarStartEndDigits() {
        if (codabarStartEndDigits == null) {
            return false;
        } else {
            return codabarStartEndDigits;
        }
    }

    /**
     * Legt den Wert der codabarStartEndDigits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCodabarStartEndDigits(Boolean value) {
        this.codabarStartEndDigits = value;
    }

    /**
     * Ruft den Wert der upcEanExtensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpcEanExtensions() {
        if (upcEanExtensions == null) {
            return "";
        } else {
            return upcEanExtensions;
        }
    }

    /**
     * Legt den Wert der upcEanExtensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpcEanExtensions(String value) {
        this.upcEanExtensions = value;
    }

    /**
     * Ruft den Wert der charset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharset() {
        if (charset == null) {
            return "utf-8";
        } else {
            return charset;
        }
    }

    /**
     * Legt den Wert der charset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharset(String value) {
        this.charset = value;
    }

    /**
     * Ruft den Wert der formats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormats() {
        return formats;
    }

    /**
     * Legt den Wert der formats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormats(String value) {
        this.formats = value;
    }

}
