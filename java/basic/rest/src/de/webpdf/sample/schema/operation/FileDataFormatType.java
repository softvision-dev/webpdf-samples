
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FileDataFormatType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FileDataFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pdf"/&gt;
 *     &lt;enumeration value="zip"/&gt;
 *     &lt;enumeration value="id"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileDataFormatType")
@XmlEnum
public enum FileDataFormatType {

    @XmlEnumValue("pdf")
    PDF("pdf"),
    @XmlEnumValue("zip")
    ZIP("zip"),
    @XmlEnumValue("id")
    ID("id");
    private final String value;

    FileDataFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileDataFormatType fromValue(String v) {
        for (FileDataFormatType c: FileDataFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
