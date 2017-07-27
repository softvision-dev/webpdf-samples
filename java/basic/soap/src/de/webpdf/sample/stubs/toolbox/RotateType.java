
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RotateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RotateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="degrees" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pageOrientation" type="{http://schema.webpdf.de/1.0/operation}PageOrientationType" />
 *       &lt;attribute name="pageGroup" type="{http://schema.webpdf.de/1.0/operation}PageGroupType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the degrees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDegrees() {
        return degrees;
    }

    /**
     * Sets the value of the degrees property.
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
     * Gets the value of the pageOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link PageOrientationType }
     *     
     */
    public PageOrientationType getPageOrientation() {
        return pageOrientation;
    }

    /**
     * Sets the value of the pageOrientation property.
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
     * Gets the value of the pageGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PageGroupType }
     *     
     */
    public PageGroupType getPageGroup() {
        return pageGroup;
    }

    /**
     * Sets the value of the pageGroup property.
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
