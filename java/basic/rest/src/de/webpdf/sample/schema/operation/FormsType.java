
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FormsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FormsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}BaseToolboxType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="import" type="{http://schema.webpdf.de/1.0/operation}FormsImportType" minOccurs="0"/&gt;
 *         &lt;element name="export" type="{http://schema.webpdf.de/1.0/operation}FormsExportType" minOccurs="0"/&gt;
 *         &lt;element name="flatten" type="{http://schema.webpdf.de/1.0/operation}FormsFlattenType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Ruft den Wert der import-Eigenschaft ab.
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
     * Legt den Wert der import-Eigenschaft fest.
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
     * Ruft den Wert der export-Eigenschaft ab.
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
     * Legt den Wert der export-Eigenschaft fest.
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
     * Ruft den Wert der flatten-Eigenschaft ab.
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
     * Legt den Wert der flatten-Eigenschaft fest.
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
