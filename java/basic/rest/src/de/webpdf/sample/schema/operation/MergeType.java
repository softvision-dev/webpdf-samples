
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MergeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MergeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="data" type="{http://schema.webpdf.de/1.0/operation}MergeFileDataType"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="mode" type="{http://schema.webpdf.de/1.0/operation}MergeModeType" default="atTheEnd" /&gt;
 *       &lt;attribute name="page" default="1"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="sourceIsZip" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="outlineName" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="resetMetadata" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Ruft den Wert der data-Eigenschaft ab.
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
     * Legt den Wert der data-Eigenschaft fest.
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
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MergeModeType }
     *     
     */
    public MergeModeType getMode() {
        if (mode == null) {
            return MergeModeType.AT_THE_END;
        } else {
            return mode;
        }
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
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

    /**
     * Ruft den Wert der sourceIsZip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSourceIsZip() {
        if (sourceIsZip == null) {
            return false;
        } else {
            return sourceIsZip;
        }
    }

    /**
     * Legt den Wert der sourceIsZip-Eigenschaft fest.
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
     * Ruft den Wert der outlineName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlineName() {
        if (outlineName == null) {
            return "";
        } else {
            return outlineName;
        }
    }

    /**
     * Legt den Wert der outlineName-Eigenschaft fest.
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
     * Ruft den Wert der resetMetadata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isResetMetadata() {
        if (resetMetadata == null) {
            return false;
        } else {
            return resetMetadata;
        }
    }

    /**
     * Legt den Wert der resetMetadata-Eigenschaft fest.
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
