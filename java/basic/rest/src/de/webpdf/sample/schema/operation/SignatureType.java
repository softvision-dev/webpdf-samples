
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SignatureType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SignatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="add"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="appearance" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}SignaturePositionType" minOccurs="0"/&gt;
 *                             &lt;element name="image" type="{http://schema.webpdf.de/1.0/operation}SignatureImageType" minOccurs="0"/&gt;
 *                             &lt;element name="identifierElements" type="{http://schema.webpdf.de/1.0/operation}SignatureIdentifierType" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *                           &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *                           &lt;attribute name="page" default="1"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                 &lt;minInclusive value="1"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *                 &lt;attGroup ref="{http://schema.webpdf.de/1.0/operation}SignatureInfoGroup"/&gt;
 *                 &lt;attribute name="certificationLevel" type="{http://schema.webpdf.de/1.0/operation}CertificationLevelType" default="noChanges" /&gt;
 *                 &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" default="Signature1" /&gt;
 *                 &lt;attribute name="keyName" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *                 &lt;attribute name="keyPassword" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *                 &lt;attribute name="appendSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Ruft den Wert der add-Eigenschaft ab.
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
     * Legt den Wert der add-Eigenschaft fest.
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
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="appearance" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}SignaturePositionType" minOccurs="0"/&gt;
     *                   &lt;element name="image" type="{http://schema.webpdf.de/1.0/operation}SignatureImageType" minOccurs="0"/&gt;
     *                   &lt;element name="identifierElements" type="{http://schema.webpdf.de/1.0/operation}SignatureIdentifierType" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
     *                 &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
     *                 &lt;attribute name="page" default="1"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                       &lt;minInclusive value="1"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *       &lt;attGroup ref="{http://schema.webpdf.de/1.0/operation}SignatureInfoGroup"/&gt;
     *       &lt;attribute name="certificationLevel" type="{http://schema.webpdf.de/1.0/operation}CertificationLevelType" default="noChanges" /&gt;
     *       &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" default="Signature1" /&gt;
     *       &lt;attribute name="keyName" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
     *       &lt;attribute name="keyPassword" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
     *       &lt;attribute name="appendSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

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
         * Ruft den Wert der appearance-Eigenschaft ab.
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
         * Legt den Wert der appearance-Eigenschaft fest.
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
         * Ruft den Wert der certificationLevel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CertificationLevelType }
         *     
         */
        public CertificationLevelType getCertificationLevel() {
            if (certificationLevel == null) {
                return CertificationLevelType.NO_CHANGES;
            } else {
                return certificationLevel;
            }
        }

        /**
         * Legt den Wert der certificationLevel-Eigenschaft fest.
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
         * Ruft den Wert der fieldName-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFieldName() {
            if (fieldName == null) {
                return "Signature1";
            } else {
                return fieldName;
            }
        }

        /**
         * Legt den Wert der fieldName-Eigenschaft fest.
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
         * Ruft den Wert der keyName-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyName() {
            if (keyName == null) {
                return "";
            } else {
                return keyName;
            }
        }

        /**
         * Legt den Wert der keyName-Eigenschaft fest.
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
         * Ruft den Wert der keyPassword-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyPassword() {
            if (keyPassword == null) {
                return "";
            } else {
                return keyPassword;
            }
        }

        /**
         * Legt den Wert der keyPassword-Eigenschaft fest.
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
         * Ruft den Wert der appendSignature-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isAppendSignature() {
            if (appendSignature == null) {
                return false;
            } else {
                return appendSignature;
            }
        }

        /**
         * Legt den Wert der appendSignature-Eigenschaft fest.
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
         * Ruft den Wert der location-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            if (location == null) {
                return "";
            } else {
                return location;
            }
        }

        /**
         * Legt den Wert der location-Eigenschaft fest.
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
         * Ruft den Wert der contact-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContact() {
            if (contact == null) {
                return "";
            } else {
                return contact;
            }
        }

        /**
         * Legt den Wert der contact-Eigenschaft fest.
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
         * Ruft den Wert der reason-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            if (reason == null) {
                return "";
            } else {
                return reason;
            }
        }

        /**
         * Legt den Wert der reason-Eigenschaft fest.
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
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="position" type="{http://schema.webpdf.de/1.0/operation}SignaturePositionType" minOccurs="0"/&gt;
         *         &lt;element name="image" type="{http://schema.webpdf.de/1.0/operation}SignatureImageType" minOccurs="0"/&gt;
         *         &lt;element name="identifierElements" type="{http://schema.webpdf.de/1.0/operation}SignatureIdentifierType" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
         *       &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
         *       &lt;attribute name="page" default="1"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *             &lt;minInclusive value="1"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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
             * Ruft den Wert der position-Eigenschaft ab.
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
             * Legt den Wert der position-Eigenschaft fest.
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
             * Ruft den Wert der image-Eigenschaft ab.
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
             * Legt den Wert der image-Eigenschaft fest.
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
             * Ruft den Wert der identifierElements-Eigenschaft ab.
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
             * Legt den Wert der identifierElements-Eigenschaft fest.
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
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                if (name == null) {
                    return "";
                } else {
                    return name;
                }
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
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
             * Ruft den Wert der identifier-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentifier() {
                if (identifier == null) {
                    return "";
                } else {
                    return identifier;
                }
            }

            /**
             * Legt den Wert der identifier-Eigenschaft fest.
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
             * Ruft den Wert der page-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getPage() {
                if (page == null) {
                    return  1;
                } else {
                    return page;
                }
            }

            /**
             * Legt den Wert der page-Eigenschaft fest.
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
