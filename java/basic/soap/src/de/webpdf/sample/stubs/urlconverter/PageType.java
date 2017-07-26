
package de.webpdf.sample.stubs.urlconverter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}MarginType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="metrics" type="{http://schema.webpdf.de/1.0/operation}MetricsType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageType")
public class PageType
    extends MarginType
{

    @XmlAttribute(name = "width")
    protected Integer width;
    @XmlAttribute(name = "height")
    protected Integer height;
    @XmlAttribute(name = "metrics")
    protected MetricsType metrics;

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the metrics property.
     * 
     * @return
     *     possible object is
     *     {@link MetricsType }
     *     
     */
    public MetricsType getMetrics() {
        return metrics;
    }

    /**
     * Sets the value of the metrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetricsType }
     *     
     */
    public void setMetrics(MetricsType value) {
        this.metrics = value;
    }

}
