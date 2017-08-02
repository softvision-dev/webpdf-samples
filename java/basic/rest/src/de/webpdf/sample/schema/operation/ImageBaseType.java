
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ImageBaseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ImageBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="dpi" default="72"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schema.webpdf.de/1.0/operation}DpiType"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="width" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="height" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="metrics" type="{http://schema.webpdf.de/1.0/operation}MetricsType" default="mm" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageBaseType")
@XmlSeeAlso({
    TiffType.class,
    PngType.class,
    JpegType.class,
    GifType.class,
    BmpType.class
})
public class ImageBaseType {

    @XmlAttribute(name = "dpi")
    protected Integer dpi;
    @XmlAttribute(name = "width")
    protected Integer width;
    @XmlAttribute(name = "height")
    protected Integer height;
    @XmlAttribute(name = "metrics")
    protected MetricsType metrics;

    /**
     * Ruft den Wert der dpi-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDpi() {
        if (dpi == null) {
            return  72;
        } else {
            return dpi;
        }
    }

    /**
     * Legt den Wert der dpi-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDpi(Integer value) {
        this.dpi = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getWidth() {
        if (width == null) {
            return  0;
        } else {
            return width;
        }
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
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
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getHeight() {
        if (height == null) {
            return  0;
        } else {
            return height;
        }
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
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
     * Ruft den Wert der metrics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetricsType }
     *     
     */
    public MetricsType getMetrics() {
        if (metrics == null) {
            return MetricsType.MM;
        } else {
            return metrics;
        }
    }

    /**
     * Legt den Wert der metrics-Eigenschaft fest.
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
