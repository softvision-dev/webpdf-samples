
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="printerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copies" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="autoRotate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="shrinkToMargins" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="expandToMargins" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="centerInPage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintType")
public class PrintType
    extends BaseToolboxType
{

    @XmlAttribute(name = "printerName")
    protected String printerName;
    @XmlAttribute(name = "pages")
    protected String pages;
    @XmlAttribute(name = "jobName")
    protected String jobName;
    @XmlAttribute(name = "copies")
    protected Integer copies;
    @XmlAttribute(name = "autoRotate")
    protected Boolean autoRotate;
    @XmlAttribute(name = "shrinkToMargins")
    protected Boolean shrinkToMargins;
    @XmlAttribute(name = "expandToMargins")
    protected Boolean expandToMargins;
    @XmlAttribute(name = "centerInPage")
    protected Boolean centerInPage;

    /**
     * Gets the value of the printerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterName() {
        return printerName;
    }

    /**
     * Sets the value of the printerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterName(String value) {
        this.printerName = value;
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
     * Gets the value of the jobName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * Sets the value of the jobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobName(String value) {
        this.jobName = value;
    }

    /**
     * Gets the value of the copies property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCopies() {
        return copies;
    }

    /**
     * Sets the value of the copies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCopies(Integer value) {
        this.copies = value;
    }

    /**
     * Gets the value of the autoRotate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRotate() {
        return autoRotate;
    }

    /**
     * Sets the value of the autoRotate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRotate(Boolean value) {
        this.autoRotate = value;
    }

    /**
     * Gets the value of the shrinkToMargins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShrinkToMargins() {
        return shrinkToMargins;
    }

    /**
     * Sets the value of the shrinkToMargins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShrinkToMargins(Boolean value) {
        this.shrinkToMargins = value;
    }

    /**
     * Gets the value of the expandToMargins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpandToMargins() {
        return expandToMargins;
    }

    /**
     * Sets the value of the expandToMargins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpandToMargins(Boolean value) {
        this.expandToMargins = value;
    }

    /**
     * Gets the value of the centerInPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCenterInPage() {
        return centerInPage;
    }

    /**
     * Sets the value of the centerInPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCenterInPage(Boolean value) {
        this.centerInPage = value;
    }

}
