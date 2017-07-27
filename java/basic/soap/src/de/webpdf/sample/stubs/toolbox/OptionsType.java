
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pageLayout" type="{http://schema.webpdf.de/1.0/operation}PageLayoutType" />
 *       &lt;attribute name="initialView" type="{http://schema.webpdf.de/1.0/operation}InitialViewType" />
 *       &lt;attribute name="magnification" type="{http://schema.webpdf.de/1.0/operation}MagnificationType" />
 *       &lt;attribute name="magnificationZoom" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="initialPage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the pageLayout property.
     * 
     * @return
     *     possible object is
     *     {@link PageLayoutType }
     *     
     */
    public PageLayoutType getPageLayout() {
        return pageLayout;
    }

    /**
     * Sets the value of the pageLayout property.
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
     * Gets the value of the initialView property.
     * 
     * @return
     *     possible object is
     *     {@link InitialViewType }
     *     
     */
    public InitialViewType getInitialView() {
        return initialView;
    }

    /**
     * Sets the value of the initialView property.
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
     * Gets the value of the magnification property.
     * 
     * @return
     *     possible object is
     *     {@link MagnificationType }
     *     
     */
    public MagnificationType getMagnification() {
        return magnification;
    }

    /**
     * Sets the value of the magnification property.
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
     * Gets the value of the magnificationZoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMagnificationZoom() {
        return magnificationZoom;
    }

    /**
     * Sets the value of the magnificationZoom property.
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
     * Gets the value of the initialPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialPage() {
        return initialPage;
    }

    /**
     * Sets the value of the initialPage property.
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
