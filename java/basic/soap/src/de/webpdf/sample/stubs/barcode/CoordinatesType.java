
package de.webpdf.sample.stubs.barcode;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoordinatesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CoordinatesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pdf"/>
 *     &lt;enumeration value="user"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoordinatesType")
@XmlEnum
public enum CoordinatesType {

    @XmlEnumValue("pdf")
    PDF("pdf"),
    @XmlEnumValue("user")
    USER("user");
    private final String value;

    CoordinatesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoordinatesType fromValue(String v) {
        for (CoordinatesType c: CoordinatesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
