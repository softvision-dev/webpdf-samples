
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagnificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MagnificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="fitWidth"/>
 *     &lt;enumeration value="fitVisible"/>
 *     &lt;enumeration value="fitHeight"/>
 *     &lt;enumeration value="fitPage"/>
 *     &lt;enumeration value="fitActual"/>
 *     &lt;enumeration value="zoom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
