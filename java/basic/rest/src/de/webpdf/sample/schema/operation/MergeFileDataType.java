
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für MergeFileDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MergeFileDataType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
 *       &lt;attribute name="format" default="pdf"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schema.webpdf.de/1.0/operation}FileDataFormatType"&gt;
 *             &lt;enumeration value="id"/&gt;
 *             &lt;enumeration value="pdf"/&gt;
 *             &lt;enumeration value="zip"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="outlineName" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeFileDataType", propOrder = {
    "value"
})
public class MergeFileDataType {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "format")
    protected FileDataFormatType format;
    @XmlAttribute(name = "outlineName")
    protected String outlineName;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der format-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileDataFormatType }
     *     
     */
    public FileDataFormatType getFormat() {
        if (format == null) {
            return FileDataFormatType.PDF;
        } else {
            return format;
        }
    }

    /**
     * Legt den Wert der format-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDataFormatType }
     *     
     */
    public void setFormat(FileDataFormatType value) {
        this.format = value;
    }

    /**
     * Ruft den Wert der outlineName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlineName() {
        if (outlineName == null) {
            return "";
        } else {
            return outlineName;
        }
    }

    /**
     * Legt den Wert der outlineName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutlineName(String value) {
        this.outlineName = value;
    }

}
