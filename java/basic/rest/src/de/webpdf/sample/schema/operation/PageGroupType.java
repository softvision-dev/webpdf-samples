
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PageGroupType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PageGroupType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="even"/&gt;
 *     &lt;enumeration value="odd"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PageGroupType")
@XmlEnum
public enum PageGroupType {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("even")
    EVEN("even"),
    @XmlEnumValue("odd")
    ODD("odd");
    private final String value;

    PageGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PageGroupType fromValue(String v) {
        for (PageGroupType c: PageGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
