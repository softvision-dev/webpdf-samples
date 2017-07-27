
package de.webpdf.sample.stubs.barcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pdf417BarcodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pdf417BarcodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="errorCorrection" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="compact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="compactionMode" type="{http://schema.webpdf.de/1.0/operation}Pdf417CompactionModeType" />
 *       &lt;attribute name="dataCodewordsMin" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="dataCodewordsMax" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="symbolsPerCodewordMin" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="symbolsPerCodewordMax" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="shape" type="{http://schema.webpdf.de/1.0/operation}DataMatrixShapeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the errorCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCorrection() {
        return errorCorrection;
    }

    /**
     * Sets the value of the errorCorrection property.
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
     * Gets the value of the compact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompact() {
        return compact;
    }

    /**
     * Sets the value of the compact property.
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
     * Gets the value of the compactionMode property.
     * 
     * @return
     *     possible object is
     *     {@link Pdf417CompactionModeType }
     *     
     */
    public Pdf417CompactionModeType getCompactionMode() {
        return compactionMode;
    }

    /**
     * Sets the value of the compactionMode property.
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
     * Gets the value of the dataCodewordsMin property.
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
     * Sets the value of the dataCodewordsMin property.
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
     * Gets the value of the dataCodewordsMax property.
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
     * Sets the value of the dataCodewordsMax property.
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
     * Gets the value of the symbolsPerCodewordMin property.
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
     * Sets the value of the symbolsPerCodewordMin property.
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
     * Gets the value of the symbolsPerCodewordMax property.
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
     * Sets the value of the symbolsPerCodewordMax property.
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
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link DataMatrixShapeType }
     *     
     */
    public DataMatrixShapeType getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
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
