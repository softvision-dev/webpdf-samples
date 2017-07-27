
package de.webpdf.sample.stubs.barcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeSelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BarcodeSelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scanArea" type="{http://schema.webpdf.de/1.0/operation}RectangleType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resolution" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pureBarcode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="gs1" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="tryHarder" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="allowedLengths" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="barcode39CheckDigit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="codabarStartEndDigits" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="upcEanExtensions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="charset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="formats" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarcodeSelectionType", propOrder = {
    "scanArea"
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
     * Gets the value of the scanArea property.
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
     * Sets the value of the scanArea property.
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
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
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
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
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
     * Gets the value of the pureBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPureBarcode() {
        return pureBarcode;
    }

    /**
     * Sets the value of the pureBarcode property.
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
     * Gets the value of the gs1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGs1() {
        return gs1;
    }

    /**
     * Sets the value of the gs1 property.
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
     * Gets the value of the tryHarder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTryHarder() {
        return tryHarder;
    }

    /**
     * Sets the value of the tryHarder property.
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
     * Gets the value of the allowedLengths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedLengths() {
        return allowedLengths;
    }

    /**
     * Sets the value of the allowedLengths property.
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
     * Gets the value of the barcode39CheckDigit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBarcode39CheckDigit() {
        return barcode39CheckDigit;
    }

    /**
     * Sets the value of the barcode39CheckDigit property.
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
     * Gets the value of the codabarStartEndDigits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCodabarStartEndDigits() {
        return codabarStartEndDigits;
    }

    /**
     * Sets the value of the codabarStartEndDigits property.
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
     * Gets the value of the upcEanExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpcEanExtensions() {
        return upcEanExtensions;
    }

    /**
     * Sets the value of the upcEanExtensions property.
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
     * Gets the value of the charset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharset() {
        return charset;
    }

    /**
     * Sets the value of the charset property.
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
     * Gets the value of the formats property.
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
     * Sets the value of the formats property.
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
