
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für QrBarcodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QrBarcodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType"&gt;
 *       &lt;attribute name="errorCorrection" type="{http://schema.webpdf.de/1.0/operation}QrCodeErrorCorrectionType" default="l" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QrBarcodeType")
public class QrBarcodeType
    extends BaseBarcodeType
{

    @XmlAttribute(name = "errorCorrection")
    protected QrCodeErrorCorrectionType errorCorrection;

    /**
     * Ruft den Wert der errorCorrection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QrCodeErrorCorrectionType }
     *     
     */
    public QrCodeErrorCorrectionType getErrorCorrection() {
        if (errorCorrection == null) {
            return QrCodeErrorCorrectionType.L;
        } else {
            return errorCorrection;
        }
    }

    /**
     * Legt den Wert der errorCorrection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QrCodeErrorCorrectionType }
     *     
     */
    public void setErrorCorrection(QrCodeErrorCorrectionType value) {
        this.errorCorrection = value;
    }

}
