
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="password" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="encryptionKey" type="{http://schema.webpdf.de/1.0/operation}PdfEncryptionKeyType" />
 *                 &lt;attribute name="permission" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="open" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="canAssemble" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="canExtractContent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="canExtractForAccessibility" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="canFillInForm" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="canModify" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="canModifyAnnotations" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="canPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="canPrintHighRes" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the password property.
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
     * Sets the value of the password property.
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
     * Gets the value of the canAssemble property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanAssemble() {
        return canAssemble;
    }

    /**
     * Sets the value of the canAssemble property.
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
     * Gets the value of the canExtractContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanExtractContent() {
        return canExtractContent;
    }

    /**
     * Sets the value of the canExtractContent property.
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
     * Gets the value of the canExtractForAccessibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanExtractForAccessibility() {
        return canExtractForAccessibility;
    }

    /**
     * Sets the value of the canExtractForAccessibility property.
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
     * Gets the value of the canFillInForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanFillInForm() {
        return canFillInForm;
    }

    /**
     * Sets the value of the canFillInForm property.
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
     * Gets the value of the canModify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanModify() {
        return canModify;
    }

    /**
     * Sets the value of the canModify property.
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
     * Gets the value of the canModifyAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanModifyAnnotations() {
        return canModifyAnnotations;
    }

    /**
     * Sets the value of the canModifyAnnotations property.
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
     * Gets the value of the canPrint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanPrint() {
        return canPrint;
    }

    /**
     * Sets the value of the canPrint property.
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
     * Gets the value of the canPrintHighRes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanPrintHighRes() {
        return canPrintHighRes;
    }

    /**
     * Sets the value of the canPrintHighRes property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="encryptionKey" type="{http://schema.webpdf.de/1.0/operation}PdfEncryptionKeyType" />
     *       &lt;attribute name="permission" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="open" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
         * Gets the value of the encryptionKey property.
         * 
         * @return
         *     possible object is
         *     {@link PdfEncryptionKeyType }
         *     
         */
        public PdfEncryptionKeyType getEncryptionKey() {
            return encryptionKey;
        }

        /**
         * Sets the value of the encryptionKey property.
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
         * Gets the value of the permission property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPermission() {
            return permission;
        }

        /**
         * Sets the value of the permission property.
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
         * Gets the value of the open property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpen() {
            return open;
        }

        /**
         * Sets the value of the open property.
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
