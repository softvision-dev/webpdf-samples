
package de.webpdf.sample.stubs.toolbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnnotationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *         &lt;element name="add" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="text" type="{http://schema.webpdf.de/1.0/operation}TextAnnotationType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="markup" type="{http://schema.webpdf.de/1.0/operation}MarkupAnnotationType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "AnnotationType", propOrder = {
    "add"
})
public class AnnotationType
    extends BaseToolboxType
{

    protected AnnotationType.Add add;

    /**
     * Gets the value of the add property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationType.Add }
     *     
     */
    public AnnotationType.Add getAdd() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationType.Add }
     *     
     */
    public void setAdd(AnnotationType.Add value) {
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
     *         &lt;element name="text" type="{http://schema.webpdf.de/1.0/operation}TextAnnotationType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="markup" type="{http://schema.webpdf.de/1.0/operation}MarkupAnnotationType" maxOccurs="unbounded" minOccurs="0"/>
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
        "text",
        "markup"
    })
    public static class Add {

        @XmlElement(nillable = true)
        protected List<TextAnnotationType> text;
        @XmlElement(nillable = true)
        protected List<MarkupAnnotationType> markup;

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TextAnnotationType }
         * 
         * 
         */
        public List<TextAnnotationType> getText() {
            if (text == null) {
                text = new ArrayList<TextAnnotationType>();
            }
            return this.text;
        }

        /**
         * Gets the value of the markup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the markup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMarkup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MarkupAnnotationType }
         * 
         * 
         */
        public List<MarkupAnnotationType> getMarkup() {
            if (markup == null) {
                markup = new ArrayList<MarkupAnnotationType>();
            }
            return this.markup;
        }

    }

}
