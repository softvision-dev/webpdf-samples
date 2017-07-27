
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormsFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormsFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="fdf"/>
 *     &lt;enumeration value="xfdf"/>
 *     &lt;enumeration value="xdp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FormsFormatType")
@XmlEnum
public enum FormsFormatType {

    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("fdf")
    FDF("fdf"),
    @XmlEnumValue("xfdf")
    XFDF("xfdf"),
    @XmlEnumValue("xdp")
    XDP("xdp");
    private final String value;

    FormsFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormsFormatType fromValue(String v) {
        for (FormsFormatType c: FormsFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
