
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtractionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtractionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://schema.webpdf.de/1.0/operation}ExtractionTextType" minOccurs="0"/>
 *         &lt;element name="links" type="{http://schema.webpdf.de/1.0/operation}ExtractionLinksType" minOccurs="0"/>
 *         &lt;element name="words" type="{http://schema.webpdf.de/1.0/operation}ExtractionWordsType" minOccurs="0"/>
 *         &lt;element name="info" type="{http://schema.webpdf.de/1.0/operation}ExtractionInfoType" minOccurs="0"/>
 *         &lt;element name="paragraphs" type="{http://schema.webpdf.de/1.0/operation}ExtractionParagraphsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtractionType", propOrder = {
    "text",
    "links",
    "words",
    "info",
    "paragraphs"
})
public class ExtractionType
    extends BaseToolboxType
{

    protected ExtractionTextType text;
    protected ExtractionLinksType links;
    protected ExtractionWordsType words;
    protected ExtractionInfoType info;
    protected ExtractionParagraphsType paragraphs;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractionTextType }
     *     
     */
    public ExtractionTextType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractionTextType }
     *     
     */
    public void setText(ExtractionTextType value) {
        this.text = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractionLinksType }
     *     
     */
    public ExtractionLinksType getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractionLinksType }
     *     
     */
    public void setLinks(ExtractionLinksType value) {
        this.links = value;
    }

    /**
     * Gets the value of the words property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractionWordsType }
     *     
     */
    public ExtractionWordsType getWords() {
        return words;
    }

    /**
     * Sets the value of the words property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractionWordsType }
     *     
     */
    public void setWords(ExtractionWordsType value) {
        this.words = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractionInfoType }
     *     
     */
    public ExtractionInfoType getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractionInfoType }
     *     
     */
    public void setInfo(ExtractionInfoType value) {
        this.info = value;
    }

    /**
     * Gets the value of the paragraphs property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractionParagraphsType }
     *     
     */
    public ExtractionParagraphsType getParagraphs() {
        return paragraphs;
    }

    /**
     * Sets the value of the paragraphs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractionParagraphsType }
     *     
     */
    public void setParagraphs(ExtractionParagraphsType value) {
        this.paragraphs = value;
    }

}
