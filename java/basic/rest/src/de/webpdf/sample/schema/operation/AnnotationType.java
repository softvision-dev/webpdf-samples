
package de.webpdf.sample.schema.operation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AnnotationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AnnotationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="add"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="text" type="{http://schema.webpdf.de/1.0/operation}TextAnnotationType"/&gt;
 *                   &lt;element name="markup" type="{http://schema.webpdf.de/1.0/operation}MarkupAnnotationType"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "AnnotationType", propOrder = {
    "add"
})
public class AnnotationType
    extends BaseToolboxType
{

    protected AnnotationType.Add add;

    /**
     * Ruft den Wert der add-Eigenschaft ab.
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
     * Legt den Wert der add-Eigenschaft fest.
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
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="text" type="{http://schema.webpdf.de/1.0/operation}TextAnnotationType"/&gt;
     *         &lt;element name="markup" type="{http://schema.webpdf.de/1.0/operation}MarkupAnnotationType"/&gt;
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
        "text",
        "markup"
    })
    public static class Add {

        protected List<TextAnnotationType> text;
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
