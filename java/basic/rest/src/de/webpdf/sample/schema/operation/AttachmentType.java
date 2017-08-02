
package de.webpdf.sample.schema.operation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AttachmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="add"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="file" type="{http://schema.webpdf.de/1.0/operation}FileAttachmentType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="remove"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}SelectionAttachmentType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="extract"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}SelectionAttachmentType"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="folderNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" default="page[%d]" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Ruft den Wert der add-Eigenschaft ab.
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
     * Legt den Wert der add-Eigenschaft fest.
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
     * Ruft den Wert der remove-Eigenschaft ab.
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
     * Legt den Wert der remove-Eigenschaft fest.
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
     * Ruft den Wert der extract-Eigenschaft ab.
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
     * Legt den Wert der extract-Eigenschaft fest.
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
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="file" type="{http://schema.webpdf.de/1.0/operation}FileAttachmentType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "file"
    })
    public static class Add {

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
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}SelectionAttachmentType"/&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="folderNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" default="page[%d]" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "selection"
    })
    public static class Extract {

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
         * Ruft den Wert der folderNameTemplate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFolderNameTemplate() {
            if (folderNameTemplate == null) {
                return "page[%d]";
            } else {
                return folderNameTemplate;
            }
        }

        /**
         * Legt den Wert der folderNameTemplate-Eigenschaft fest.
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
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="selection" type="{http://schema.webpdf.de/1.0/operation}SelectionAttachmentType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "selection"
    })
    public static class Remove {

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
