
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für FileAnnotationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FileAnnotationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="point" type="{http://schema.webpdf.de/1.0/operation}PointType"/&gt;
 *       &lt;/all&gt;
 *       &lt;attGroup ref="{http://schema.webpdf.de/1.0/operation}fileAnnotationGroup"/&gt;
 *       &lt;attribute name="opacity" type="{http://schema.webpdf.de/1.0/operation}OpacityType" default="100" /&gt;
 *       &lt;attribute name="color" type="{http://schema.webpdf.de/1.0/operation}RgbColorType" default="#4800FF" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileAnnotationType", propOrder = {

})
public class FileAnnotationType {

    @XmlElement(required = true)
    protected PointType point;
    @XmlAttribute(name = "opacity")
    protected Integer opacity;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
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
     * Ruft den Wert der point-Eigenschaft ab.
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
     * Legt den Wert der point-Eigenschaft fest.
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
     * Ruft den Wert der opacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getOpacity() {
        if (opacity == null) {
            return  100;
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
     * Ruft den Wert der color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        if (color == null) {
            return "#4800FF";
        } else {
            return color;
        }
    }

    /**
     * Legt den Wert der color-Eigenschaft fest.
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
     * Ruft den Wert der page-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPage() {
        if (page == null) {
            return  1;
        } else {
            return page;
        }
    }

    /**
     * Legt den Wert der page-Eigenschaft fest.
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
     * Ruft den Wert der lockedPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLockedPosition() {
        if (lockedPosition == null) {
            return true;
        } else {
            return lockedPosition;
        }
    }

    /**
     * Legt den Wert der lockedPosition-Eigenschaft fest.
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
     * Ruft den Wert der popupText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopupText() {
        if (popupText == null) {
            return "";
        } else {
            return popupText;
        }
    }

    /**
     * Legt den Wert der popupText-Eigenschaft fest.
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
     * Ruft den Wert der icon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IconsType }
     *     
     */
    public IconsType getIcon() {
        if (icon == null) {
            return IconsType.PAPERCLIP;
        } else {
            return icon;
        }
    }

    /**
     * Legt den Wert der icon-Eigenschaft fest.
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
