
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AztecBarcodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AztecBarcodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType"&gt;
 *       &lt;attribute name="errorCorrection" default="7"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="100"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="layers" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="-4"/&gt;
 *             &lt;maxInclusive value="32"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AztecBarcodeType")
public class AztecBarcodeType
    extends BaseBarcodeType
{

    @XmlAttribute(name = "errorCorrection")
    protected Integer errorCorrection;
    @XmlAttribute(name = "layers")
    protected Integer layers;

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
            return  7;
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
     * Ruft den Wert der layers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLayers() {
        if (layers == null) {
            return  0;
        } else {
            return layers;
        }
    }

    /**
     * Legt den Wert der layers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLayers(Integer value) {
        this.layers = value;
    }

}
