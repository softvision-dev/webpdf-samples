
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExtractionWordsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExtractionWordsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseExtractionType"&gt;
 *       &lt;attribute name="removePunctuation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="delimitAfterPunctuation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="extendedSequenceCharacters" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtractionWordsType")
public class ExtractionWordsType
    extends BaseExtractionType
{

    @XmlAttribute(name = "removePunctuation")
    protected Boolean removePunctuation;
    @XmlAttribute(name = "delimitAfterPunctuation")
    protected Boolean delimitAfterPunctuation;
    @XmlAttribute(name = "extendedSequenceCharacters")
    protected Boolean extendedSequenceCharacters;

    /**
     * Ruft den Wert der removePunctuation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRemovePunctuation() {
        if (removePunctuation == null) {
            return false;
        } else {
            return removePunctuation;
        }
    }

    /**
     * Legt den Wert der removePunctuation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemovePunctuation(Boolean value) {
        this.removePunctuation = value;
    }

    /**
     * Ruft den Wert der delimitAfterPunctuation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDelimitAfterPunctuation() {
        if (delimitAfterPunctuation == null) {
            return true;
        } else {
            return delimitAfterPunctuation;
        }
    }

    /**
     * Legt den Wert der delimitAfterPunctuation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelimitAfterPunctuation(Boolean value) {
        this.delimitAfterPunctuation = value;
    }

    /**
     * Ruft den Wert der extendedSequenceCharacters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExtendedSequenceCharacters() {
        if (extendedSequenceCharacters == null) {
            return false;
        } else {
            return extendedSequenceCharacters;
        }
    }

    /**
     * Legt den Wert der extendedSequenceCharacters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtendedSequenceCharacters(Boolean value) {
        this.extendedSequenceCharacters = value;
    }

}
