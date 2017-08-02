
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WatermarkType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WatermarkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="text" type="{http://schema.webpdf.de/1.0/operation}WatermarkTextType" minOccurs="0"/&gt;
 *         &lt;element name="image" type="{http://schema.webpdf.de/1.0/operation}WatermarkImageType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="angle" default="45"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="360"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WatermarkType", propOrder = {
    "text",
    "image"
})
public class WatermarkType
    extends BaseToolboxType
{

    protected WatermarkTextType text;
    protected WatermarkImageType image;
    @XmlAttribute(name = "pages")
    protected String pages;
    @XmlAttribute(name = "angle")
    protected Integer angle;

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WatermarkTextType }
     *     
     */
    public WatermarkTextType getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WatermarkTextType }
     *     
     */
    public void setText(WatermarkTextType value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der image-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WatermarkImageType }
     *     
     */
    public WatermarkImageType getImage() {
        return image;
    }

    /**
     * Legt den Wert der image-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WatermarkImageType }
     *     
     */
    public void setImage(WatermarkImageType value) {
        this.image = value;
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
     * Ruft den Wert der angle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getAngle() {
        if (angle == null) {
            return  45;
        } else {
            return angle;
        }
    }

    /**
     * Legt den Wert der angle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAngle(Integer value) {
        this.angle = value;
    }

}
