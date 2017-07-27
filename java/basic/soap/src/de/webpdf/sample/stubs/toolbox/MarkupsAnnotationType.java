
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkupsAnnotationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarkupsAnnotationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="highlight"/>
 *     &lt;enumeration value="underline"/>
 *     &lt;enumeration value="strikeOut"/>
 *     &lt;enumeration value="squiggly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarkupsAnnotationType")
@XmlEnum
public enum MarkupsAnnotationType {

    @XmlEnumValue("highlight")
    HIGHLIGHT("highlight"),
    @XmlEnumValue("underline")
    UNDERLINE("underline"),
    @XmlEnumValue("strikeOut")
    STRIKE_OUT("strikeOut"),
    @XmlEnumValue("squiggly")
    SQUIGGLY("squiggly");
    private final String value;

    MarkupsAnnotationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarkupsAnnotationType fromValue(String v) {
        for (MarkupsAnnotationType c: MarkupsAnnotationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
