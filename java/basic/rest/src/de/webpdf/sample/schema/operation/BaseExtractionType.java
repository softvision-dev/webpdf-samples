
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BaseExtractionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseExtractionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="fileFormat" type="{http://schema.webpdf.de/1.0/operation}ExtractionFileFormatType" default="xml" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseExtractionType")
@XmlSeeAlso({
    ExtractionTextType.class,
    ExtractionLinksType.class,
    ExtractionInfoType.class,
    ExtractionWordsType.class,
    ExtractionParagraphsType.class
})
public class BaseExtractionType {

    @XmlAttribute(name = "pages")
    protected String pages;
    @XmlAttribute(name = "fileFormat")
    protected ExtractionFileFormatType fileFormat;

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
            return "";
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
     * Ruft den Wert der fileFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtractionFileFormatType }
     *     
     */
    public ExtractionFileFormatType getFileFormat() {
        if (fileFormat == null) {
            return ExtractionFileFormatType.XML;
        } else {
            return fileFormat;
        }
    }

    /**
     * Legt den Wert der fileFormat-Eigenschaft fest.
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
