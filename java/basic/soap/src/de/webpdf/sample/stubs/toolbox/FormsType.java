
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType">
 *       &lt;sequence>
 *         &lt;element name="import" type="{http://schema.webpdf.de/1.0/operation}FormsImportType" minOccurs="0"/>
 *         &lt;element name="export" type="{http://schema.webpdf.de/1.0/operation}FormsExportType" minOccurs="0"/>
 *         &lt;element name="flatten" type="{http://schema.webpdf.de/1.0/operation}FormsFlattenType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormsType", propOrder = {
    "_import",
    "export",
    "flatten"
})
public class FormsType
    extends BaseToolboxType
{

    @XmlElement(name = "import")
    protected FormsImportType _import;
    protected FormsExportType export;
    protected FormsFlattenType flatten;

    /**
     * Gets the value of the import property.
     * 
     * @return
     *     possible object is
     *     {@link FormsImportType }
     *     
     */
    public FormsImportType getImport() {
        return _import;
    }

    /**
     * Sets the value of the import property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormsImportType }
     *     
     */
    public void setImport(FormsImportType value) {
        this._import = value;
    }

    /**
     * Gets the value of the export property.
     * 
     * @return
     *     possible object is
     *     {@link FormsExportType }
     *     
     */
    public FormsExportType getExport() {
        return export;
    }

    /**
     * Sets the value of the export property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormsExportType }
     *     
     */
    public void setExport(FormsExportType value) {
        this.export = value;
    }

    /**
     * Gets the value of the flatten property.
     * 
     * @return
     *     possible object is
     *     {@link FormsFlattenType }
     *     
     */
    public FormsFlattenType getFlatten() {
        return flatten;
    }

    /**
     * Sets the value of the flatten property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormsFlattenType }
     *     
     */
    public void setFlatten(FormsFlattenType value) {
        this.flatten = value;
    }

}
