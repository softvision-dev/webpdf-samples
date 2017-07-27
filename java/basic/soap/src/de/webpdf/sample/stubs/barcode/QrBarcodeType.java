
package de.webpdf.sample.stubs.barcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QrBarcodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QrBarcodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseBarcodeType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="errorCorrection" type="{http://schema.webpdf.de/1.0/operation}QrCodeErrorCorrectionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the errorCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link QrCodeErrorCorrectionType }
     *     
     */
    public QrCodeErrorCorrectionType getErrorCorrection() {
        return errorCorrection;
    }

    /**
     * Sets the value of the errorCorrection property.
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
