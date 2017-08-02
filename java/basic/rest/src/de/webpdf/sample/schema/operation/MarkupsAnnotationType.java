
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MarkupsAnnotationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MarkupsAnnotationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="highlight"/&gt;
 *     &lt;enumeration value="underline"/&gt;
 *     &lt;enumeration value="strikeOut"/&gt;
 *     &lt;enumeration value="squiggly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
