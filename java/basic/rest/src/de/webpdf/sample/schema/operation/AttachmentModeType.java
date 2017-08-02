
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AttachmentModeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="embed"/&gt;
 *     &lt;enumeration value="remove"/&gt;
 *     &lt;enumeration value="convert"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttachmentModeType")
@XmlEnum
public enum AttachmentModeType {

    @XmlEnumValue("embed")
    EMBED("embed"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("convert")
    CONVERT("convert");
    private final String value;

    AttachmentModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentModeType fromValue(String v) {
        for (AttachmentModeType c: AttachmentModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
