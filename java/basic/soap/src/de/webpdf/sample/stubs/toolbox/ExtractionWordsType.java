
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtractionWordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtractionWordsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseExtractionType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="removePunctuation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="delimitAfterPunctuation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="extendedSequenceCharacters" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the removePunctuation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemovePunctuation() {
        return removePunctuation;
    }

    /**
     * Sets the value of the removePunctuation property.
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
     * Gets the value of the delimitAfterPunctuation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelimitAfterPunctuation() {
        return delimitAfterPunctuation;
    }

    /**
     * Sets the value of the delimitAfterPunctuation property.
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
     * Gets the value of the extendedSequenceCharacters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtendedSequenceCharacters() {
        return extendedSequenceCharacters;
    }

    /**
     * Sets the value of the extendedSequenceCharacters property.
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
