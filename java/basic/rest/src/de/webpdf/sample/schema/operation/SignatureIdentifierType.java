
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SignatureIdentifierType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SignatureIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="showSignedBy" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="showName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="showCommonName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="showOrganisationUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="showOrganisationName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="showLocal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="showState" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="showCountry" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="showMail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="showDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureIdentifierType")
public class SignatureIdentifierType {

    @XmlAttribute(name = "showSignedBy")
    protected Boolean showSignedBy;
    @XmlAttribute(name = "showName")
    protected Boolean showName;
    @XmlAttribute(name = "showCommonName")
    protected Boolean showCommonName;
    @XmlAttribute(name = "showOrganisationUnit")
    protected Boolean showOrganisationUnit;
    @XmlAttribute(name = "showOrganisationName")
    protected Boolean showOrganisationName;
    @XmlAttribute(name = "showLocal")
    protected Boolean showLocal;
    @XmlAttribute(name = "showState")
    protected Boolean showState;
    @XmlAttribute(name = "showCountry")
    protected Boolean showCountry;
    @XmlAttribute(name = "showMail")
    protected Boolean showMail;
    @XmlAttribute(name = "showDate")
    protected Boolean showDate;

    /**
     * Ruft den Wert der showSignedBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowSignedBy() {
        if (showSignedBy == null) {
            return true;
        } else {
            return showSignedBy;
        }
    }

    /**
     * Legt den Wert der showSignedBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSignedBy(Boolean value) {
        this.showSignedBy = value;
    }

    /**
     * Ruft den Wert der showName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowName() {
        if (showName == null) {
            return true;
        } else {
            return showName;
        }
    }

    /**
     * Legt den Wert der showName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowName(Boolean value) {
        this.showName = value;
    }

    /**
     * Ruft den Wert der showCommonName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowCommonName() {
        if (showCommonName == null) {
            return true;
        } else {
            return showCommonName;
        }
    }

    /**
     * Legt den Wert der showCommonName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCommonName(Boolean value) {
        this.showCommonName = value;
    }

    /**
     * Ruft den Wert der showOrganisationUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowOrganisationUnit() {
        if (showOrganisationUnit == null) {
            return true;
        } else {
            return showOrganisationUnit;
        }
    }

    /**
     * Legt den Wert der showOrganisationUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOrganisationUnit(Boolean value) {
        this.showOrganisationUnit = value;
    }

    /**
     * Ruft den Wert der showOrganisationName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowOrganisationName() {
        if (showOrganisationName == null) {
            return true;
        } else {
            return showOrganisationName;
        }
    }

    /**
     * Legt den Wert der showOrganisationName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOrganisationName(Boolean value) {
        this.showOrganisationName = value;
    }

    /**
     * Ruft den Wert der showLocal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowLocal() {
        if (showLocal == null) {
            return true;
        } else {
            return showLocal;
        }
    }

    /**
     * Legt den Wert der showLocal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLocal(Boolean value) {
        this.showLocal = value;
    }

    /**
     * Ruft den Wert der showState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowState() {
        if (showState == null) {
            return true;
        } else {
            return showState;
        }
    }

    /**
     * Legt den Wert der showState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowState(Boolean value) {
        this.showState = value;
    }

    /**
     * Ruft den Wert der showCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowCountry() {
        if (showCountry == null) {
            return true;
        } else {
            return showCountry;
        }
    }

    /**
     * Legt den Wert der showCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCountry(Boolean value) {
        this.showCountry = value;
    }

    /**
     * Ruft den Wert der showMail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowMail() {
        if (showMail == null) {
            return true;
        } else {
            return showMail;
        }
    }

    /**
     * Legt den Wert der showMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMail(Boolean value) {
        this.showMail = value;
    }

    /**
     * Ruft den Wert der showDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowDate() {
        if (showDate == null) {
            return true;
        } else {
            return showDate;
        }
    }

    /**
     * Legt den Wert der showDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowDate(Boolean value) {
        this.showDate = value;
    }

}
