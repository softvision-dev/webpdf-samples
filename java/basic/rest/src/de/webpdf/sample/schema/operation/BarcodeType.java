
package de.webpdf.sample.schema.operation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BarcodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BarcodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="add"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="aztec" type="{http://schema.webpdf.de/1.0/operation}AztecBarcodeType"/&gt;
 *                   &lt;element name="codabar" type="{http://schema.webpdf.de/1.0/operation}CodabarBarcodeType"/&gt;
 *                   &lt;element name="code128" type="{http://schema.webpdf.de/1.0/operation}Code128BarcodeType"/&gt;
 *                   &lt;element name="code39" type="{http://schema.webpdf.de/1.0/operation}Code39BarcodeType"/&gt;
 *                   &lt;element name="datamatrix" type="{http://schema.webpdf.de/1.0/operation}DataMatrixBarcodeType"/&gt;
 *                   &lt;element name="ean13" type="{http://schema.webpdf.de/1.0/operation}Ean13BarcodeType"/&gt;
 *                   &lt;element name="ean8" type="{http://schema.webpdf.de/1.0/operation}Ean8BarcodeType"/&gt;
 *                   &lt;element name="itf" type="{http://schema.webpdf.de/1.0/operation}ItfBarcodeType"/&gt;
 *                   &lt;element name="pdf417" type="{http://schema.webpdf.de/1.0/operation}Pdf417BarcodeType"/&gt;
 *                   &lt;element name="qrcode" type="{http://schema.webpdf.de/1.0/operation}QrBarcodeType"/&gt;
 *                   &lt;element name="upca" type="{http://schema.webpdf.de/1.0/operation}UpcaBarcodeType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="detect"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}BarcodeSelectionType"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="outputFormat" type="{http://schema.webpdf.de/1.0/operation}BarcodeDetectOutputFormatType" default="json" /&gt;
 *                 &lt;attribute name="inputFormat" type="{http://schema.webpdf.de/1.0/operation}BarcodeDetectInputFormatType" default="pdf" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarcodeType", propOrder = {
    "add",
    "detect"
})
public class BarcodeType {

    protected BarcodeType.Add add;
    protected BarcodeType.Detect detect;

    /**
     * Ruft den Wert der add-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeType.Add }
     *     
     */
    public BarcodeType.Add getAdd() {
        return add;
    }

    /**
     * Legt den Wert der add-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeType.Add }
     *     
     */
    public void setAdd(BarcodeType.Add value) {
        this.add = value;
    }

    /**
     * Ruft den Wert der detect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeType.Detect }
     *     
     */
    public BarcodeType.Detect getDetect() {
        return detect;
    }

    /**
     * Legt den Wert der detect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeType.Detect }
     *     
     */
    public void setDetect(BarcodeType.Detect value) {
        this.detect = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="aztec" type="{http://schema.webpdf.de/1.0/operation}AztecBarcodeType"/&gt;
     *         &lt;element name="codabar" type="{http://schema.webpdf.de/1.0/operation}CodabarBarcodeType"/&gt;
     *         &lt;element name="code128" type="{http://schema.webpdf.de/1.0/operation}Code128BarcodeType"/&gt;
     *         &lt;element name="code39" type="{http://schema.webpdf.de/1.0/operation}Code39BarcodeType"/&gt;
     *         &lt;element name="datamatrix" type="{http://schema.webpdf.de/1.0/operation}DataMatrixBarcodeType"/&gt;
     *         &lt;element name="ean13" type="{http://schema.webpdf.de/1.0/operation}Ean13BarcodeType"/&gt;
     *         &lt;element name="ean8" type="{http://schema.webpdf.de/1.0/operation}Ean8BarcodeType"/&gt;
     *         &lt;element name="itf" type="{http://schema.webpdf.de/1.0/operation}ItfBarcodeType"/&gt;
     *         &lt;element name="pdf417" type="{http://schema.webpdf.de/1.0/operation}Pdf417BarcodeType"/&gt;
     *         &lt;element name="qrcode" type="{http://schema.webpdf.de/1.0/operation}QrBarcodeType"/&gt;
     *         &lt;element name="upca" type="{http://schema.webpdf.de/1.0/operation}UpcaBarcodeType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aztecOrCodabarOrCode128"
    })
    public static class Add {

        @XmlElements({
            @XmlElement(name = "aztec", type = AztecBarcodeType.class),
            @XmlElement(name = "codabar", type = CodabarBarcodeType.class),
            @XmlElement(name = "code128", type = Code128BarcodeType.class),
            @XmlElement(name = "code39", type = Code39BarcodeType.class),
            @XmlElement(name = "datamatrix", type = DataMatrixBarcodeType.class),
            @XmlElement(name = "ean13", type = Ean13BarcodeType.class),
            @XmlElement(name = "ean8", type = Ean8BarcodeType.class),
            @XmlElement(name = "itf", type = ItfBarcodeType.class),
            @XmlElement(name = "pdf417", type = Pdf417BarcodeType.class),
            @XmlElement(name = "qrcode", type = QrBarcodeType.class),
            @XmlElement(name = "upca", type = UpcaBarcodeType.class)
        })
        protected List<BaseBarcodeType> aztecOrCodabarOrCode128;

        /**
         * Gets the value of the aztecOrCodabarOrCode128 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aztecOrCodabarOrCode128 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAztecOrCodabarOrCode128().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AztecBarcodeType }
         * {@link CodabarBarcodeType }
         * {@link Code128BarcodeType }
         * {@link Code39BarcodeType }
         * {@link DataMatrixBarcodeType }
         * {@link Ean13BarcodeType }
         * {@link Ean8BarcodeType }
         * {@link ItfBarcodeType }
         * {@link Pdf417BarcodeType }
         * {@link QrBarcodeType }
         * {@link UpcaBarcodeType }
         * 
         * 
         */
        public List<BaseBarcodeType> getAztecOrCodabarOrCode128() {
            if (aztecOrCodabarOrCode128 == null) {
                aztecOrCodabarOrCode128 = new ArrayList<BaseBarcodeType>();
            }
            return this.aztecOrCodabarOrCode128;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}BarcodeSelectionType"/&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="outputFormat" type="{http://schema.webpdf.de/1.0/operation}BarcodeDetectOutputFormatType" default="json" /&gt;
     *       &lt;attribute name="inputFormat" type="{http://schema.webpdf.de/1.0/operation}BarcodeDetectInputFormatType" default="pdf" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "selection"
    })
    public static class Detect {

        protected List<BarcodeSelectionType> selection;
        @XmlAttribute(name = "outputFormat")
        protected BarcodeDetectOutputFormatType outputFormat;
        @XmlAttribute(name = "inputFormat")
        protected BarcodeDetectInputFormatType inputFormat;

        /**
         * Gets the value of the selection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BarcodeSelectionType }
         * 
         * 
         */
        public List<BarcodeSelectionType> getSelection() {
            if (selection == null) {
                selection = new ArrayList<BarcodeSelectionType>();
            }
            return this.selection;
        }

        /**
         * Ruft den Wert der outputFormat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BarcodeDetectOutputFormatType }
         *     
         */
        public BarcodeDetectOutputFormatType getOutputFormat() {
            if (outputFormat == null) {
                return BarcodeDetectOutputFormatType.JSON;
            } else {
                return outputFormat;
            }
        }

        /**
         * Legt den Wert der outputFormat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BarcodeDetectOutputFormatType }
         *     
         */
        public void setOutputFormat(BarcodeDetectOutputFormatType value) {
            this.outputFormat = value;
        }

        /**
         * Ruft den Wert der inputFormat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BarcodeDetectInputFormatType }
         *     
         */
        public BarcodeDetectInputFormatType getInputFormat() {
            if (inputFormat == null) {
                return BarcodeDetectInputFormatType.PDF;
            } else {
                return inputFormat;
            }
        }

        /**
         * Legt den Wert der inputFormat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BarcodeDetectInputFormatType }
         *     
         */
        public void setInputFormat(BarcodeDetectInputFormatType value) {
            this.inputFormat = value;
        }

    }

}
