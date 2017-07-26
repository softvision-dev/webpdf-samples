
package de.webpdf.sample.stubs.converter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="showSignedBy" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="showName" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="showCommonName" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="showOrganisationUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="showOrganisationName" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="showLocal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="showState" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="showCountry" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="showMail" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="showDate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Gets the value of the showSignedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSignedBy() {
        return showSignedBy;
    }

    /**
     * Sets the value of the showSignedBy property.
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
     * Gets the value of the showName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowName() {
        return showName;
    }

    /**
     * Sets the value of the showName property.
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
     * Gets the value of the showCommonName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowCommonName() {
        return showCommonName;
    }

    /**
     * Sets the value of the showCommonName property.
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
     * Gets the value of the showOrganisationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOrganisationUnit() {
        return showOrganisationUnit;
    }

    /**
     * Sets the value of the showOrganisationUnit property.
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
     * Gets the value of the showOrganisationName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOrganisationName() {
        return showOrganisationName;
    }

    /**
     * Sets the value of the showOrganisationName property.
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
     * Gets the value of the showLocal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLocal() {
        return showLocal;
    }

    /**
     * Sets the value of the showLocal property.
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
     * Gets the value of the showState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowState() {
        return showState;
    }

    /**
     * Sets the value of the showState property.
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
     * Gets the value of the showCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowCountry() {
        return showCountry;
    }

    /**
     * Sets the value of the showCountry property.
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
     * Gets the value of the showMail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMail() {
        return showMail;
    }

    /**
     * Sets the value of the showMail property.
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
     * Gets the value of the showDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowDate() {
        return showDate;
    }

    /**
     * Sets the value of the showDate property.
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
