
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MagnificationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MagnificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="fitWidth"/&gt;
 *     &lt;enumeration value="fitVisible"/&gt;
 *     &lt;enumeration value="fitHeight"/&gt;
 *     &lt;enumeration value="fitPage"/&gt;
 *     &lt;enumeration value="fitActual"/&gt;
 *     &lt;enumeration value="zoom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MagnificationType")
@XmlEnum
public enum MagnificationType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("fitWidth")
    FIT_WIDTH("fitWidth"),
    @XmlEnumValue("fitVisible")
    FIT_VISIBLE("fitVisible"),
    @XmlEnumValue("fitHeight")
    FIT_HEIGHT("fitHeight"),
    @XmlEnumValue("fitPage")
    FIT_PAGE("fitPage"),
    @XmlEnumValue("fitActual")
    FIT_ACTUAL("fitActual"),
    @XmlEnumValue("zoom")
    ZOOM("zoom");
    private final String value;

    MagnificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MagnificationType fromValue(String v) {
        for (MagnificationType c: MagnificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
