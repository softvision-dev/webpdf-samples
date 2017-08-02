
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OcrOutputType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OcrOutputType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="text"/&gt;
 *     &lt;enumeration value="hocr"/&gt;
 *     &lt;enumeration value="pdf"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OcrOutputType")
@XmlEnum
public enum OcrOutputType {

    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("hocr")
    HOCR("hocr"),
    @XmlEnumValue("pdf")
    PDF("pdf");
    private final String value;

    OcrOutputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OcrOutputType fromValue(String v) {
        for (OcrOutputType c: OcrOutputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
