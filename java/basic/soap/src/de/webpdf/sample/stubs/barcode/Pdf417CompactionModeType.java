
package de.webpdf.sample.stubs.barcode;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pdf417CompactionModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Pdf417CompactionModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="numeric"/>
 *     &lt;enumeration value="byte"/>
 *     &lt;enumeration value="auto"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
