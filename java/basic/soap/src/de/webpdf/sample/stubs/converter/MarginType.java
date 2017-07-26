
package de.webpdf.sample.stubs.converter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarginType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="left" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="right" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="top" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="bottom" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginType")
@XmlSeeAlso({
    PageType.class
})
public class MarginType {

    @XmlAttribute(name = "left")
    protected Integer left;
    @XmlAttribute(name = "right")
    protected Integer right;
    @XmlAttribute(name = "top")
    protected Integer top;
    @XmlAttribute(name = "bottom")
    protected Integer bottom;

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeft(Integer value) {
        this.left = value;
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRight(Integer value) {
        this.right = value;
    }

    /**
     * Gets the value of the top property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTop(Integer value) {
        this.top = value;
    }

    /**
     * Gets the value of the bottom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBottom() {
        return bottom;
    }

    /**
     * Sets the value of the bottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBottom(Integer value) {
        this.bottom = value;
    }

}
