
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MetricsType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MetricsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="px"/&gt;
 *     &lt;enumeration value="mm"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MetricsType")
@XmlEnum
public enum MetricsType {

    @XmlEnumValue("px")
    PX("px"),
    @XmlEnumValue("mm")
    MM("mm");
    private final String value;

    MetricsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetricsType fromValue(String v) {
        for (MetricsType c: MetricsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
