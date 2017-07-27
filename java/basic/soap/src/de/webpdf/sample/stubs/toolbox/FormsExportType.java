
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormsExportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormsExportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}FormsBaseType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="format" type="{http://schema.webpdf.de/1.0/operation}FormsFormatType" />
 *       &lt;attribute name="fdfFileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormsExportType")
public class FormsExportType
    extends FormsBaseType
{

    @XmlAttribute(name = "format")
    protected FormsFormatType format;
    @XmlAttribute(name = "fdfFileName")
    protected String fdfFileName;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link FormsFormatType }
     *     
     */
    public FormsFormatType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormsFormatType }
     *     
     */
    public void setFormat(FormsFormatType value) {
        this.format = value;
    }

    /**
     * Gets the value of the fdfFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdfFileName() {
        return fdfFileName;
    }

    /**
     * Sets the value of the fdfFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdfFileName(String value) {
        this.fdfFileName = value;
    }

}
