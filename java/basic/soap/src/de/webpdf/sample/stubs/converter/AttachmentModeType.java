
package de.webpdf.sample.stubs.converter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="embed"/>
 *     &lt;enumeration value="remove"/>
 *     &lt;enumeration value="convert"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
