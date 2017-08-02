
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PageOrientationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PageOrientationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="any"/&gt;
 *     &lt;enumeration value="portrait"/&gt;
 *     &lt;enumeration value="landscape"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PageOrientationType")
@XmlEnum
public enum PageOrientationType {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("portrait")
    PORTRAIT("portrait"),
    @XmlEnumValue("landscape")
    LANDSCAPE("landscape");
    private final String value;

    PageOrientationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PageOrientationType fromValue(String v) {
        for (PageOrientationType c: PageOrientationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
