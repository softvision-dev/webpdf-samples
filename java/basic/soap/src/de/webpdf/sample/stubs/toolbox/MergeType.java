
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://schema.webpdf.de/1.0/operation}MergeFileDataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mode" type="{http://schema.webpdf.de/1.0/operation}MergeModeType" />
 *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="sourceIsZip" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="outlineName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resetMetadata" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeType", propOrder = {
    "data"
})
public class MergeType
    extends BaseToolboxType
{

    @XmlElement(required = true)
    protected MergeFileDataType data;
    @XmlAttribute(name = "mode")
    protected MergeModeType mode;
    @XmlAttribute(name = "page")
    protected Integer page;
    @XmlAttribute(name = "sourceIsZip")
    protected Boolean sourceIsZip;
    @XmlAttribute(name = "outlineName")
    protected String outlineName;
    @XmlAttribute(name = "resetMetadata")
    protected Boolean resetMetadata;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link MergeFileDataType }
     *     
     */
    public MergeFileDataType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergeFileDataType }
     *     
     */
    public void setData(MergeFileDataType value) {
        this.data = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link MergeModeType }
     *     
     */
    public MergeModeType getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergeModeType }
     *     
     */
    public void setMode(MergeModeType value) {
        this.mode = value;
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

    /**
     * Gets the value of the sourceIsZip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSourceIsZip() {
        return sourceIsZip;
    }

    /**
     * Sets the value of the sourceIsZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSourceIsZip(Boolean value) {
        this.sourceIsZip = value;
    }

    /**
     * Gets the value of the outlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlineName() {
        return outlineName;
    }

    /**
     * Sets the value of the outlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutlineName(String value) {
        this.outlineName = value;
    }

    /**
     * Gets the value of the resetMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetMetadata() {
        return resetMetadata;
    }

    /**
     * Sets the value of the resetMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetMetadata(Boolean value) {
        this.resetMetadata = value;
    }

}
