
package de.webpdf.sample.stubs.converter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdfaSuccessReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PdfaSuccessReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="zip"/>
 *     &lt;enumeration value="linked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PdfaSuccessReportType")
@XmlEnum
public enum PdfaSuccessReportType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("zip")
    ZIP("zip"),
    @XmlEnumValue("linked")
    LINKED("linked");
    private final String value;

    PdfaSuccessReportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PdfaSuccessReportType fromValue(String v) {
        for (PdfaSuccessReportType c: PdfaSuccessReportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
