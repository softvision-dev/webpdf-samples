
package de.webpdf.sample.stubs.pdfa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdfaErrorReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PdfaErrorReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="message"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PdfaErrorReportType")
@XmlEnum
public enum PdfaErrorReportType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("message")
    MESSAGE("message");
    private final String value;

    PdfaErrorReportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PdfaErrorReportType fromValue(String v) {
        for (PdfaErrorReportType c: PdfaErrorReportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
