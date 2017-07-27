
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageGroupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PageGroupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="even"/>
 *     &lt;enumeration value="odd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
