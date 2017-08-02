
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SplitModeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SplitModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="last"/&gt;
 *     &lt;enumeration value="first"/&gt;
 *     &lt;enumeration value="list"/&gt;
 *     &lt;enumeration value="single"/&gt;
 *     &lt;enumeration value="each"/&gt;
 *     &lt;enumeration value="group"/&gt;
 *     &lt;enumeration value="burst"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SplitModeType")
@XmlEnum
public enum SplitModeType {

    @XmlEnumValue("last")
    LAST("last"),
    @XmlEnumValue("first")
    FIRST("first"),
    @XmlEnumValue("list")
    LIST("list"),
    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("each")
    EACH("each"),
    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("burst")
    BURST("burst");
    private final String value;

    SplitModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SplitModeType fromValue(String v) {
        for (SplitModeType c: SplitModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
