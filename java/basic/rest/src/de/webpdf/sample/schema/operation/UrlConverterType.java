
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UrlConverterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UrlConverterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="basicAuth" type="{http://schema.webpdf.de/1.0/operation}HttpBasicAuthType" minOccurs="0"/&gt;
 *         &lt;element name="page" type="{http://schema.webpdf.de/1.0/operation}PageType" minOccurs="0"/&gt;
 *         &lt;element name="proxy" type="{http://schema.webpdf.de/1.0/operation}HttpProxyType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrlConverterType", propOrder = {

})
public class UrlConverterType {

    protected HttpBasicAuthType basicAuth;
    protected PageType page;
    protected HttpProxyType proxy;
    @XmlAttribute(name = "url")
    protected String url;

    /**
     * Ruft den Wert der basicAuth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HttpBasicAuthType }
     *     
     */
    public HttpBasicAuthType getBasicAuth() {
        return basicAuth;
    }

    /**
     * Legt den Wert der basicAuth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpBasicAuthType }
     *     
     */
    public void setBasicAuth(HttpBasicAuthType value) {
        this.basicAuth = value;
    }

    /**
     * Ruft den Wert der page-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PageType }
     *     
     */
    public PageType getPage() {
        return page;
    }

    /**
     * Legt den Wert der page-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PageType }
     *     
     */
    public void setPage(PageType value) {
        this.page = value;
    }

    /**
     * Ruft den Wert der proxy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HttpProxyType }
     *     
     */
    public HttpProxyType getProxy() {
        return proxy;
    }

    /**
     * Legt den Wert der proxy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpProxyType }
     *     
     */
    public void setProxy(HttpProxyType value) {
        this.proxy = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        if (url == null) {
            return "";
        } else {
            return url;
        }
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
