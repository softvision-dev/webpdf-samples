
package de.webpdf.sample.stubs.toolbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *         &lt;element name="add" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="file" type="{http://schema.webpdf.de/1.0/operation}FileAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="remove" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}SelectionAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extract" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}SelectionAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="folderNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", propOrder = {
    "add",
    "remove",
    "extract"
})
public class AttachmentType
    extends BaseToolboxType
{

    protected AttachmentType.Add add;
    protected AttachmentType.Remove remove;
    protected AttachmentType.Extract extract;

    /**
     * Gets the value of the add property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType.Add }
     *     
     */
    public AttachmentType.Add getAdd() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType.Add }
     *     
     */
    public void setAdd(AttachmentType.Add value) {
        this.add = value;
    }

    /**
     * Gets the value of the remove property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType.Remove }
     *     
     */
    public AttachmentType.Remove getRemove() {
        return remove;
    }

    /**
     * Sets the value of the remove property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType.Remove }
     *     
     */
    public void setRemove(AttachmentType.Remove value) {
        this.remove = value;
    }

    /**
     * Gets the value of the extract property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType.Extract }
     *     
     */
    public AttachmentType.Extract getExtract() {
        return extract;
    }

    /**
     * Sets the value of the extract property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType.Extract }
     *     
     */
    public void setExtract(AttachmentType.Extract value) {
        this.extract = value;
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
     *         &lt;element name="file" type="{http://schema.webpdf.de/1.0/operation}FileAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "file"
    })
    public static class Add {

        @XmlElement(nillable = true)
        protected List<FileAttachmentType> file;

        /**
         * Gets the value of the file property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the file property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FileAttachmentType }
         * 
         * 
         */
        public List<FileAttachmentType> getFile() {
            if (file == null) {
                file = new ArrayList<FileAttachmentType>();
            }
            return this.file;
        }

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
     *         &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}SelectionAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="folderNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "selection"
    })
    public static class Extract {

        @XmlElement(nillable = true)
        protected List<SelectionAttachmentType> selection;
        @XmlAttribute(name = "folderNameTemplate")
        protected String folderNameTemplate;

        /**
         * Gets the value of the selection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SelectionAttachmentType }
         * 
         * 
         */
        public List<SelectionAttachmentType> getSelection() {
            if (selection == null) {
                selection = new ArrayList<SelectionAttachmentType>();
            }
            return this.selection;
        }

        /**
         * Gets the value of the folderNameTemplate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFolderNameTemplate() {
            return folderNameTemplate;
        }

        /**
         * Sets the value of the folderNameTemplate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFolderNameTemplate(String value) {
            this.folderNameTemplate = value;
        }

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
     *         &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}SelectionAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "selection"
    })
    public static class Remove {

        @XmlElement(nillable = true)
        protected List<SelectionAttachmentType> selection;

        /**
         * Gets the value of the selection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SelectionAttachmentType }
         * 
         * 
         */
        public List<SelectionAttachmentType> getSelection() {
            if (selection == null) {
                selection = new ArrayList<SelectionAttachmentType>();
            }
            return this.selection;
        }

    }

}
