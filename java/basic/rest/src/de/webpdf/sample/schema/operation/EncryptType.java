
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EncryptType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EncryptType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="password" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="encryptionKey" type="{http://schema.webpdf.de/1.0/operation}PdfEncryptionKeyType" default="RC4_128" /&gt;
 *                 &lt;attribute name="permission" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *                 &lt;attribute name="open" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://schema.webpdf.de/1.0/operation}securityFlags"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptType", propOrder = {
    "password"
})
public class EncryptType {

    protected EncryptType.Password password;
    @XmlAttribute(name = "canAssemble")
    protected Boolean canAssemble;
    @XmlAttribute(name = "canExtractContent")
    protected Boolean canExtractContent;
    @XmlAttribute(name = "canExtractForAccessibility")
    protected Boolean canExtractForAccessibility;
    @XmlAttribute(name = "canFillInForm")
    protected Boolean canFillInForm;
    @XmlAttribute(name = "canModify")
    protected Boolean canModify;
    @XmlAttribute(name = "canModifyAnnotations")
    protected Boolean canModifyAnnotations;
    @XmlAttribute(name = "canPrint")
    protected Boolean canPrint;
    @XmlAttribute(name = "canPrintHighRes")
    protected Boolean canPrintHighRes;

    /**
     * Ruft den Wert der password-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EncryptType.Password }
     *     
     */
    public EncryptType.Password getPassword() {
        return password;
    }

    /**
     * Legt den Wert der password-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptType.Password }
     *     
     */
    public void setPassword(EncryptType.Password value) {
        this.password = value;
    }

    /**
     * Ruft den Wert der canAssemble-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanAssemble() {
        if (canAssemble == null) {
            return false;
        } else {
            return canAssemble;
        }
    }

    /**
     * Legt den Wert der canAssemble-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanAssemble(Boolean value) {
        this.canAssemble = value;
    }

    /**
     * Ruft den Wert der canExtractContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanExtractContent() {
        if (canExtractContent == null) {
            return false;
        } else {
            return canExtractContent;
        }
    }

    /**
     * Legt den Wert der canExtractContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanExtractContent(Boolean value) {
        this.canExtractContent = value;
    }

    /**
     * Ruft den Wert der canExtractForAccessibility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanExtractForAccessibility() {
        if (canExtractForAccessibility == null) {
            return false;
        } else {
            return canExtractForAccessibility;
        }
    }

    /**
     * Legt den Wert der canExtractForAccessibility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanExtractForAccessibility(Boolean value) {
        this.canExtractForAccessibility = value;
    }

    /**
     * Ruft den Wert der canFillInForm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanFillInForm() {
        if (canFillInForm == null) {
            return false;
        } else {
            return canFillInForm;
        }
    }

    /**
     * Legt den Wert der canFillInForm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanFillInForm(Boolean value) {
        this.canFillInForm = value;
    }

    /**
     * Ruft den Wert der canModify-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanModify() {
        if (canModify == null) {
            return false;
        } else {
            return canModify;
        }
    }

    /**
     * Legt den Wert der canModify-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanModify(Boolean value) {
        this.canModify = value;
    }

    /**
     * Ruft den Wert der canModifyAnnotations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanModifyAnnotations() {
        if (canModifyAnnotations == null) {
            return false;
        } else {
            return canModifyAnnotations;
        }
    }

    /**
     * Legt den Wert der canModifyAnnotations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanModifyAnnotations(Boolean value) {
        this.canModifyAnnotations = value;
    }

    /**
     * Ruft den Wert der canPrint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanPrint() {
        if (canPrint == null) {
            return false;
        } else {
            return canPrint;
        }
    }

    /**
     * Legt den Wert der canPrint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanPrint(Boolean value) {
        this.canPrint = value;
    }

    /**
     * Ruft den Wert der canPrintHighRes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanPrintHighRes() {
        if (canPrintHighRes == null) {
            return false;
        } else {
            return canPrintHighRes;
        }
    }

    /**
     * Legt den Wert der canPrintHighRes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanPrintHighRes(Boolean value) {
        this.canPrintHighRes = value;
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
     *       &lt;attribute name="encryptionKey" type="{http://schema.webpdf.de/1.0/operation}PdfEncryptionKeyType" default="RC4_128" /&gt;
     *       &lt;attribute name="permission" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
     *       &lt;attribute name="open" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Password {

        @XmlAttribute(name = "encryptionKey")
        protected PdfEncryptionKeyType encryptionKey;
        @XmlAttribute(name = "permission")
        protected String permission;
        @XmlAttribute(name = "open")
        protected String open;

        /**
         * Ruft den Wert der encryptionKey-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link PdfEncryptionKeyType }
         *     
         */
        public PdfEncryptionKeyType getEncryptionKey() {
            if (encryptionKey == null) {
                return PdfEncryptionKeyType.RC_4_128;
            } else {
                return encryptionKey;
            }
        }

        /**
         * Legt den Wert der encryptionKey-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link PdfEncryptionKeyType }
         *     
         */
        public void setEncryptionKey(PdfEncryptionKeyType value) {
            this.encryptionKey = value;
        }

        /**
         * Ruft den Wert der permission-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPermission() {
            if (permission == null) {
                return "";
            } else {
                return permission;
            }
        }

        /**
         * Legt den Wert der permission-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPermission(String value) {
            this.permission = value;
        }

        /**
         * Ruft den Wert der open-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpen() {
            if (open == null) {
                return "";
            } else {
                return open;
            }
        }

        /**
         * Legt den Wert der open-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpen(String value) {
            this.open = value;
        }

    }

}
