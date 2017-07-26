
package de.webpdf.sample.stubs.converter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="page" type="{http://schema.webpdf.de/1.0/operation}PageType" minOccurs="0"/>
 *         &lt;element name="pdfa" type="{http://schema.webpdf.de/1.0/operation}PdfaType" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://schema.webpdf.de/1.0/operation}SignatureType" minOccurs="0"/>
 *         &lt;element name="html" type="{http://schema.webpdf.de/1.0/operation}ConverterHtmlType" minOccurs="0"/>
 *         &lt;element name="mail" type="{http://schema.webpdf.de/1.0/operation}ConverterMailType" minOccurs="0"/>
 *         &lt;element name="officeBridge" type="{http://schema.webpdf.de/1.0/operation}OfficeBridgeType" minOccurs="0"/>
 *         &lt;element name="sharePointBridge" type="{http://schema.webpdf.de/1.0/operation}SharePointBridgeType" minOccurs="0"/>
 *         &lt;element name="report" type="{http://schema.webpdf.de/1.0/operation}ConverterReportType" minOccurs="0"/>
 *         &lt;element name="template" type="{http://schema.webpdf.de/1.0/operation}ConverterTemplateType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="compression" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="jpegQuality" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="reduceResolution" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dpi" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="embedFonts" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="accessPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileExtension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the pdfa property.
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
     * Sets the value of the pdfa property.
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
     * Gets the value of the signature property.
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
     * Sets the value of the signature property.
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
     * Gets the value of the html property.
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
     * Sets the value of the html property.
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
     * Gets the value of the mail property.
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
     * Sets the value of the mail property.
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
     * Gets the value of the officeBridge property.
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
     * Sets the value of the officeBridge property.
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
     * Gets the value of the sharePointBridge property.
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
     * Sets the value of the sharePointBridge property.
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
     * Gets the value of the report property.
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
     * Sets the value of the report property.
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
     * Gets the value of the template property.
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
     * Sets the value of the template property.
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
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
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

    /**
     * Gets the value of the reduceResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReduceResolution() {
        return reduceResolution;
    }

    /**
     * Sets the value of the reduceResolution property.
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
     * Gets the value of the dpi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDpi() {
        return dpi;
    }

    /**
     * Sets the value of the dpi property.
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
     * Gets the value of the embedFonts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmbedFonts() {
        return embedFonts;
    }

    /**
     * Sets the value of the embedFonts property.
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
     * Gets the value of the accessPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPassword() {
        return accessPassword;
    }

    /**
     * Sets the value of the accessPassword property.
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
     * Gets the value of the fileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * Sets the value of the fileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileExtension(String value) {
        this.fileExtension = value;
    }

}
