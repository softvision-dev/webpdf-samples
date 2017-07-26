
package de.webpdf.sample.stubs.converter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contentProblems" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fontAliasUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fontIsMissing" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterReportType")
public class ConverterReportType {

    @XmlAttribute(name = "contentProblems")
    protected Boolean contentProblems;
    @XmlAttribute(name = "fontAliasUsage")
    protected Boolean fontAliasUsage;
    @XmlAttribute(name = "fontIsMissing")
    protected Boolean fontIsMissing;

    /**
     * Gets the value of the contentProblems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContentProblems() {
        return contentProblems;
    }

    /**
     * Sets the value of the contentProblems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentProblems(Boolean value) {
        this.contentProblems = value;
    }

    /**
     * Gets the value of the fontAliasUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFontAliasUsage() {
        return fontAliasUsage;
    }

    /**
     * Sets the value of the fontAliasUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFontAliasUsage(Boolean value) {
        this.fontAliasUsage = value;
    }

    /**
     * Gets the value of the fontIsMissing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFontIsMissing() {
        return fontIsMissing;
    }

    /**
     * Sets the value of the fontIsMissing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFontIsMissing(Boolean value) {
        this.fontIsMissing = value;
    }

}
