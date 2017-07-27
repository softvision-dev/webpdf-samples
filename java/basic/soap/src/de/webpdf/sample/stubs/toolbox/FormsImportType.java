
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormsImportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormsImportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}FormsBaseType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://schema.webpdf.de/1.0/operation}FormsFileDataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="flatten" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="format" type="{http://schema.webpdf.de/1.0/operation}FormsFormatType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    protected byte[] data;
    @XmlAttribute(name = "flatten")
    protected Boolean flatten;
    @XmlAttribute(name = "format")
    protected FormsFormatType format;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the flatten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlatten() {
        return flatten;
    }

    /**
     * Sets the value of the flatten property.
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
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link FormsFormatType }
     *     
     */
    public FormsFormatType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
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
