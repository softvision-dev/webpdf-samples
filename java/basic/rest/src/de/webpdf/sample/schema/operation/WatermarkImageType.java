
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WatermarkImageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WatermarkImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="data" type="{http://schema.webpdf.de/1.0/operation}WatermarkFileDataType"/&gt;
 *         &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}WatermarkPositionType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="scale" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="opacity" type="{http://schema.webpdf.de/1.0/operation}OpacityType" default="25" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WatermarkImageType", propOrder = {

})
public class WatermarkImageType {

    @XmlElement(required = true)
    protected WatermarkFileDataType data;
    protected WatermarkPositionType position;
    @XmlAttribute(name = "scale")
    protected Integer scale;
    @XmlAttribute(name = "opacity")
    protected Integer opacity;

    /**
     * Ruft den Wert der data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WatermarkFileDataType }
     *     
     */
    public WatermarkFileDataType getData() {
        return data;
    }

    /**
     * Legt den Wert der data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WatermarkFileDataType }
     *     
     */
    public void setData(WatermarkFileDataType value) {
        this.data = value;
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
     * Ruft den Wert der scale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getScale() {
        if (scale == null) {
            return  0;
        } else {
            return scale;
        }
    }

    /**
     * Legt den Wert der scale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
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
            return  25;
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

}
