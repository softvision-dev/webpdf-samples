
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IconsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IconsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="graph"/>
 *     &lt;enumeration value="paperclip"/>
 *     &lt;enumeration value="pushPin"/>
 *     &lt;enumeration value="tag"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IconsType")
@XmlEnum
public enum IconsType {

    @XmlEnumValue("graph")
    GRAPH("graph"),
    @XmlEnumValue("paperclip")
    PAPERCLIP("paperclip"),
    @XmlEnumValue("pushPin")
    PUSH_PIN("pushPin"),
    @XmlEnumValue("tag")
    TAG("tag");
    private final String value;

    IconsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IconsType fromValue(String v) {
        for (IconsType c: IconsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
