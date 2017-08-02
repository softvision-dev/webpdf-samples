
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TiffType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TiffType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}ImageBaseType"&gt;
 *       &lt;attribute name="multipage" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="compression" type="{http://schema.webpdf.de/1.0/operation}TiffCompressionType" default="none" /&gt;
 *       &lt;attribute name="jpegQuality" default="80"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="100"/&gt;
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
@XmlType(name = "TiffType")
public class TiffType
    extends ImageBaseType
{

    @XmlAttribute(name = "multipage")
    protected Boolean multipage;
    @XmlAttribute(name = "compression")
    protected TiffCompressionType compression;
    @XmlAttribute(name = "jpegQuality")
    protected Integer jpegQuality;

    /**
     * Ruft den Wert der multipage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMultipage() {
        if (multipage == null) {
            return false;
        } else {
            return multipage;
        }
    }

    /**
     * Legt den Wert der multipage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipage(Boolean value) {
        this.multipage = value;
    }

    /**
     * Ruft den Wert der compression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TiffCompressionType }
     *     
     */
    public TiffCompressionType getCompression() {
        if (compression == null) {
            return TiffCompressionType.NONE;
        } else {
            return compression;
        }
    }

    /**
     * Legt den Wert der compression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TiffCompressionType }
     *     
     */
    public void setCompression(TiffCompressionType value) {
        this.compression = value;
    }

    /**
     * Ruft den Wert der jpegQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getJpegQuality() {
        if (jpegQuality == null) {
            return  80;
        } else {
            return jpegQuality;
        }
    }

    /**
     * Legt den Wert der jpegQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJpegQuality(Integer value) {
        this.jpegQuality = value;
    }

}
