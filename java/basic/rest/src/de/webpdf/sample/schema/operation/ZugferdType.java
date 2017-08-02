
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ZugferdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ZugferdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="xmlFile" type="{http://schema.webpdf.de/1.0/operation}ZugferdFileDataType"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZugferdType", propOrder = {

})
public class ZugferdType {

    @XmlElement(required = true)
    protected ZugferdFileDataType xmlFile;

    /**
     * Ruft den Wert der xmlFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZugferdFileDataType }
     *     
     */
    public ZugferdFileDataType getXmlFile() {
        return xmlFile;
    }

    /**
     * Legt den Wert der xmlFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZugferdFileDataType }
     *     
     */
    public void setXmlFile(ZugferdFileDataType value) {
        this.xmlFile = value;
    }

}
