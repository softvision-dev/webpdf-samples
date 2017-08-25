
package de.webpdf.sample.schema.operation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billing" type="{http://schema.webpdf.de/1.0/operation}BillingType" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://schema.webpdf.de/1.0/operation}PdfPasswordType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="barcode" type="{http://schema.webpdf.de/1.0/operation}BarcodeType"/&gt;
 *           &lt;element name="converter" type="{http://schema.webpdf.de/1.0/operation}ConverterType"/&gt;
 *           &lt;element name="ocr" type="{http://schema.webpdf.de/1.0/operation}OcrType"/&gt;
 *           &lt;element name="pdfa" type="{http://schema.webpdf.de/1.0/operation}PdfaType"/&gt;
 *           &lt;element name="signature" type="{http://schema.webpdf.de/1.0/operation}SignatureType"/&gt;
 *           &lt;choice maxOccurs="unbounded"&gt;
 *             &lt;element name="annotation" type="{http://schema.webpdf.de/1.0/operation}AnnotationType"/&gt;
 *             &lt;element name="attachment" type="{http://schema.webpdf.de/1.0/operation}AttachmentType"/&gt;
 *             &lt;element name="delete" type="{http://schema.webpdf.de/1.0/operation}DeleteType"/&gt;
 *             &lt;element name="description" type="{http://schema.webpdf.de/1.0/operation}DescriptionType"/&gt;
 *             &lt;element name="extraction" type="{http://schema.webpdf.de/1.0/operation}ExtractionType"/&gt;
 *             &lt;element name="forms" type="{http://schema.webpdf.de/1.0/operation}FormsType"/&gt;
 *             &lt;element name="image" type="{http://schema.webpdf.de/1.0/operation}ImageType"/&gt;
 *             &lt;element name="merge" type="{http://schema.webpdf.de/1.0/operation}MergeType"/&gt;
 *             &lt;element name="options" type="{http://schema.webpdf.de/1.0/operation}OptionsType"/&gt;
 *             &lt;element name="print" type="{http://schema.webpdf.de/1.0/operation}PrintType"/&gt;
 *             &lt;element name="rotate" type="{http://schema.webpdf.de/1.0/operation}RotateType"/&gt;
 *             &lt;element name="security" type="{http://schema.webpdf.de/1.0/operation}SecurityType"/&gt;
 *             &lt;element name="split" type="{http://schema.webpdf.de/1.0/operation}SplitType"/&gt;
 *             &lt;element name="watermark" type="{http://schema.webpdf.de/1.0/operation}WatermarkType"/&gt;
 *             &lt;element name="xmp" type="{http://schema.webpdf.de/1.0/operation}XmpType"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element name="urlconverter" type="{http://schema.webpdf.de/1.0/operation}UrlConverterType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "billing",
    "password",
    "barcode",
    "converter",
    "ocr",
    "pdfa",
    "signature",
    "toolbox",
    "urlconverter"
})
@XmlRootElement(name = "operation")
public class Operation {

    protected BillingType billing;
    protected PdfPasswordType password;
    protected BarcodeType barcode;
    protected ConverterType converter;
    protected OcrType ocr;
    protected PdfaType pdfa;
    protected SignatureType signature;
    @XmlElements({
        @XmlElement(name = "annotation", type = AnnotationType.class),
        @XmlElement(name = "attachment", type = AttachmentType.class),
        @XmlElement(name = "delete", type = DeleteType.class),
        @XmlElement(name = "description", type = DescriptionType.class),
        @XmlElement(name = "extraction", type = ExtractionType.class),
        @XmlElement(name = "forms", type = FormsType.class),
        @XmlElement(name = "image", type = ImageType.class),
        @XmlElement(name = "merge", type = MergeType.class),
        @XmlElement(name = "options", type = OptionsType.class),
        @XmlElement(name = "print", type = PrintType.class),
        @XmlElement(name = "rotate", type = RotateType.class),
        @XmlElement(name = "security", type = SecurityType.class),
        @XmlElement(name = "split", type = SplitType.class),
        @XmlElement(name = "watermark", type = WatermarkType.class),
        @XmlElement(name = "xmp", type = XmpType.class)
    })
    protected List<BaseToolboxType> toolbox;
    protected UrlConverterType urlconverter;

    /**
     * Ruft den Wert der billing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BillingType }
     *     
     */
    public BillingType getBilling() {
        return billing;
    }

    /**
     * Legt den Wert der billing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingType }
     *     
     */
    public void setBilling(BillingType value) {
        this.billing = value;
    }

    /**
     * Ruft den Wert der password-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PdfPasswordType }
     *     
     */
    public PdfPasswordType getPassword() {
        return password;
    }

    /**
     * Legt den Wert der password-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfPasswordType }
     *     
     */
    public void setPassword(PdfPasswordType value) {
        this.password = value;
    }

    /**
     * Ruft den Wert der barcode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeType }
     *     
     */
    public BarcodeType getBarcode() {
        return barcode;
    }

    /**
     * Legt den Wert der barcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeType }
     *     
     */
    public void setBarcode(BarcodeType value) {
        this.barcode = value;
    }

    /**
     * Ruft den Wert der converter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConverterType }
     *     
     */
    public ConverterType getConverter() {
        return converter;
    }

    /**
     * Legt den Wert der converter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConverterType }
     *     
     */
    public void setConverter(ConverterType value) {
        this.converter = value;
    }

    /**
     * Ruft den Wert der ocr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OcrType }
     *     
     */
    public OcrType getOcr() {
        return ocr;
    }

    /**
     * Legt den Wert der ocr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OcrType }
     *     
     */
    public void setOcr(OcrType value) {
        this.ocr = value;
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
     * Gets the value of the toolbox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toolbox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToolbox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationType }
     * {@link AttachmentType }
     * {@link DeleteType }
     * {@link DescriptionType }
     * {@link ExtractionType }
     * {@link FormsType }
     * {@link ImageType }
     * {@link MergeType }
     * {@link OptionsType }
     * {@link PrintType }
     * {@link RotateType }
     * {@link SecurityType }
     * {@link SplitType }
     * {@link WatermarkType }
     * {@link XmpType }
     * 
     * 
     */
    public List<BaseToolboxType> getToolbox() {
        if (toolbox == null) {
            toolbox = new ArrayList<BaseToolboxType>();
        }
        return this.toolbox;
    }

    /**
     * Ruft den Wert der urlconverter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UrlConverterType }
     *     
     */
    public UrlConverterType getUrlconverter() {
        return urlconverter;
    }

    /**
     * Legt den Wert der urlconverter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlConverterType }
     *     
     */
    public void setUrlconverter(UrlConverterType value) {
        this.urlconverter = value;
    }

}
