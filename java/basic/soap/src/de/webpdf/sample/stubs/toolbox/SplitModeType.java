
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SplitModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SplitModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="last"/>
 *     &lt;enumeration value="first"/>
 *     &lt;enumeration value="list"/>
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="each"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="burst"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
