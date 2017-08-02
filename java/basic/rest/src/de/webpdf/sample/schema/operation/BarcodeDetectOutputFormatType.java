
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BarcodeDetectOutputFormatType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BarcodeDetectOutputFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="xml"/&gt;
 *     &lt;enumeration value="json"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BarcodeDetectOutputFormatType")
@XmlEnum
public enum BarcodeDetectOutputFormatType {

    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("json")
    JSON("json");
    private final String value;

    BarcodeDetectOutputFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BarcodeDetectOutputFormatType fromValue(String v) {
        for (BarcodeDetectOutputFormatType c: BarcodeDetectOutputFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
