
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConverterReportType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConverterReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="contentProblems" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="fontAliasUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="fontIsMissing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Ruft den Wert der contentProblems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContentProblems() {
        if (contentProblems == null) {
            return false;
        } else {
            return contentProblems;
        }
    }

    /**
     * Legt den Wert der contentProblems-Eigenschaft fest.
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
     * Ruft den Wert der fontAliasUsage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFontAliasUsage() {
        if (fontAliasUsage == null) {
            return false;
        } else {
            return fontAliasUsage;
        }
    }

    /**
     * Legt den Wert der fontAliasUsage-Eigenschaft fest.
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
     * Ruft den Wert der fontIsMissing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFontIsMissing() {
        if (fontIsMissing == null) {
            return false;
        } else {
            return fontIsMissing;
        }
    }

    /**
     * Legt den Wert der fontIsMissing-Eigenschaft fest.
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
