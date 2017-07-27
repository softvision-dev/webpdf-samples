
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SplitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="mode" type="{http://schema.webpdf.de/1.0/operation}SplitModeType" />
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startPage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="fileNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitType")
public class SplitType
    extends BaseToolboxType
{

    @XmlAttribute(name = "mode")
    protected SplitModeType mode;
    @XmlAttribute(name = "pages")
    protected String pages;
    @XmlAttribute(name = "startPage")
    protected Integer startPage;
    @XmlAttribute(name = "fileNameTemplate")
    protected String fileNameTemplate;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link SplitModeType }
     *     
     */
    public SplitModeType getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitModeType }
     *     
     */
    public void setMode(SplitModeType value) {
        this.mode = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
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
     * Gets the value of the startPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartPage() {
        return startPage;
    }

    /**
     * Sets the value of the startPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartPage(Integer value) {
        this.startPage = value;
    }

    /**
     * Gets the value of the fileNameTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNameTemplate() {
        return fileNameTemplate;
    }

    /**
     * Sets the value of the fileNameTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNameTemplate(String value) {
        this.fileNameTemplate = value;
    }

}
