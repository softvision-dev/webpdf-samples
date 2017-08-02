
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MarginType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MarginType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="left" type="{http://www.w3.org/2001/XMLSchema}int" default="20" /&gt;
 *       &lt;attribute name="right" type="{http://www.w3.org/2001/XMLSchema}int" default="20" /&gt;
 *       &lt;attribute name="top" type="{http://www.w3.org/2001/XMLSchema}int" default="20" /&gt;
 *       &lt;attribute name="bottom" type="{http://www.w3.org/2001/XMLSchema}int" default="20" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Ruft den Wert der left-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLeft() {
        if (left == null) {
            return  20;
        } else {
            return left;
        }
    }

    /**
     * Legt den Wert der left-Eigenschaft fest.
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
     * Ruft den Wert der right-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRight() {
        if (right == null) {
            return  20;
        } else {
            return right;
        }
    }

    /**
     * Legt den Wert der right-Eigenschaft fest.
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
     * Ruft den Wert der top-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTop() {
        if (top == null) {
            return  20;
        } else {
            return top;
        }
    }

    /**
     * Legt den Wert der top-Eigenschaft fest.
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
     * Ruft den Wert der bottom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getBottom() {
        if (bottom == null) {
            return  20;
        } else {
            return bottom;
        }
    }

    /**
     * Legt den Wert der bottom-Eigenschaft fest.
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
