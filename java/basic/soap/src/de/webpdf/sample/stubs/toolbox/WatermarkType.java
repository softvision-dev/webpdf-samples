
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WatermarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WatermarkType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://schema.webpdf.de/1.0/operation}WatermarkTextType" minOccurs="0"/>
 *         &lt;element name="image" type="{http://schema.webpdf.de/1.0/operation}WatermarkImageType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="angle" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the text property.
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
     * Sets the value of the text property.
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
     * Gets the value of the image property.
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
     * Sets the value of the image property.
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
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
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
