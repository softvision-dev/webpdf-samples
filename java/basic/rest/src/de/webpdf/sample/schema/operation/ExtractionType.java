
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExtractionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExtractionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="text" type="{http://schema.webpdf.de/1.0/operation}ExtractionTextType" minOccurs="0"/&gt;
 *         &lt;element name="links" type="{http://schema.webpdf.de/1.0/operation}ExtractionLinksType" minOccurs="0"/&gt;
 *         &lt;element name="words" type="{http://schema.webpdf.de/1.0/operation}ExtractionWordsType" minOccurs="0"/&gt;
 *         &lt;element name="info" type="{http://schema.webpdf.de/1.0/operation}ExtractionInfoType" minOccurs="0"/&gt;
 *         &lt;element name="paragraphs" type="{http://schema.webpdf.de/1.0/operation}ExtractionParagraphsType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Ruft den Wert der text-Eigenschaft ab.
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
     * Legt den Wert der text-Eigenschaft fest.
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
     * Ruft den Wert der links-Eigenschaft ab.
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
     * Legt den Wert der links-Eigenschaft fest.
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
     * Ruft den Wert der words-Eigenschaft ab.
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
     * Legt den Wert der words-Eigenschaft fest.
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
     * Ruft den Wert der info-Eigenschaft ab.
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
     * Legt den Wert der info-Eigenschaft fest.
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
     * Ruft den Wert der paragraphs-Eigenschaft ab.
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
     * Legt den Wert der paragraphs-Eigenschaft fest.
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
