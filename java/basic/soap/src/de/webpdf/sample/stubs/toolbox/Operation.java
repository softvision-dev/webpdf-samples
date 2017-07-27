
package de.webpdf.sample.stubs.toolbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billing" type="{http://schema.webpdf.de/1.0/operation}BillingType" minOccurs="0"/>
 *         &lt;element name="password" type="{http://schema.webpdf.de/1.0/operation}PdfPasswordType" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="annotation" type="{http://schema.webpdf.de/1.0/operation}AnnotationType"/>
 *           &lt;element name="attachment" type="{http://schema.webpdf.de/1.0/operation}AttachmentType"/>
 *           &lt;element name="delete" type="{http://schema.webpdf.de/1.0/operation}DeleteType"/>
 *           &lt;element name="description" type="{http://schema.webpdf.de/1.0/operation}DescriptionType"/>
 *           &lt;element name="extraction" type="{http://schema.webpdf.de/1.0/operation}ExtractionType"/>
 *           &lt;element name="forms" type="{http://schema.webpdf.de/1.0/operation}FormsType"/>
 *           &lt;element name="image" type="{http://schema.webpdf.de/1.0/operation}ImageType"/>
 *           &lt;element name="merge" type="{http://schema.webpdf.de/1.0/operation}MergeType"/>
 *           &lt;element name="options" type="{http://schema.webpdf.de/1.0/operation}OptionsType"/>
 *           &lt;element name="print" type="{http://schema.webpdf.de/1.0/operation}PrintType"/>
 *           &lt;element name="rotate" type="{http://schema.webpdf.de/1.0/operation}RotateType"/>
 *           &lt;element name="security" type="{http://schema.webpdf.de/1.0/operation}SecurityType"/>
 *           &lt;element name="split" type="{http://schema.webpdf.de/1.0/operation}SplitType"/>
 *           &lt;element name="watermark" type="{http://schema.webpdf.de/1.0/operation}WatermarkType"/>
 *           &lt;element name="xmp" type="{http://schema.webpdf.de/1.0/operation}XmpType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "billing",
    "password",
    "annotationOrAttachmentOrDelete"
})
@XmlRootElement(name = "operation")
public class Operation {

    protected BillingType billing;
    protected PdfPasswordType password;
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
    protected List<BaseToolboxType> annotationOrAttachmentOrDelete;

    /**
     * Gets the value of the billing property.
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
     * Sets the value of the billing property.
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
     * Gets the value of the password property.
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
     * Sets the value of the password property.
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
     * Gets the value of the annotationOrAttachmentOrDelete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotationOrAttachmentOrDelete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationOrAttachmentOrDelete().add(newItem);
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
    public List<BaseToolboxType> getAnnotationOrAttachmentOrDelete() {
        if (annotationOrAttachmentOrDelete == null) {
            annotationOrAttachmentOrDelete = new ArrayList<BaseToolboxType>();
        }
        return this.annotationOrAttachmentOrDelete;
    }

}
