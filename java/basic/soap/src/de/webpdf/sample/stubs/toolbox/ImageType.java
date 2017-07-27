
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *         &lt;element name="png" type="{http://schema.webpdf.de/1.0/operation}PngType" minOccurs="0"/>
 *         &lt;element name="tiff" type="{http://schema.webpdf.de/1.0/operation}TiffType" minOccurs="0"/>
 *         &lt;element name="jpeg" type="{http://schema.webpdf.de/1.0/operation}JpegType" minOccurs="0"/>
 *         &lt;element name="gif" type="{http://schema.webpdf.de/1.0/operation}GifType" minOccurs="0"/>
 *         &lt;element name="bmp" type="{http://schema.webpdf.de/1.0/operation}BmpType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the png property.
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
     * Sets the value of the png property.
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
     * Gets the value of the tiff property.
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
     * Sets the value of the tiff property.
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
     * Gets the value of the jpeg property.
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
     * Sets the value of the jpeg property.
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
     * Gets the value of the gif property.
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
     * Sets the value of the gif property.
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
     * Gets the value of the bmp property.
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
     * Sets the value of the bmp property.
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
     * Gets the value of the fileNameTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNameTemplate() {
        return fileNameTemplate;
    }

    /**
     * Sets the value of the fileNameTemplate property.
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
