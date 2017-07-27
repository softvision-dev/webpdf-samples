
package de.webpdf.sample.stubs.toolbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkupAnnotationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkupAnnotationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseAnnotationType">
 *       &lt;sequence>
 *         &lt;element name="pathElement" type="{http://schema.webpdf.de/1.0/operation}RectangleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="markupType" type="{http://schema.webpdf.de/1.0/operation}MarkupsAnnotationType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    @XmlElement(nillable = true)
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
     * Gets the value of the markupType property.
     * 
     * @return
     *     possible object is
     *     {@link MarkupsAnnotationType }
     *     
     */
    public MarkupsAnnotationType getMarkupType() {
        return markupType;
    }

    /**
     * Sets the value of the markupType property.
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
