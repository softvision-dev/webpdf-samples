
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OptionsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;attribute name="pageLayout" type="{http://schema.webpdf.de/1.0/operation}PageLayoutType" default="singlePage" /&gt;
 *       &lt;attribute name="initialView" type="{http://schema.webpdf.de/1.0/operation}InitialViewType" default="none" /&gt;
 *       &lt;attribute name="magnification" type="{http://schema.webpdf.de/1.0/operation}MagnificationType" default="fitWidth" /&gt;
 *       &lt;attribute name="magnificationZoom" default="100"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="6400"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="initialPage" default="1"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionsType")
public class OptionsType
    extends BaseToolboxType
{

    @XmlAttribute(name = "pageLayout")
    protected PageLayoutType pageLayout;
    @XmlAttribute(name = "initialView")
    protected InitialViewType initialView;
    @XmlAttribute(name = "magnification")
    protected MagnificationType magnification;
    @XmlAttribute(name = "magnificationZoom")
    protected Integer magnificationZoom;
    @XmlAttribute(name = "initialPage")
    protected Integer initialPage;

    /**
     * Ruft den Wert der pageLayout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PageLayoutType }
     *     
     */
    public PageLayoutType getPageLayout() {
        if (pageLayout == null) {
            return PageLayoutType.SINGLE_PAGE;
        } else {
            return pageLayout;
        }
    }

    /**
     * Legt den Wert der pageLayout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PageLayoutType }
     *     
     */
    public void setPageLayout(PageLayoutType value) {
        this.pageLayout = value;
    }

    /**
     * Ruft den Wert der initialView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InitialViewType }
     *     
     */
    public InitialViewType getInitialView() {
        if (initialView == null) {
            return InitialViewType.NONE;
        } else {
            return initialView;
        }
    }

    /**
     * Legt den Wert der initialView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialViewType }
     *     
     */
    public void setInitialView(InitialViewType value) {
        this.initialView = value;
    }

    /**
     * Ruft den Wert der magnification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MagnificationType }
     *     
     */
    public MagnificationType getMagnification() {
        if (magnification == null) {
            return MagnificationType.FIT_WIDTH;
        } else {
            return magnification;
        }
    }

    /**
     * Legt den Wert der magnification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MagnificationType }
     *     
     */
    public void setMagnification(MagnificationType value) {
        this.magnification = value;
    }

    /**
     * Ruft den Wert der magnificationZoom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMagnificationZoom() {
        if (magnificationZoom == null) {
            return  100;
        } else {
            return magnificationZoom;
        }
    }

    /**
     * Legt den Wert der magnificationZoom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMagnificationZoom(Integer value) {
        this.magnificationZoom = value;
    }

    /**
     * Ruft den Wert der initialPage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getInitialPage() {
        if (initialPage == null) {
            return  1;
        } else {
            return initialPage;
        }
    }

    /**
     * Legt den Wert der initialPage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialPage(Integer value) {
        this.initialPage = value;
    }

}
