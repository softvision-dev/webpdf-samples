
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageOrientationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PageOrientationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="portrait"/>
 *     &lt;enumeration value="landscape"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
