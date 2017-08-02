
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PdfaErrorReportType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PdfaErrorReportType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="file"/&gt;
 *     &lt;enumeration value="message"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
