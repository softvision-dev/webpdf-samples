
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExtractionFileFormatType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtractionFileFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="text"/&gt;
 *     &lt;enumeration value="xml"/&gt;
 *     &lt;enumeration value="json"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtractionFileFormatType")
@XmlEnum
public enum ExtractionFileFormatType {

    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("json")
    JSON("json");
    private final String value;

    ExtractionFileFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtractionFileFormatType fromValue(String v) {
        for (ExtractionFileFormatType c: ExtractionFileFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
