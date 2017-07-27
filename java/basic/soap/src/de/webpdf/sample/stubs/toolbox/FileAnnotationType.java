
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileAnnotationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileAnnotationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="point" type="{http://schema.webpdf.de/1.0/operation}PointType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="opacity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="lockedPosition" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="popupText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="icon" type="{http://schema.webpdf.de/1.0/operation}IconsType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileAnnotationType", propOrder = {
    "point"
})
public class FileAnnotationType {

    @XmlElement(required = true)
    protected PointType point;
    @XmlAttribute(name = "opacity")
    protected Integer opacity;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "page")
    protected Integer page;
    @XmlAttribute(name = "lockedPosition")
    protected Boolean lockedPosition;
    @XmlAttribute(name = "popupText")
    protected String popupText;
    @XmlAttribute(name = "icon")
    protected IconsType icon;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setPoint(PointType value) {
        this.point = value;
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
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPage(Integer value) {
        this.page = value;
    }

    /**
     * Gets the value of the lockedPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockedPosition() {
        return lockedPosition;
    }

    /**
     * Sets the value of the lockedPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockedPosition(Boolean value) {
        this.lockedPosition = value;
    }

    /**
     * Gets the value of the popupText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopupText() {
        return popupText;
    }

    /**
     * Sets the value of the popupText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopupText(String value) {
        this.popupText = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link IconsType }
     *     
     */
    public IconsType getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconsType }
     *     
     */
    public void setIcon(IconsType value) {
        this.icon = value;
    }

}
