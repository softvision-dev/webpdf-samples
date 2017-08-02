
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TextAnnotationIconsType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TextAnnotationIconsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="comment"/&gt;
 *     &lt;enumeration value="key"/&gt;
 *     &lt;enumeration value="note"/&gt;
 *     &lt;enumeration value="help"/&gt;
 *     &lt;enumeration value="newParagraph"/&gt;
 *     &lt;enumeration value="paragraph"/&gt;
 *     &lt;enumeration value="insert"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
