
package de.webpdf.sample.stubs.barcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseBarcodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseBarcodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}RectangleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="charset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rotation" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="margin" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseBarcodeType", propOrder = {
    "position"
})
@XmlSeeAlso({
    Code39BarcodeType.class,
    Code128BarcodeType.class,
    CodabarBarcodeType.class,
    Ean8BarcodeType.class,
    DataMatrixBarcodeType.class,
    ItfBarcodeType.class,
    UpcaBarcodeType.class,
    Pdf417BarcodeType.class,
    Ean13BarcodeType.class,
    QrBarcodeType.class,
    AztecBarcodeType.class
})
public class BaseBarcodeType {

    protected RectangleType position;
    @XmlAttribute(name = "charset")
    protected String charset;
    @XmlAttribute(name = "value", required = true)
    protected String value;
    @XmlAttribute(name = "rotation")
    protected Integer rotation;
    @XmlAttribute(name = "margin")
    protected Integer margin;
    @XmlAttribute(name = "pages")
    protected String pages;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link RectangleType }
     *     
     */
    public RectangleType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link RectangleType }
     *     
     */
    public void setPosition(RectangleType value) {
        this.position = value;
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the rotation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRotation(Integer value) {
        this.rotation = value;
    }

    /**
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMargin() {
        return margin;
    }

    /**
     * Sets the value of the margin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMargin(Integer value) {
        this.margin = value;
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

}
