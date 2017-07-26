
package de.webpdf.sample.stubs.converter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="add" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="appearance" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}SignaturePositionType" minOccurs="0"/>
 *                             &lt;element name="image" type="{http://schema.webpdf.de/1.0/operation}SignatureImageType" minOccurs="0"/>
 *                             &lt;element name="identifierElements" type="{http://schema.webpdf.de/1.0/operation}SignatureIdentifierType" minOccurs="0"/>
 *                           &lt;/all>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="certificationLevel" type="{http://schema.webpdf.de/1.0/operation}CertificationLevelType" />
 *                 &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="keyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="keyPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="appendSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="contact" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureType", propOrder = {
    "add"
})
public class SignatureType {

    protected SignatureType.Add add;

    /**
     * Gets the value of the add property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType.Add }
     *     
     */
    public SignatureType.Add getAdd() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType.Add }
     *     
     */
    public void setAdd(SignatureType.Add value) {
        this.add = value;
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
     *         &lt;element name="appearance" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}SignaturePositionType" minOccurs="0"/>
     *                   &lt;element name="image" type="{http://schema.webpdf.de/1.0/operation}SignatureImageType" minOccurs="0"/>
     *                   &lt;element name="identifierElements" type="{http://schema.webpdf.de/1.0/operation}SignatureIdentifierType" minOccurs="0"/>
     *                 &lt;/all>
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="certificationLevel" type="{http://schema.webpdf.de/1.0/operation}CertificationLevelType" />
     *       &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="keyName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="keyPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="appendSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="contact" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "appearance"
    })
    public static class Add {

        protected SignatureType.Add.Appearance appearance;
        @XmlAttribute(name = "certificationLevel")
        protected CertificationLevelType certificationLevel;
        @XmlAttribute(name = "fieldName")
        protected String fieldName;
        @XmlAttribute(name = "keyName")
        protected String keyName;
        @XmlAttribute(name = "keyPassword")
        protected String keyPassword;
        @XmlAttribute(name = "appendSignature")
        protected Boolean appendSignature;
        @XmlAttribute(name = "location")
        protected String location;
        @XmlAttribute(name = "contact")
        protected String contact;
        @XmlAttribute(name = "reason")
        protected String reason;

        /**
         * Gets the value of the appearance property.
         * 
         * @return
         *     possible object is
         *     {@link SignatureType.Add.Appearance }
         *     
         */
        public SignatureType.Add.Appearance getAppearance() {
            return appearance;
        }

        /**
         * Sets the value of the appearance property.
         * 
         * @param value
         *     allowed object is
         *     {@link SignatureType.Add.Appearance }
         *     
         */
        public void setAppearance(SignatureType.Add.Appearance value) {
            this.appearance = value;
        }

        /**
         * Gets the value of the certificationLevel property.
         * 
         * @return
         *     possible object is
         *     {@link CertificationLevelType }
         *     
         */
        public CertificationLevelType getCertificationLevel() {
            return certificationLevel;
        }

        /**
         * Sets the value of the certificationLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link CertificationLevelType }
         *     
         */
        public void setCertificationLevel(CertificationLevelType value) {
            this.certificationLevel = value;
        }

        /**
         * Gets the value of the fieldName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFieldName() {
            return fieldName;
        }

        /**
         * Sets the value of the fieldName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFieldName(String value) {
            this.fieldName = value;
        }

        /**
         * Gets the value of the keyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyName() {
            return keyName;
        }

        /**
         * Sets the value of the keyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeyName(String value) {
            this.keyName = value;
        }

        /**
         * Gets the value of the keyPassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyPassword() {
            return keyPassword;
        }

        /**
         * Sets the value of the keyPassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeyPassword(String value) {
            this.keyPassword = value;
        }

        /**
         * Gets the value of the appendSignature property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAppendSignature() {
            return appendSignature;
        }

        /**
         * Sets the value of the appendSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAppendSignature(Boolean value) {
            this.appendSignature = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * Gets the value of the contact property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContact() {
            return contact;
        }

        /**
         * Sets the value of the contact property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContact(String value) {
            this.contact = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
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
         *       &lt;all>
         *         &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}SignaturePositionType" minOccurs="0"/>
         *         &lt;element name="image" type="{http://schema.webpdf.de/1.0/operation}SignatureImageType" minOccurs="0"/>
         *         &lt;element name="identifierElements" type="{http://schema.webpdf.de/1.0/operation}SignatureIdentifierType" minOccurs="0"/>
         *       &lt;/all>
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Appearance {

            protected SignaturePositionType position;
            protected SignatureImageType image;
            protected SignatureIdentifierType identifierElements;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "identifier")
            protected String identifier;
            @XmlAttribute(name = "page")
            protected Integer page;

            /**
             * Gets the value of the position property.
             * 
             * @return
             *     possible object is
             *     {@link SignaturePositionType }
             *     
             */
            public SignaturePositionType getPosition() {
                return position;
            }

            /**
             * Sets the value of the position property.
             * 
             * @param value
             *     allowed object is
             *     {@link SignaturePositionType }
             *     
             */
            public void setPosition(SignaturePositionType value) {
                this.position = value;
            }

            /**
             * Gets the value of the image property.
             * 
             * @return
             *     possible object is
             *     {@link SignatureImageType }
             *     
             */
            public SignatureImageType getImage() {
                return image;
            }

            /**
             * Sets the value of the image property.
             * 
             * @param value
             *     allowed object is
             *     {@link SignatureImageType }
             *     
             */
            public void setImage(SignatureImageType value) {
                this.image = value;
            }

            /**
             * Gets the value of the identifierElements property.
             * 
             * @return
             *     possible object is
             *     {@link SignatureIdentifierType }
             *     
             */
            public SignatureIdentifierType getIdentifierElements() {
                return identifierElements;
            }

            /**
             * Sets the value of the identifierElements property.
             * 
             * @param value
             *     allowed object is
             *     {@link SignatureIdentifierType }
             *     
             */
            public void setIdentifierElements(SignatureIdentifierType value) {
                this.identifierElements = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the identifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentifier() {
                return identifier;
            }

            /**
             * Sets the value of the identifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentifier(String value) {
                this.identifier = value;
            }

            /**
             * Gets the value of the page property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPage() {
                return page;
            }

            /**
             * Sets the value of the page property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPage(Integer value) {
                this.page = value;
            }

        }

    }

}
