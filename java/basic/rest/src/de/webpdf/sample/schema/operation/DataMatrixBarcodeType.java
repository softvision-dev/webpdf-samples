
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataMatrixBarcodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataMatrixBarcodeType"&gt;
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
 *       &lt;attribute name="shape" type="{http://schema.webpdf.de/1.0/operation}DataMatrixShapeType" default="default" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataMatrixBarcodeType")
public class DataMatrixBarcodeType
    extends BaseBarcodeType
{

    @XmlAttribute(name = "errorCorrection")
    protected Integer errorCorrection;
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
