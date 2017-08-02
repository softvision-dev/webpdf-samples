
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TextAnnotationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TextAnnotationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseAnnotationType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}RectangleType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="icon" type="{http://schema.webpdf.de/1.0/operation}TextAnnotationIconsType" default="note" /&gt;
 *       &lt;attribute name="initialOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextAnnotationType", propOrder = {
    "position"
})
public class TextAnnotationType
    extends BaseAnnotationType
{

    protected RectangleType position;
    @XmlAttribute(name = "icon")
    protected TextAnnotationIconsType icon;
    @XmlAttribute(name = "initialOpen")
    protected Boolean initialOpen;

    /**
     * Ruft den Wert der position-Eigenschaft ab.
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
     * Legt den Wert der position-Eigenschaft fest.
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
     * Ruft den Wert der icon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextAnnotationIconsType }
     *     
     */
    public TextAnnotationIconsType getIcon() {
        if (icon == null) {
            return TextAnnotationIconsType.NOTE;
        } else {
            return icon;
        }
    }

    /**
     * Legt den Wert der icon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAnnotationIconsType }
     *     
     */
    public void setIcon(TextAnnotationIconsType value) {
        this.icon = value;
    }

    /**
     * Ruft den Wert der initialOpen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInitialOpen() {
        if (initialOpen == null) {
            return true;
        } else {
            return initialOpen;
        }
    }

    /**
     * Legt den Wert der initialOpen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInitialOpen(Boolean value) {
        this.initialOpen = value;
    }

}
