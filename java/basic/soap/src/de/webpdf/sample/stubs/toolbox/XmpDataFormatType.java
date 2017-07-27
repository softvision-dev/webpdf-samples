
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmpDataFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XmpDataFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="json"/>
 *     &lt;enumeration value="xml"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XmpDataFormatType")
@XmlEnum
public enum XmpDataFormatType {

    @XmlEnumValue("json")
    JSON("json"),
    @XmlEnumValue("xml")
    XML("xml");
    private final String value;

    XmpDataFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XmpDataFormatType fromValue(String v) {
        for (XmpDataFormatType c: XmpDataFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
