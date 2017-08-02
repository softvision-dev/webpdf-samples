
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IconsType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IconsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="graph"/&gt;
 *     &lt;enumeration value="paperclip"/&gt;
 *     &lt;enumeration value="pushPin"/&gt;
 *     &lt;enumeration value="tag"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
