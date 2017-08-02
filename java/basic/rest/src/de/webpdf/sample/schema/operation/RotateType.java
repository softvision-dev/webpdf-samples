
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RotateType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RotateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
 *       &lt;attribute name="degrees" default="90"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="360"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="pageOrientation" type="{http://schema.webpdf.de/1.0/operation}PageOrientationType" default="any" /&gt;
 *       &lt;attribute name="pageGroup" type="{http://schema.webpdf.de/1.0/operation}PageGroupType" default="all" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RotateType")
public class RotateType
    extends BaseToolboxType
{

    @XmlAttribute(name = "pages")
    protected String pages;
    @XmlAttribute(name = "degrees")
    protected Integer degrees;
    @XmlAttribute(name = "pageOrientation")
    protected PageOrientationType pageOrientation;
    @XmlAttribute(name = "pageGroup")
    protected PageGroupType pageGroup;

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
            return "1";
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
     * Ruft den Wert der degrees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDegrees() {
        if (degrees == null) {
            return  90;
        } else {
            return degrees;
        }
    }

    /**
     * Legt den Wert der degrees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDegrees(Integer value) {
        this.degrees = value;
    }

    /**
     * Ruft den Wert der pageOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PageOrientationType }
     *     
     */
    public PageOrientationType getPageOrientation() {
        if (pageOrientation == null) {
            return PageOrientationType.ANY;
        } else {
            return pageOrientation;
        }
    }

    /**
     * Legt den Wert der pageOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PageOrientationType }
     *     
     */
    public void setPageOrientation(PageOrientationType value) {
        this.pageOrientation = value;
    }

    /**
     * Ruft den Wert der pageGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PageGroupType }
     *     
     */
    public PageGroupType getPageGroup() {
        if (pageGroup == null) {
            return PageGroupType.ALL;
        } else {
            return pageGroup;
        }
    }

    /**
     * Legt den Wert der pageGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PageGroupType }
     *     
     */
    public void setPageGroup(PageGroupType value) {
        this.pageGroup = value;
    }

}
