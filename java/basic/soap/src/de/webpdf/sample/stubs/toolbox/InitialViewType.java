
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialViewType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitialViewType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="outlines"/>
 *     &lt;enumeration value="thumbnails"/>
 *     &lt;enumeration value="fullscreen"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
