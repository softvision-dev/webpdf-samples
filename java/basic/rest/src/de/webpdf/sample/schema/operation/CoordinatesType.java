
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CoordinatesType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CoordinatesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pdf"/&gt;
 *     &lt;enumeration value="user"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
