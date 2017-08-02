
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WatermarkTextType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WatermarkTextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="font" type="{http://schema.webpdf.de/1.0/operation}WatermarkFontType" minOccurs="0"/&gt;
 *         &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}WatermarkPositionType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" default="Confidential" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WatermarkTextType", propOrder = {

})
public class WatermarkTextType {

    protected WatermarkFontType font;
    protected WatermarkPositionType position;
    @XmlAttribute(name = "text")
    protected String text;

    /**
     * Ruft den Wert der font-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WatermarkFontType }
     *     
     */
    public WatermarkFontType getFont() {
        return font;
    }

    /**
     * Legt den Wert der font-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WatermarkFontType }
     *     
     */
    public void setFont(WatermarkFontType value) {
        this.font = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WatermarkPositionType }
     *     
     */
    public WatermarkPositionType getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WatermarkPositionType }
     *     
     */
    public void setPosition(WatermarkPositionType value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        if (text == null) {
            return "Confidential";
        } else {
            return text;
        }
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
