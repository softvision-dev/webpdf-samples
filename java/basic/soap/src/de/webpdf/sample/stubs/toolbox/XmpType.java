
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmpType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *         &lt;element name="namespace" type="{http://schema.webpdf.de/1.0/operation}XmpNamespaceType"/>
 *         &lt;element name="data" type="{http://schema.webpdf.de/1.0/operation}XmpFileDataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dataFormat" type="{http://schema.webpdf.de/1.0/operation}XmpDataFormatType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmpType", propOrder = {
    "namespace",
    "data"
})
public class XmpType
    extends BaseToolboxType
{

    @XmlElement(required = true)
    protected XmpNamespaceType namespace;
    @XmlElement(required = true)
    protected byte[] data;
    @XmlAttribute(name = "dataFormat")
    protected XmpDataFormatType dataFormat;

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link XmpNamespaceType }
     *     
     */
    public XmpNamespaceType getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmpNamespaceType }
     *     
     */
    public void setNamespace(XmpNamespaceType value) {
        this.namespace = value;
    }

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
     * Gets the value of the dataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link XmpDataFormatType }
     *     
     */
    public XmpDataFormatType getDataFormat() {
        return dataFormat;
    }

    /**
     * Sets the value of the dataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmpDataFormatType }
     *     
     */
    public void setDataFormat(XmpDataFormatType value) {
        this.dataFormat = value;
    }

}
