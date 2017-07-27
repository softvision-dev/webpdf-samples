
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *         &lt;element name="decrypt" type="{http://schema.webpdf.de/1.0/operation}DecryptType" minOccurs="0"/>
 *         &lt;element name="encrypt" type="{http://schema.webpdf.de/1.0/operation}EncryptType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityType", propOrder = {
    "decrypt",
    "encrypt"
})
public class SecurityType
    extends BaseToolboxType
{

    protected DecryptType decrypt;
    protected EncryptType encrypt;

    /**
     * Gets the value of the decrypt property.
     * 
     * @return
     *     possible object is
     *     {@link DecryptType }
     *     
     */
    public DecryptType getDecrypt() {
        return decrypt;
    }

    /**
     * Sets the value of the decrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecryptType }
     *     
     */
    public void setDecrypt(DecryptType value) {
        this.decrypt = value;
    }

    /**
     * Gets the value of the encrypt property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptType }
     *     
     */
    public EncryptType getEncrypt() {
        return encrypt;
    }

    /**
     * Sets the value of the encrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptType }
     *     
     */
    public void setEncrypt(EncryptType value) {
        this.encrypt = value;
    }

}
