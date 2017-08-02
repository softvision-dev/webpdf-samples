
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ImageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="png" type="{http://schema.webpdf.de/1.0/operation}PngType"/&gt;
 *         &lt;element name="tiff" type="{http://schema.webpdf.de/1.0/operation}TiffType"/&gt;
 *         &lt;element name="jpeg" type="{http://schema.webpdf.de/1.0/operation}JpegType"/&gt;
 *         &lt;element name="gif" type="{http://schema.webpdf.de/1.0/operation}GifType"/&gt;
 *         &lt;element name="bmp" type="{http://schema.webpdf.de/1.0/operation}BmpType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
 *       &lt;attribute name="fileNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" default="page[%d]" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageType", propOrder = {
    "png",
    "tiff",
    "jpeg",
    "gif",
    "bmp"
})
public class ImageType
    extends BaseToolboxType
{

    protected PngType png;
    protected TiffType tiff;
    protected JpegType jpeg;
    protected GifType gif;
    protected BmpType bmp;
    @XmlAttribute(name = "pages")
    protected String pages;
    @XmlAttribute(name = "fileNameTemplate")
    protected String fileNameTemplate;

    /**
     * Ruft den Wert der png-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PngType }
     *     
     */
    public PngType getPng() {
        return png;
    }

    /**
     * Legt den Wert der png-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PngType }
     *     
     */
    public void setPng(PngType value) {
        this.png = value;
    }

    /**
     * Ruft den Wert der tiff-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TiffType }
     *     
     */
    public TiffType getTiff() {
        return tiff;
    }

    /**
     * Legt den Wert der tiff-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TiffType }
     *     
     */
    public void setTiff(TiffType value) {
        this.tiff = value;
    }

    /**
     * Ruft den Wert der jpeg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JpegType }
     *     
     */
    public JpegType getJpeg() {
        return jpeg;
    }

    /**
     * Legt den Wert der jpeg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JpegType }
     *     
     */
    public void setJpeg(JpegType value) {
        this.jpeg = value;
    }

    /**
     * Ruft den Wert der gif-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GifType }
     *     
     */
    public GifType getGif() {
        return gif;
    }

    /**
     * Legt den Wert der gif-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GifType }
     *     
     */
    public void setGif(GifType value) {
        this.gif = value;
    }

    /**
     * Ruft den Wert der bmp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BmpType }
     *     
     */
    public BmpType getBmp() {
        return bmp;
    }

    /**
     * Legt den Wert der bmp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BmpType }
     *     
     */
    public void setBmp(BmpType value) {
        this.bmp = value;
    }

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
     * Ruft den Wert der fileNameTemplate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNameTemplate() {
        if (fileNameTemplate == null) {
            return "page[%d]";
        } else {
            return fileNameTemplate;
        }
    }

    /**
     * Legt den Wert der fileNameTemplate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNameTemplate(String value) {
        this.fileNameTemplate = value;
    }

}
