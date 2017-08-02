
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PrintType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PrintType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;attribute name="printerName" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="jobName" type="{http://www.w3.org/2001/XMLSchema}string" default="webPDF Print Job" /&gt;
 *       &lt;attribute name="copies" default="1"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="autoRotate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="shrinkToMargins" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="expandToMargins" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="centerInPage" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Ruft den Wert der printerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterName() {
        if (printerName == null) {
            return "";
        } else {
            return printerName;
        }
    }

    /**
     * Legt den Wert der printerName-Eigenschaft fest.
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
     * Ruft den Wert der jobName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobName() {
        if (jobName == null) {
            return "webPDF Print Job";
        } else {
            return jobName;
        }
    }

    /**
     * Legt den Wert der jobName-Eigenschaft fest.
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
     * Ruft den Wert der copies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCopies() {
        if (copies == null) {
            return  1;
        } else {
            return copies;
        }
    }

    /**
     * Legt den Wert der copies-Eigenschaft fest.
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
     * Ruft den Wert der autoRotate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoRotate() {
        if (autoRotate == null) {
            return true;
        } else {
            return autoRotate;
        }
    }

    /**
     * Legt den Wert der autoRotate-Eigenschaft fest.
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
     * Ruft den Wert der shrinkToMargins-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShrinkToMargins() {
        if (shrinkToMargins == null) {
            return false;
        } else {
            return shrinkToMargins;
        }
    }

    /**
     * Legt den Wert der shrinkToMargins-Eigenschaft fest.
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
     * Ruft den Wert der expandToMargins-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExpandToMargins() {
        if (expandToMargins == null) {
            return false;
        } else {
            return expandToMargins;
        }
    }

    /**
     * Legt den Wert der expandToMargins-Eigenschaft fest.
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
     * Ruft den Wert der centerInPage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCenterInPage() {
        if (centerInPage == null) {
            return false;
        } else {
            return centerInPage;
        }
    }

    /**
     * Legt den Wert der centerInPage-Eigenschaft fest.
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
