
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XmpType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XmpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="namespace" type="{http://schema.webpdf.de/1.0/operation}XmpNamespaceType"/&gt;
 *         &lt;element name="data" type="{http://schema.webpdf.de/1.0/operation}XmpFileDataType"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="dataFormat" default="json"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schema.webpdf.de/1.0/operation}XmpDataFormatType"&gt;
 *             &lt;enumeration value="json"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    protected XmpFileDataType data;
    @XmlAttribute(name = "dataFormat")
    protected XmpDataFormatType dataFormat;

    /**
     * Ruft den Wert der namespace-Eigenschaft ab.
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
     * Legt den Wert der namespace-Eigenschaft fest.
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
     * Ruft den Wert der data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XmpFileDataType }
     *     
     */
    public XmpFileDataType getData() {
        return data;
    }

    /**
     * Legt den Wert der data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XmpFileDataType }
     *     
     */
    public void setData(XmpFileDataType value) {
        this.data = value;
    }

    /**
     * Ruft den Wert der dataFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XmpDataFormatType }
     *     
     */
    public XmpDataFormatType getDataFormat() {
        if (dataFormat == null) {
            return XmpDataFormatType.JSON;
        } else {
            return dataFormat;
        }
    }

    /**
     * Legt den Wert der dataFormat-Eigenschaft fest.
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
