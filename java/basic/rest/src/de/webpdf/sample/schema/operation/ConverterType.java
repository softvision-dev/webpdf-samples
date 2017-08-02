
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConverterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConverterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="page" type="{http://schema.webpdf.de/1.0/operation}PageType" minOccurs="0"/&gt;
 *         &lt;element name="pdfa" type="{http://schema.webpdf.de/1.0/operation}PdfaType" minOccurs="0"/&gt;
 *         &lt;element name="signature" type="{http://schema.webpdf.de/1.0/operation}SignatureType" minOccurs="0"/&gt;
 *         &lt;element name="html" type="{http://schema.webpdf.de/1.0/operation}ConverterHtmlType" minOccurs="0"/&gt;
 *         &lt;element name="mail" type="{http://schema.webpdf.de/1.0/operation}ConverterMailType" minOccurs="0"/&gt;
 *         &lt;element name="officeBridge" type="{http://schema.webpdf.de/1.0/operation}OfficeBridgeType" minOccurs="0"/&gt;
 *         &lt;element name="sharePointBridge" type="{http://schema.webpdf.de/1.0/operation}SharePointBridgeType" minOccurs="0"/&gt;
 *         &lt;element name="report" type="{http://schema.webpdf.de/1.0/operation}ConverterReportType" minOccurs="0"/&gt;
 *         &lt;element name="template" type="{http://schema.webpdf.de/1.0/operation}ConverterTemplateType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="compression" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="jpegQuality" default="90"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="100"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="reduceResolution" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="dpi" default="300"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schema.webpdf.de/1.0/operation}DpiType"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="embedFonts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="accessPassword" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="fileExtension" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="maxRecursion" default="1"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterType", propOrder = {

})
public class ConverterType {

    protected PageType page;
    protected PdfaType pdfa;
    protected SignatureType signature;
    protected ConverterHtmlType html;
    protected ConverterMailType mail;
    protected OfficeBridgeType officeBridge;
    protected SharePointBridgeType sharePointBridge;
    protected ConverterReportType report;
    protected ConverterTemplateType template;
    @XmlAttribute(name = "pages")
    protected String pages;
    @XmlAttribute(name = "compression")
    protected Boolean compression;
    @XmlAttribute(name = "jpegQuality")
    protected Integer jpegQuality;
    @XmlAttribute(name = "reduceResolution")
    protected Boolean reduceResolution;
    @XmlAttribute(name = "dpi")
    protected Integer dpi;
    @XmlAttribute(name = "embedFonts")
    protected Boolean embedFonts;
    @XmlAttribute(name = "accessPassword")
    protected String accessPassword;
    @XmlAttribute(name = "fileExtension")
    protected String fileExtension;
    @XmlAttribute(name = "maxRecursion")
    protected Integer maxRecursion;

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
     * Ruft den Wert der pdfa-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PdfaType }
     *     
     */
    public PdfaType getPdfa() {
        return pdfa;
    }

    /**
     * Legt den Wert der pdfa-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfaType }
     *     
     */
    public void setPdfa(PdfaType value) {
        this.pdfa = value;
    }

    /**
     * Ruft den Wert der signature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Legt den Wert der signature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Ruft den Wert der html-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConverterHtmlType }
     *     
     */
    public ConverterHtmlType getHtml() {
        return html;
    }

    /**
     * Legt den Wert der html-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConverterHtmlType }
     *     
     */
    public void setHtml(ConverterHtmlType value) {
        this.html = value;
    }

    /**
     * Ruft den Wert der mail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConverterMailType }
     *     
     */
    public ConverterMailType getMail() {
        return mail;
    }

    /**
     * Legt den Wert der mail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConverterMailType }
     *     
     */
    public void setMail(ConverterMailType value) {
        this.mail = value;
    }

    /**
     * Ruft den Wert der officeBridge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OfficeBridgeType }
     *     
     */
    public OfficeBridgeType getOfficeBridge() {
        return officeBridge;
    }

    /**
     * Legt den Wert der officeBridge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeBridgeType }
     *     
     */
    public void setOfficeBridge(OfficeBridgeType value) {
        this.officeBridge = value;
    }

    /**
     * Ruft den Wert der sharePointBridge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SharePointBridgeType }
     *     
     */
    public SharePointBridgeType getSharePointBridge() {
        return sharePointBridge;
    }

    /**
     * Legt den Wert der sharePointBridge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SharePointBridgeType }
     *     
     */
    public void setSharePointBridge(SharePointBridgeType value) {
        this.sharePointBridge = value;
    }

    /**
     * Ruft den Wert der report-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConverterReportType }
     *     
     */
    public ConverterReportType getReport() {
        return report;
    }

    /**
     * Legt den Wert der report-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConverterReportType }
     *     
     */
    public void setReport(ConverterReportType value) {
        this.report = value;
    }

    /**
     * Ruft den Wert der template-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConverterTemplateType }
     *     
     */
    public ConverterTemplateType getTemplate() {
        return template;
    }

    /**
     * Legt den Wert der template-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConverterTemplateType }
     *     
     */
    public void setTemplate(ConverterTemplateType value) {
        this.template = value;
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
     * Ruft den Wert der compression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCompression() {
        if (compression == null) {
            return true;
        } else {
            return compression;
        }
    }

    /**
     * Legt den Wert der compression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompression(Boolean value) {
        this.compression = value;
    }

    /**
     * Ruft den Wert der jpegQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getJpegQuality() {
        if (jpegQuality == null) {
            return  90;
        } else {
            return jpegQuality;
        }
    }

    /**
     * Legt den Wert der jpegQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJpegQuality(Integer value) {
        this.jpegQuality = value;
    }

    /**
     * Ruft den Wert der reduceResolution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReduceResolution() {
        if (reduceResolution == null) {
            return false;
        } else {
            return reduceResolution;
        }
    }

    /**
     * Legt den Wert der reduceResolution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReduceResolution(Boolean value) {
        this.reduceResolution = value;
    }

    /**
     * Ruft den Wert der dpi-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDpi() {
        if (dpi == null) {
            return  300;
        } else {
            return dpi;
        }
    }

    /**
     * Legt den Wert der dpi-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDpi(Integer value) {
        this.dpi = value;
    }

    /**
     * Ruft den Wert der embedFonts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmbedFonts() {
        if (embedFonts == null) {
            return false;
        } else {
            return embedFonts;
        }
    }

    /**
     * Legt den Wert der embedFonts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmbedFonts(Boolean value) {
        this.embedFonts = value;
    }

    /**
     * Ruft den Wert der accessPassword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPassword() {
        if (accessPassword == null) {
            return "";
        } else {
            return accessPassword;
        }
    }

    /**
     * Legt den Wert der accessPassword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessPassword(String value) {
        this.accessPassword = value;
    }

    /**
     * Ruft den Wert der fileExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileExtension() {
        if (fileExtension == null) {
            return "";
        } else {
            return fileExtension;
        }
    }

    /**
     * Legt den Wert der fileExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileExtension(String value) {
        this.fileExtension = value;
    }

    /**
     * Ruft den Wert der maxRecursion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxRecursion() {
        if (maxRecursion == null) {
            return  1;
        } else {
            return maxRecursion;
        }
    }

    /**
     * Legt den Wert der maxRecursion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRecursion(Integer value) {
        this.maxRecursion = value;
    }

}
