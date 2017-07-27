
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileDataFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileDataFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pdf"/>
 *     &lt;enumeration value="zip"/>
 *     &lt;enumeration value="id"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
