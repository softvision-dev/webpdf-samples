
package de.webpdf.sample.stubs.barcode;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BarcodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="add" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codabar" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ean8" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="pdf417" type="{http://schema.webpdf.de/1.0/operation}Pdf417BarcodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="qrcode" type="{http://schema.webpdf.de/1.0/operation}QrBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="itf" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="upca" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="code128" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="aztec" type="{http://schema.webpdf.de/1.0/operation}AztecBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ean13" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="datamatrix" type="{http://schema.webpdf.de/1.0/operation}DataMatrixBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="code39" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="detect" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}BarcodeSelectionType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="outputFormat" type="{http://schema.webpdf.de/1.0/operation}BarcodeDetectOutputFormatType" />
 *                 &lt;attribute name="inputFormat" type="{http://schema.webpdf.de/1.0/operation}BarcodeDetectInputFormatType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the add property.
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
     * Sets the value of the add property.
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
     * Gets the value of the detect property.
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
     * Sets the value of the detect property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="codabar" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ean8" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="pdf417" type="{http://schema.webpdf.de/1.0/operation}Pdf417BarcodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="qrcode" type="{http://schema.webpdf.de/1.0/operation}QrBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="itf" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="upca" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="code128" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="aztec" type="{http://schema.webpdf.de/1.0/operation}AztecBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ean13" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="datamatrix" type="{http://schema.webpdf.de/1.0/operation}DataMatrixBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="code39" type="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType" maxOccurs="unbounded" minOccurs="0"/>
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
        "codabar",
        "ean8",
        "pdf417",
        "qrcode",
        "itf",
        "upca",
        "code128",
        "aztec",
        "ean13",
        "datamatrix",
        "code39"
    })
    public static class Add {

        @XmlElement(nillable = true)
        protected List<BaseBarcodeType> codabar;
        @XmlElement(nillable = true)
        protected List<BaseBarcodeType> ean8;
        @XmlElement(nillable = true)
        protected List<Pdf417BarcodeType> pdf417;
        @XmlElement(nillable = true)
        protected List<QrBarcodeType> qrcode;
        @XmlElement(nillable = true)
        protected List<BaseBarcodeType> itf;
        @XmlElement(nillable = true)
        protected List<BaseBarcodeType> upca;
        @XmlElement(nillable = true)
        protected List<BaseBarcodeType> code128;
        @XmlElement(nillable = true)
        protected List<AztecBarcodeType> aztec;
        @XmlElement(nillable = true)
        protected List<BaseBarcodeType> ean13;
        @XmlElement(nillable = true)
        protected List<DataMatrixBarcodeType> datamatrix;
        @XmlElement(nillable = true)
        protected List<BaseBarcodeType> code39;

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
         * {@link BaseBarcodeType }
         * 
         * 
         */
        public List<BaseBarcodeType> getCodabar() {
            if (codabar == null) {
                codabar = new ArrayList<BaseBarcodeType>();
            }
            return this.codabar;
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
         * {@link BaseBarcodeType }
         * 
         * 
         */
        public List<BaseBarcodeType> getEan8() {
            if (ean8 == null) {
                ean8 = new ArrayList<BaseBarcodeType>();
            }
            return this.ean8;
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
         * {@link BaseBarcodeType }
         * 
         * 
         */
        public List<BaseBarcodeType> getItf() {
            if (itf == null) {
                itf = new ArrayList<BaseBarcodeType>();
            }
            return this.itf;
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
         * {@link BaseBarcodeType }
         * 
         * 
         */
        public List<BaseBarcodeType> getUpca() {
            if (upca == null) {
                upca = new ArrayList<BaseBarcodeType>();
            }
            return this.upca;
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
         * {@link BaseBarcodeType }
         * 
         * 
         */
        public List<BaseBarcodeType> getCode128() {
            if (code128 == null) {
                code128 = new ArrayList<BaseBarcodeType>();
            }
            return this.code128;
        }

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
         * {@link BaseBarcodeType }
         * 
         * 
         */
        public List<BaseBarcodeType> getEan13() {
            if (ean13 == null) {
                ean13 = new ArrayList<BaseBarcodeType>();
            }
            return this.ean13;
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
         * {@link BaseBarcodeType }
         * 
         * 
         */
        public List<BaseBarcodeType> getCode39() {
            if (code39 == null) {
                code39 = new ArrayList<BaseBarcodeType>();
            }
            return this.code39;
        }

    }


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
     *         &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}BarcodeSelectionType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="outputFormat" type="{http://schema.webpdf.de/1.0/operation}BarcodeDetectOutputFormatType" />
     *       &lt;attribute name="inputFormat" type="{http://schema.webpdf.de/1.0/operation}BarcodeDetectInputFormatType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "selection"
    })
    public static class Detect {

        @XmlElement(nillable = true)
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
         * Gets the value of the outputFormat property.
         * 
         * @return
         *     possible object is
         *     {@link BarcodeDetectOutputFormatType }
         *     
         */
        public BarcodeDetectOutputFormatType getOutputFormat() {
            return outputFormat;
        }

        /**
         * Sets the value of the outputFormat property.
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
         * Gets the value of the inputFormat property.
         * 
         * @return
         *     possible object is
         *     {@link BarcodeDetectInputFormatType }
         *     
         */
        public BarcodeDetectInputFormatType getInputFormat() {
            return inputFormat;
        }

        /**
         * Sets the value of the inputFormat property.
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
