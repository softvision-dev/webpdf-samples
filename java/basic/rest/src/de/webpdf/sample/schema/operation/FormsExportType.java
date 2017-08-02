
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FormsExportType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FormsExportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}FormsBaseType"&gt;
 *       &lt;attribute name="format" type="{http://schema.webpdf.de/1.0/operation}FormsFormatType" default="xml" /&gt;
 *       &lt;attribute name="fdfFileName" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormsExportType")
public class FormsExportType
    extends FormsBaseType
{

    @XmlAttribute(name = "format")
    protected FormsFormatType format;
    @XmlAttribute(name = "fdfFileName")
    protected String fdfFileName;

    /**
     * Ruft den Wert der format-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FormsFormatType }
     *     
     */
    public FormsFormatType getFormat() {
        if (format == null) {
            return FormsFormatType.XML;
        } else {
            return format;
        }
    }

    /**
     * Legt den Wert der format-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FormsFormatType }
     *     
     */
    public void setFormat(FormsFormatType value) {
        this.format = value;
    }

    /**
     * Ruft den Wert der fdfFileName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdfFileName() {
        if (fdfFileName == null) {
            return "";
        } else {
            return fdfFileName;
        }
    }

    /**
     * Legt den Wert der fdfFileName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdfFileName(String value) {
        this.fdfFileName = value;
    }

}
