
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XmpNamespaceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XmpNamespaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="namespaceName" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="namespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="namespaceURI" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmpNamespaceType")
public class XmpNamespaceType {

    @XmlAttribute(name = "namespaceName")
    protected String namespaceName;
    @XmlAttribute(name = "namespacePrefix")
    protected String namespacePrefix;
    @XmlAttribute(name = "namespaceURI")
    protected String namespaceURI;

    /**
     * Ruft den Wert der namespaceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespaceName() {
        if (namespaceName == null) {
            return "";
        } else {
            return namespaceName;
        }
    }

    /**
     * Legt den Wert der namespaceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespaceName(String value) {
        this.namespaceName = value;
    }

    /**
     * Ruft den Wert der namespacePrefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespacePrefix() {
        if (namespacePrefix == null) {
            return "";
        } else {
            return namespacePrefix;
        }
    }

    /**
     * Legt den Wert der namespacePrefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespacePrefix(String value) {
        this.namespacePrefix = value;
    }

    /**
     * Ruft den Wert der namespaceURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespaceURI() {
        if (namespaceURI == null) {
            return "";
        } else {
            return namespaceURI;
        }
    }

    /**
     * Legt den Wert der namespaceURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespaceURI(String value) {
        this.namespaceURI = value;
    }

}
