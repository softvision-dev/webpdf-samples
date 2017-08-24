
package de.webpdf.sample.schema.operation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
        "aztec",
        "codabar",
        "code128",
        "code39",
        "datamatrix",
        "ean13",
        "ean8",
        "itf",
        "pdf417",
        "qrcode",
        "upca"
    })
    public static class Add {

        protected List<AztecBarcodeType> aztec;
        protected List<CodabarBarcodeType> codabar;
        protected List<Code128BarcodeType> code128;
        protected List<Code39BarcodeType> code39;
        protected List<DataMatrixBarcodeType> datamatrix;
        protected List<Ean13BarcodeType> ean13;
        protected List<Ean8BarcodeType> ean8;
        protected List<ItfBarcodeType> itf;
        protected List<Pdf417BarcodeType> pdf417;
        protected List<QrBarcodeType> qrcode;
        protected List<UpcaBarcodeType> upca;

        /**
         * Gets the value of the aztec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aztec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAztec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AztecBarcodeType }
         * 
         * 
         */
        public List<AztecBarcodeType> getAztec() {
            if (aztec == null) {
                aztec = new ArrayList<AztecBarcodeType>();
            }
            return this.aztec;
        }

        /**
         * Gets the value of the codabar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codabar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodabar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodabarBarcodeType }
         * 
         * 
         */
        public List<CodabarBarcodeType> getCodabar() {
            if (codabar == null) {
                codabar = new ArrayList<CodabarBarcodeType>();
            }
            return this.codabar;
        }

        /**
         * Gets the value of the code128 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the code128 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCode128().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Code128BarcodeType }
         * 
         * 
         */
        public List<Code128BarcodeType> getCode128() {
            if (code128 == null) {
                code128 = new ArrayList<Code128BarcodeType>();
            }
            return this.code128;
        }

        /**
         * Gets the value of the code39 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the code39 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCode39().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Code39BarcodeType }
         * 
         * 
         */
        public List<Code39BarcodeType> getCode39() {
            if (code39 == null) {
                code39 = new ArrayList<Code39BarcodeType>();
            }
            return this.code39;
        }

        /**
         * Gets the value of the datamatrix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datamatrix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDatamatrix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataMatrixBarcodeType }
         * 
         * 
         */
        public List<DataMatrixBarcodeType> getDatamatrix() {
            if (datamatrix == null) {
                datamatrix = new ArrayList<DataMatrixBarcodeType>();
            }
            return this.datamatrix;
        }

        /**
         * Gets the value of the ean13 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ean13 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEan13().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ean13BarcodeType }
         * 
         * 
         */
        public List<Ean13BarcodeType> getEan13() {
            if (ean13 == null) {
                ean13 = new ArrayList<Ean13BarcodeType>();
            }
            return this.ean13;
        }

        /**
         * Gets the value of the ean8 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ean8 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEan8().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ean8BarcodeType }
         * 
         * 
         */
        public List<Ean8BarcodeType> getEan8() {
            if (ean8 == null) {
                ean8 = new ArrayList<Ean8BarcodeType>();
            }
            return this.ean8;
        }

        /**
         * Gets the value of the itf property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itf property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItf().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItfBarcodeType }
         * 
         * 
         */
        public List<ItfBarcodeType> getItf() {
            if (itf == null) {
                itf = new ArrayList<ItfBarcodeType>();
            }
            return this.itf;
        }

        /**
         * Gets the value of the pdf417 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pdf417 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPdf417().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Pdf417BarcodeType }
         * 
         * 
         */
        public List<Pdf417BarcodeType> getPdf417() {
            if (pdf417 == null) {
                pdf417 = new ArrayList<Pdf417BarcodeType>();
            }
            return this.pdf417;
        }

        /**
         * Gets the value of the qrcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the qrcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQrcode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QrBarcodeType }
         * 
         * 
         */
        public List<QrBarcodeType> getQrcode() {
            if (qrcode == null) {
                qrcode = new ArrayList<QrBarcodeType>();
            }
            return this.qrcode;
        }

        /**
         * Gets the value of the upca property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the upca property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUpca().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpcaBarcodeType }
         * 
         * 
         */
        public List<UpcaBarcodeType> getUpca() {
            if (upca == null) {
                upca = new ArrayList<UpcaBarcodeType>();
            }
            return this.upca;
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
