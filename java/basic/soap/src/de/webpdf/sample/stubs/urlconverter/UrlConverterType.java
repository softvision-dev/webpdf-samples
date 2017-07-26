
package de.webpdf.sample.stubs.urlconverter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrlConverterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrlConverterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="basicAuth" type="{http://schema.webpdf.de/1.0/operation}HttpBasicAuthType" minOccurs="0"/>
 *         &lt;element name="page" type="{http://schema.webpdf.de/1.0/operation}PageType" minOccurs="0"/>
 *         &lt;element name="proxy" type="{http://schema.webpdf.de/1.0/operation}HttpProxyType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the basicAuth property.
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
     * Sets the value of the basicAuth property.
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
     * Gets the value of the page property.
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
     * Sets the value of the page property.
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
     * Gets the value of the proxy property.
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
     * Sets the value of the proxy property.
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
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
