
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetricsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetricsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="px"/>
 *     &lt;enumeration value="mm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
