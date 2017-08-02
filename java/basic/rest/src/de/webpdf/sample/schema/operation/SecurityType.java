
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SecurityType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecurityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="decrypt" type="{http://schema.webpdf.de/1.0/operation}DecryptType" minOccurs="0"/&gt;
 *         &lt;element name="encrypt" type="{http://schema.webpdf.de/1.0/operation}EncryptType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Ruft den Wert der decrypt-Eigenschaft ab.
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
     * Legt den Wert der decrypt-Eigenschaft fest.
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
     * Ruft den Wert der encrypt-Eigenschaft ab.
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
     * Legt den Wert der encrypt-Eigenschaft fest.
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
