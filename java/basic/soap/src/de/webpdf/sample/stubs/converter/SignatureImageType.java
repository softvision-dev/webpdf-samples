
package de.webpdf.sample.stubs.converter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureImageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://schema.webpdf.de/1.0/operation}SignatureFileDataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="opacity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="position" type="{http://schema.webpdf.de/1.0/operation}SignatureImagePositionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureImageType", propOrder = {
    "data"
})
public class SignatureImageType {

    @XmlElement(required = true)
    protected byte[] data;
    @XmlAttribute(name = "opacity")
    protected Integer opacity;
    @XmlAttribute(name = "position")
    protected SignatureImagePositionType position;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the opacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpacity() {
        return opacity;
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpacity(Integer value) {
        this.opacity = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureImagePositionType }
     *     
     */
    public SignatureImagePositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureImagePositionType }
     *     
     */
    public void setPosition(SignatureImagePositionType value) {
        this.position = value;
    }

}
