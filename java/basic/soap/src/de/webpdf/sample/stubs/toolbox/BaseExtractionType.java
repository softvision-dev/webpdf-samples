
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseExtractionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseExtractionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileFormat" type="{http://schema.webpdf.de/1.0/operation}ExtractionFileFormatType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseExtractionType")
@XmlSeeAlso({
    ExtractionLinksType.class,
    ExtractionWordsType.class,
    ExtractionParagraphsType.class,
    ExtractionTextType.class,
    ExtractionInfoType.class
})
public class BaseExtractionType {

    @XmlAttribute(name = "pages")
    protected String pages;
    @XmlAttribute(name = "fileFormat")
    protected ExtractionFileFormatType fileFormat;

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
     * Gets the value of the fileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractionFileFormatType }
     *     
     */
    public ExtractionFileFormatType getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets the value of the fileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractionFileFormatType }
     *     
     */
    public void setFileFormat(ExtractionFileFormatType value) {
        this.fileFormat = value;
    }

}
