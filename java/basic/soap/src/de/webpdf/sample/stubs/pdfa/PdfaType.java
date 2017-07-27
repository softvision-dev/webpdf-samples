
package de.webpdf.sample.stubs.pdfa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdfaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdfaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convert" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="zugferd" type="{http://schema.webpdf.de/1.0/operation}ZugferdType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="level" type="{http://schema.webpdf.de/1.0/operation}PdfaLevelType" />
 *                 &lt;attribute name="imageQuality" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="errorReport" type="{http://schema.webpdf.de/1.0/operation}PdfaErrorReportType" />
 *                 &lt;attribute name="successReport" type="{http://schema.webpdf.de/1.0/operation}PdfaSuccessReportType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="analyze" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="level" type="{http://schema.webpdf.de/1.0/operation}PdfaLevelType" />
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
@XmlType(name = "PdfaType", propOrder = {
    "convert",
    "analyze"
})
public class PdfaType {

    protected PdfaType.Convert convert;
    protected PdfaType.Analyze analyze;

    /**
     * Gets the value of the convert property.
     * 
     * @return
     *     possible object is
     *     {@link PdfaType.Convert }
     *     
     */
    public PdfaType.Convert getConvert() {
        return convert;
    }

    /**
     * Sets the value of the convert property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfaType.Convert }
     *     
     */
    public void setConvert(PdfaType.Convert value) {
        this.convert = value;
    }

    /**
     * Gets the value of the analyze property.
     * 
     * @return
     *     possible object is
     *     {@link PdfaType.Analyze }
     *     
     */
    public PdfaType.Analyze getAnalyze() {
        return analyze;
    }

    /**
     * Sets the value of the analyze property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfaType.Analyze }
     *     
     */
    public void setAnalyze(PdfaType.Analyze value) {
        this.analyze = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="level" type="{http://schema.webpdf.de/1.0/operation}PdfaLevelType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Analyze {

        @XmlAttribute(name = "level")
        protected String level;

        /**
         * Gets the value of the level property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLevel(String value) {
            this.level = value;
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
     *         &lt;element name="zugferd" type="{http://schema.webpdf.de/1.0/operation}ZugferdType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="level" type="{http://schema.webpdf.de/1.0/operation}PdfaLevelType" />
     *       &lt;attribute name="imageQuality" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="errorReport" type="{http://schema.webpdf.de/1.0/operation}PdfaErrorReportType" />
     *       &lt;attribute name="successReport" type="{http://schema.webpdf.de/1.0/operation}PdfaSuccessReportType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "zugferd"
    })
    public static class Convert {

        protected ZugferdType zugferd;
        @XmlAttribute(name = "level")
        protected String level;
        @XmlAttribute(name = "imageQuality")
        protected Integer imageQuality;
        @XmlAttribute(name = "errorReport")
        protected PdfaErrorReportType errorReport;
        @XmlAttribute(name = "successReport")
        protected PdfaSuccessReportType successReport;

        /**
         * Gets the value of the zugferd property.
         * 
         * @return
         *     possible object is
         *     {@link ZugferdType }
         *     
         */
        public ZugferdType getZugferd() {
            return zugferd;
        }

        /**
         * Sets the value of the zugferd property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZugferdType }
         *     
         */
        public void setZugferd(ZugferdType value) {
            this.zugferd = value;
        }

        /**
         * Gets the value of the level property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLevel(String value) {
            this.level = value;
        }

        /**
         * Gets the value of the imageQuality property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getImageQuality() {
            return imageQuality;
        }

        /**
         * Sets the value of the imageQuality property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setImageQuality(Integer value) {
            this.imageQuality = value;
        }

        /**
         * Gets the value of the errorReport property.
         * 
         * @return
         *     possible object is
         *     {@link PdfaErrorReportType }
         *     
         */
        public PdfaErrorReportType getErrorReport() {
            return errorReport;
        }

        /**
         * Sets the value of the errorReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdfaErrorReportType }
         *     
         */
        public void setErrorReport(PdfaErrorReportType value) {
            this.errorReport = value;
        }

        /**
         * Gets the value of the successReport property.
         * 
         * @return
         *     possible object is
         *     {@link PdfaSuccessReportType }
         *     
         */
        public PdfaSuccessReportType getSuccessReport() {
            return successReport;
        }

        /**
         * Sets the value of the successReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdfaSuccessReportType }
         *     
         */
        public void setSuccessReport(PdfaSuccessReportType value) {
            this.successReport = value;
        }

    }

}
