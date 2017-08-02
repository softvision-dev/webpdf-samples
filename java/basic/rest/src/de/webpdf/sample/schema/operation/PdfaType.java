
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PdfaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PdfaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="convert"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="zugferd" type="{http://schema.webpdf.de/1.0/operation}ZugferdType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attribute name="level" type="{http://schema.webpdf.de/1.0/operation}PdfaLevelType" default="3b" /&gt;
 *                 &lt;attribute name="imageQuality" default="75"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                       &lt;minInclusive value="0"/&gt;
 *                       &lt;maxInclusive value="100"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="errorReport" type="{http://schema.webpdf.de/1.0/operation}PdfaErrorReportType" default="none" /&gt;
 *                 &lt;attribute name="successReport" type="{http://schema.webpdf.de/1.0/operation}PdfaSuccessReportType" default="none" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="analyze"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="level" type="{http://schema.webpdf.de/1.0/operation}PdfaLevelType" default="3b" /&gt;
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
@XmlType(name = "PdfaType", propOrder = {
    "convert",
    "analyze"
})
public class PdfaType {

    protected PdfaType.Convert convert;
    protected PdfaType.Analyze analyze;

    /**
     * Ruft den Wert der convert-Eigenschaft ab.
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
     * Legt den Wert der convert-Eigenschaft fest.
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
     * Ruft den Wert der analyze-Eigenschaft ab.
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
     * Legt den Wert der analyze-Eigenschaft fest.
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
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="level" type="{http://schema.webpdf.de/1.0/operation}PdfaLevelType" default="3b" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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
         * Ruft den Wert der level-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLevel() {
            if (level == null) {
                return "3b";
            } else {
                return level;
            }
        }

        /**
         * Legt den Wert der level-Eigenschaft fest.
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
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="zugferd" type="{http://schema.webpdf.de/1.0/operation}ZugferdType" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attribute name="level" type="{http://schema.webpdf.de/1.0/operation}PdfaLevelType" default="3b" /&gt;
     *       &lt;attribute name="imageQuality" default="75"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *             &lt;minInclusive value="0"/&gt;
     *             &lt;maxInclusive value="100"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="errorReport" type="{http://schema.webpdf.de/1.0/operation}PdfaErrorReportType" default="none" /&gt;
     *       &lt;attribute name="successReport" type="{http://schema.webpdf.de/1.0/operation}PdfaSuccessReportType" default="none" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

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
         * Ruft den Wert der zugferd-Eigenschaft ab.
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
         * Legt den Wert der zugferd-Eigenschaft fest.
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
         * Ruft den Wert der level-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLevel() {
            if (level == null) {
                return "3b";
            } else {
                return level;
            }
        }

        /**
         * Legt den Wert der level-Eigenschaft fest.
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
         * Ruft den Wert der imageQuality-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getImageQuality() {
            if (imageQuality == null) {
                return  75;
            } else {
                return imageQuality;
            }
        }

        /**
         * Legt den Wert der imageQuality-Eigenschaft fest.
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
         * Ruft den Wert der errorReport-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link PdfaErrorReportType }
         *     
         */
        public PdfaErrorReportType getErrorReport() {
            if (errorReport == null) {
                return PdfaErrorReportType.NONE;
            } else {
                return errorReport;
            }
        }

        /**
         * Legt den Wert der errorReport-Eigenschaft fest.
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
         * Ruft den Wert der successReport-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link PdfaSuccessReportType }
         *     
         */
        public PdfaSuccessReportType getSuccessReport() {
            if (successReport == null) {
                return PdfaSuccessReportType.NONE;
            } else {
                return successReport;
            }
        }

        /**
         * Legt den Wert der successReport-Eigenschaft fest.
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
