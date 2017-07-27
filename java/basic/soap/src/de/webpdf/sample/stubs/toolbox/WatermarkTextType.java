
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WatermarkTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WatermarkTextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="font" type="{http://schema.webpdf.de/1.0/operation}WatermarkFontType" minOccurs="0"/>
 *         &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}WatermarkPositionType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the font property.
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
     * Sets the value of the font property.
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
     * Gets the value of the position property.
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
     * Sets the value of the position property.
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
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
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
