
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SignatureImageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SignatureImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="data" type="{http://schema.webpdf.de/1.0/operation}SignatureFileDataType"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="opacity" default="50"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="100"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="position" default="center"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schema.webpdf.de/1.0/operation}SignatureImagePositionType"&gt;
 *             &lt;enumeration value="center"/&gt;
 *             &lt;enumeration value="left"/&gt;
 *             &lt;enumeration value="right"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureImageType", propOrder = {

})
public class SignatureImageType {

    @XmlElement(required = true)
    protected SignatureFileDataType data;
    @XmlAttribute(name = "opacity")
    protected Integer opacity;
    @XmlAttribute(name = "position")
    protected SignatureImagePositionType position;

    /**
     * Ruft den Wert der data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SignatureFileDataType }
     *     
     */
    public SignatureFileDataType getData() {
        return data;
    }

    /**
     * Legt den Wert der data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureFileDataType }
     *     
     */
    public void setData(SignatureFileDataType value) {
        this.data = value;
    }

    /**
     * Ruft den Wert der opacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getOpacity() {
        if (opacity == null) {
            return  50;
        } else {
            return opacity;
        }
    }

    /**
     * Legt den Wert der opacity-Eigenschaft fest.
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
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SignatureImagePositionType }
     *     
     */
    public SignatureImagePositionType getPosition() {
        if (position == null) {
            return SignatureImagePositionType.CENTER;
        } else {
            return position;
        }
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
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
