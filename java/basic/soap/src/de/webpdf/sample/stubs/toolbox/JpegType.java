
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JpegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JpegType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}ImageBaseType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="jpegQuality" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JpegType")
public class JpegType
    extends ImageBaseType
{

    @XmlAttribute(name = "jpegQuality")
    protected Integer jpegQuality;

    /**
     * Gets the value of the jpegQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJpegQuality() {
        return jpegQuality;
    }

    /**
     * Sets the value of the jpegQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJpegQuality(Integer value) {
        this.jpegQuality = value;
    }

}
