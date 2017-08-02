
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für BaseAnnotationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseAnnotationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://schema.webpdf.de/1.0/operation}FlagsAnnotationGroup"/&gt;
 *       &lt;attribute name="creator" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="subject" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="contents" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="intents" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="page" default="1"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="color" type="{http://schema.webpdf.de/1.0/operation}RgbColorType" default="#4800FF" /&gt;
 *       &lt;attribute name="opacity" type="{http://schema.webpdf.de/1.0/operation}OpacityType" default="100" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAnnotationType")
@XmlSeeAlso({
    TextAnnotationType.class,
    MarkupAnnotationType.class
})
public class BaseAnnotationType {

    @XmlAttribute(name = "creator")
    protected String creator;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "subject")
    protected String subject;
    @XmlAttribute(name = "contents")
    protected String contents;
    @XmlAttribute(name = "intents")
    protected String intents;
    @XmlAttribute(name = "page")
    protected Integer page;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String color;
    @XmlAttribute(name = "opacity")
    protected Integer opacity;
    @XmlAttribute(name = "locked")
    protected Boolean locked;
    @XmlAttribute(name = "printable")
    protected Boolean printable;
    @XmlAttribute(name = "rotatable")
    protected Boolean rotatable;
    @XmlAttribute(name = "viewable")
    protected Boolean viewable;
    @XmlAttribute(name = "writable")
    protected Boolean writable;
    @XmlAttribute(name = "zoomable")
    protected Boolean zoomable;
    @XmlAttribute(name = "invisible")
    protected Boolean invisible;
    @XmlAttribute(name = "hidden")
    protected Boolean hidden;

    /**
     * Ruft den Wert der creator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        if (creator == null) {
            return "";
        } else {
            return creator;
        }
    }

    /**
     * Legt den Wert der creator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "";
        } else {
            return name;
        }
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der subject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        if (subject == null) {
            return "";
        } else {
            return subject;
        }
    }

    /**
     * Legt den Wert der subject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Ruft den Wert der contents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContents() {
        if (contents == null) {
            return "";
        } else {
            return contents;
        }
    }

    /**
     * Legt den Wert der contents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContents(String value) {
        this.contents = value;
    }

    /**
     * Ruft den Wert der intents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntents() {
        if (intents == null) {
            return "";
        } else {
            return intents;
        }
    }

    /**
     * Legt den Wert der intents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntents(String value) {
        this.intents = value;
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
     * Ruft den Wert der locked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLocked() {
        if (locked == null) {
            return true;
        } else {
            return locked;
        }
    }

    /**
     * Legt den Wert der locked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Ruft den Wert der printable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrintable() {
        if (printable == null) {
            return false;
        } else {
            return printable;
        }
    }

    /**
     * Legt den Wert der printable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintable(Boolean value) {
        this.printable = value;
    }

    /**
     * Ruft den Wert der rotatable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRotatable() {
        if (rotatable == null) {
            return true;
        } else {
            return rotatable;
        }
    }

    /**
     * Legt den Wert der rotatable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRotatable(Boolean value) {
        this.rotatable = value;
    }

    /**
     * Ruft den Wert der viewable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isViewable() {
        if (viewable == null) {
            return true;
        } else {
            return viewable;
        }
    }

    /**
     * Legt den Wert der viewable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewable(Boolean value) {
        this.viewable = value;
    }

    /**
     * Ruft den Wert der writable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWritable() {
        if (writable == null) {
            return true;
        } else {
            return writable;
        }
    }

    /**
     * Legt den Wert der writable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWritable(Boolean value) {
        this.writable = value;
    }

    /**
     * Ruft den Wert der zoomable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isZoomable() {
        if (zoomable == null) {
            return true;
        } else {
            return zoomable;
        }
    }

    /**
     * Legt den Wert der zoomable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZoomable(Boolean value) {
        this.zoomable = value;
    }

    /**
     * Ruft den Wert der invisible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInvisible() {
        if (invisible == null) {
            return false;
        } else {
            return invisible;
        }
    }

    /**
     * Legt den Wert der invisible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvisible(Boolean value) {
        this.invisible = value;
    }

    /**
     * Ruft den Wert der hidden-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHidden() {
        if (hidden == null) {
            return false;
        } else {
            return hidden;
        }
    }

    /**
     * Legt den Wert der hidden-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

}
