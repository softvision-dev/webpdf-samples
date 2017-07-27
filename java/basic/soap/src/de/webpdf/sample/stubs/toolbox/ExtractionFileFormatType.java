
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtractionFileFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtractionFileFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="json"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
