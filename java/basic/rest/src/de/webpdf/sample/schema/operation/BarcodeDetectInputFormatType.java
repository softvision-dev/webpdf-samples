
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BarcodeDetectInputFormatType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BarcodeDetectInputFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pdf"/&gt;
 *     &lt;enumeration value="img"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BarcodeDetectInputFormatType")
@XmlEnum
public enum BarcodeDetectInputFormatType {

    @XmlEnumValue("pdf")
    PDF("pdf"),
    @XmlEnumValue("img")
    IMG("img");
    private final String value;

    BarcodeDetectInputFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BarcodeDetectInputFormatType fromValue(String v) {
        for (BarcodeDetectInputFormatType c: BarcodeDetectInputFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
