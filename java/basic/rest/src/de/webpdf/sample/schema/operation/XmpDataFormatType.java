
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XmpDataFormatType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="XmpDataFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="json"/&gt;
 *     &lt;enumeration value="xml"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
