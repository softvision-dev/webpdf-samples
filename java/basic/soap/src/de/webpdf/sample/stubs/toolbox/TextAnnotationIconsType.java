
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextAnnotationIconsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TextAnnotationIconsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="comment"/>
 *     &lt;enumeration value="key"/>
 *     &lt;enumeration value="note"/>
 *     &lt;enumeration value="help"/>
 *     &lt;enumeration value="newParagraph"/>
 *     &lt;enumeration value="paragraph"/>
 *     &lt;enumeration value="insert"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TextAnnotationIconsType")
@XmlEnum
public enum TextAnnotationIconsType {

    @XmlEnumValue("comment")
    COMMENT("comment"),
    @XmlEnumValue("key")
    KEY("key"),
    @XmlEnumValue("note")
    NOTE("note"),
    @XmlEnumValue("help")
    HELP("help"),
    @XmlEnumValue("newParagraph")
    NEW_PARAGRAPH("newParagraph"),
    @XmlEnumValue("paragraph")
    PARAGRAPH("paragraph"),
    @XmlEnumValue("insert")
    INSERT("insert");
    private final String value;

    TextAnnotationIconsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextAnnotationIconsType fromValue(String v) {
        for (TextAnnotationIconsType c: TextAnnotationIconsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
