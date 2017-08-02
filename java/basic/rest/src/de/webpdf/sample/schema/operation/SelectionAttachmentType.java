
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SelectionAttachmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SelectionAttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="fileMask" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="context" type="{http://schema.webpdf.de/1.0/operation}ContextType" default="all" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionAttachmentType")
public class SelectionAttachmentType {

    @XmlAttribute(name = "pages")
    protected String pages;
    @XmlAttribute(name = "fileMask")
    protected String fileMask;
    @XmlAttribute(name = "context")
    protected ContextType context;

    /**
     * Ruft den Wert der pages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPages() {
        if (pages == null) {
            return "";
        } else {
            return pages;
        }
    }

    /**
     * Legt den Wert der pages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPages(String value) {
        this.pages = value;
    }

    /**
     * Ruft den Wert der fileMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileMask() {
        return fileMask;
    }

    /**
     * Legt den Wert der fileMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileMask(String value) {
        this.fileMask = value;
    }

    /**
     * Ruft den Wert der context-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContextType }
     *     
     */
    public ContextType getContext() {
        if (context == null) {
            return ContextType.ALL;
        } else {
            return context;
        }
    }

    /**
     * Legt den Wert der context-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextType }
     *     
     */
    public void setContext(ContextType value) {
        this.context = value;
    }

}
