
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InitialViewType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InitialViewType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="outlines"/&gt;
 *     &lt;enumeration value="thumbnails"/&gt;
 *     &lt;enumeration value="fullscreen"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InitialViewType")
@XmlEnum
public enum InitialViewType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("outlines")
    OUTLINES("outlines"),
    @XmlEnumValue("thumbnails")
    THUMBNAILS("thumbnails"),
    @XmlEnumValue("fullscreen")
    FULLSCREEN("fullscreen");
    private final String value;

    InitialViewType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InitialViewType fromValue(String v) {
        for (InitialViewType c: InitialViewType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
