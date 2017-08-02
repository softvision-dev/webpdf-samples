
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Pdf417CompactionModeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Pdf417CompactionModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="text"/&gt;
 *     &lt;enumeration value="numeric"/&gt;
 *     &lt;enumeration value="byte"/&gt;
 *     &lt;enumeration value="auto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Pdf417CompactionModeType")
@XmlEnum
public enum Pdf417CompactionModeType {

    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("numeric")
    NUMERIC("numeric"),
    @XmlEnumValue("byte")
    BYTE("byte"),
    @XmlEnumValue("auto")
    AUTO("auto");
    private final String value;

    Pdf417CompactionModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Pdf417CompactionModeType fromValue(String v) {
        for (Pdf417CompactionModeType c: Pdf417CompactionModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
