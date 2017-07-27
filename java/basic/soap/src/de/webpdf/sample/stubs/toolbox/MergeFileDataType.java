
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MergeFileDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeFileDataType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="format" type="{http://schema.webpdf.de/1.0/operation}FileDataFormatType" />
 *       &lt;attribute name="outlineName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link FileDataFormatType }
     *     
     */
    public FileDataFormatType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
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
     * Gets the value of the outlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlineName() {
        return outlineName;
    }

    /**
     * Sets the value of the outlineName property.
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
