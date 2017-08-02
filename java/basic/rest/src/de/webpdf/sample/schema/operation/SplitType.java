
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SplitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SplitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;attribute name="mode" type="{http://schema.webpdf.de/1.0/operation}SplitModeType" default="last" /&gt;
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
 *       &lt;attribute name="startPage" default="1"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fileNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" default="page[%d]" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SplitModeType }
     *     
     */
    public SplitModeType getMode() {
        if (mode == null) {
            return SplitModeType.LAST;
        } else {
            return mode;
        }
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
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
     * Ruft den Wert der pages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPages() {
        if (pages == null) {
            return "1";
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
     * Ruft den Wert der startPage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getStartPage() {
        if (startPage == null) {
            return  1;
        } else {
            return startPage;
        }
    }

    /**
     * Legt den Wert der startPage-Eigenschaft fest.
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
     * Ruft den Wert der fileNameTemplate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNameTemplate() {
        if (fileNameTemplate == null) {
            return "page[%d]";
        } else {
            return fileNameTemplate;
        }
    }

    /**
     * Legt den Wert der fileNameTemplate-Eigenschaft fest.
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
