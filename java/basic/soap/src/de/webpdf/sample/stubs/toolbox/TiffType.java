
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TiffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TiffType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}ImageBaseType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="multipage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="compression" type="{http://schema.webpdf.de/1.0/operation}TiffCompressionType" />
 *       &lt;attribute name="jpegQuality" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the multipage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipage() {
        return multipage;
    }

    /**
     * Sets the value of the multipage property.
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
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link TiffCompressionType }
     *     
     */
    public TiffCompressionType getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
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
     * Gets the value of the jpegQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJpegQuality() {
        return jpegQuality;
    }

    /**
     * Sets the value of the jpegQuality property.
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
