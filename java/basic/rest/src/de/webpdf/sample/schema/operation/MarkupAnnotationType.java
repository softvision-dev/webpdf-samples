
package de.webpdf.sample.schema.operation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MarkupAnnotationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MarkupAnnotationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseAnnotationType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="pathElement" type="{http://schema.webpdf.de/1.0/operation}RectangleType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="markupType" type="{http://schema.webpdf.de/1.0/operation}MarkupsAnnotationType" default="highlight" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkupAnnotationType", propOrder = {
    "pathElement"
})
public class MarkupAnnotationType
    extends BaseAnnotationType
{

    protected List<RectangleType> pathElement;
    @XmlAttribute(name = "markupType")
    protected MarkupsAnnotationType markupType;

    /**
     * Gets the value of the pathElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pathElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPathElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RectangleType }
     * 
     * 
     */
    public List<RectangleType> getPathElement() {
        if (pathElement == null) {
            pathElement = new ArrayList<RectangleType>();
        }
        return this.pathElement;
    }

    /**
     * Ruft den Wert der markupType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarkupsAnnotationType }
     *     
     */
    public MarkupsAnnotationType getMarkupType() {
        if (markupType == null) {
            return MarkupsAnnotationType.HIGHLIGHT;
        } else {
            return markupType;
        }
    }

    /**
     * Legt den Wert der markupType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkupsAnnotationType }
     *     
     */
    public void setMarkupType(MarkupsAnnotationType value) {
        this.markupType = value;
    }

}
