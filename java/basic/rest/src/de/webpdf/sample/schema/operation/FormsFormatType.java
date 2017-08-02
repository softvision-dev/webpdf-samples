
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FormsFormatType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FormsFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="xml"/&gt;
 *     &lt;enumeration value="fdf"/&gt;
 *     &lt;enumeration value="xfdf"/&gt;
 *     &lt;enumeration value="xdp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
