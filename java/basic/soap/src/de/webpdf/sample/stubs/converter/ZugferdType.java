
package de.webpdf.sample.stubs.converter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZugferdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZugferdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xmlFile" type="{http://schema.webpdf.de/1.0/operation}ZugferdFileDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZugferdType", propOrder = {
    "xmlFile"
})
public class ZugferdType {

    @XmlElement(required = true)
    protected byte[] xmlFile;

    /**
     * Gets the value of the xmlFile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXmlFile() {
        return xmlFile;
    }

    /**
     * Sets the value of the xmlFile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXmlFile(byte[] value) {
        this.xmlFile = value;
    }

}
