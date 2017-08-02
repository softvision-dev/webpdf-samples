
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Pdf417BarcodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Pdf417BarcodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType"&gt;
 *       &lt;attribute name="errorCorrection" default="2"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="8"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="compact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="compactionMode" type="{http://schema.webpdf.de/1.0/operation}Pdf417CompactionModeType" default="auto" /&gt;
 *       &lt;attribute name="dataCodewordsMin"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="dataCodewordsMax"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="symbolsPerCodewordMin"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="symbolsPerCodewordMax"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="shape" type="{http://schema.webpdf.de/1.0/operation}DataMatrixShapeType" default="default" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pdf417BarcodeType")
public class Pdf417BarcodeType
    extends BaseBarcodeType
{

    @XmlAttribute(name = "errorCorrection")
    protected Integer errorCorrection;
    @XmlAttribute(name = "compact")
    protected Boolean compact;
    @XmlAttribute(name = "compactionMode")
    protected Pdf417CompactionModeType compactionMode;
    @XmlAttribute(name = "dataCodewordsMin")
    protected Integer dataCodewordsMin;
    @XmlAttribute(name = "dataCodewordsMax")
    protected Integer dataCodewordsMax;
    @XmlAttribute(name = "symbolsPerCodewordMin")
    protected Integer symbolsPerCodewordMin;
    @XmlAttribute(name = "symbolsPerCodewordMax")
    protected Integer symbolsPerCodewordMax;
    @XmlAttribute(name = "shape")
    protected DataMatrixShapeType shape;

    /**
     * Ruft den Wert der errorCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getErrorCorrection() {
        if (errorCorrection == null) {
            return  2;
        } else {
            return errorCorrection;
        }
    }

    /**
     * Legt den Wert der errorCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCorrection(Integer value) {
        this.errorCorrection = value;
    }

    /**
     * Ruft den Wert der compact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCompact() {
        if (compact == null) {
            return false;
        } else {
            return compact;
        }
    }

    /**
     * Legt den Wert der compact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompact(Boolean value) {
        this.compact = value;
    }

    /**
     * Ruft den Wert der compactionMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Pdf417CompactionModeType }
     *     
     */
    public Pdf417CompactionModeType getCompactionMode() {
        if (compactionMode == null) {
            return Pdf417CompactionModeType.AUTO;
        } else {
            return compactionMode;
        }
    }

    /**
     * Legt den Wert der compactionMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Pdf417CompactionModeType }
     *     
     */
    public void setCompactionMode(Pdf417CompactionModeType value) {
        this.compactionMode = value;
    }

    /**
     * Ruft den Wert der dataCodewordsMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataCodewordsMin() {
        return dataCodewordsMin;
    }

    /**
     * Legt den Wert der dataCodewordsMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataCodewordsMin(Integer value) {
        this.dataCodewordsMin = value;
    }

    /**
     * Ruft den Wert der dataCodewordsMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataCodewordsMax() {
        return dataCodewordsMax;
    }

    /**
     * Legt den Wert der dataCodewordsMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataCodewordsMax(Integer value) {
        this.dataCodewordsMax = value;
    }

    /**
     * Ruft den Wert der symbolsPerCodewordMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSymbolsPerCodewordMin() {
        return symbolsPerCodewordMin;
    }

    /**
     * Legt den Wert der symbolsPerCodewordMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSymbolsPerCodewordMin(Integer value) {
        this.symbolsPerCodewordMin = value;
    }

    /**
     * Ruft den Wert der symbolsPerCodewordMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSymbolsPerCodewordMax() {
        return symbolsPerCodewordMax;
    }

    /**
     * Legt den Wert der symbolsPerCodewordMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSymbolsPerCodewordMax(Integer value) {
        this.symbolsPerCodewordMax = value;
    }

    /**
     * Ruft den Wert der shape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataMatrixShapeType }
     *     
     */
    public DataMatrixShapeType getShape() {
        if (shape == null) {
            return DataMatrixShapeType.DEFAULT;
        } else {
            return shape;
        }
    }

    /**
     * Legt den Wert der shape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataMatrixShapeType }
     *     
     */
    public void setShape(DataMatrixShapeType value) {
        this.shape = value;
    }

}
