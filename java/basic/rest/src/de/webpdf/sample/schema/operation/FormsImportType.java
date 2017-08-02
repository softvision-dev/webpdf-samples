
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FormsImportType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FormsImportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}FormsBaseType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="data" type="{http://schema.webpdf.de/1.0/operation}FormsFileDataType"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="flatten" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="format" type="{http://schema.webpdf.de/1.0/operation}FormsFormatType" default="xml" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormsImportType", propOrder = {
    "data"
})
public class FormsImportType
    extends FormsBaseType
{

    @XmlElement(required = true)
    protected FormsFileDataType data;
    @XmlAttribute(name = "flatten")
    protected Boolean flatten;
    @XmlAttribute(name = "format")
    protected FormsFormatType format;

    /**
     * Ruft den Wert der data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FormsFileDataType }
     *     
     */
    public FormsFileDataType getData() {
        return data;
    }

    /**
     * Legt den Wert der data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FormsFileDataType }
     *     
     */
    public void setData(FormsFileDataType value) {
        this.data = value;
    }

    /**
     * Ruft den Wert der flatten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFlatten() {
        if (flatten == null) {
            return false;
        } else {
            return flatten;
        }
    }

    /**
     * Legt den Wert der flatten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlatten(Boolean value) {
        this.flatten = value;
    }

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

}
