
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextAnnotationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextAnnotationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseAnnotationType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}RectangleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="icon" type="{http://schema.webpdf.de/1.0/operation}TextAnnotationIconsType" />
 *       &lt;attribute name="initialOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the position property.
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
     * Sets the value of the position property.
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
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link TextAnnotationIconsType }
     *     
     */
    public TextAnnotationIconsType getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
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
     * Gets the value of the initialOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInitialOpen() {
        return initialOpen;
    }

    /**
     * Sets the value of the initialOpen property.
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
