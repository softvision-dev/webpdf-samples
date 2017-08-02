
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PdfaSuccessReportType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PdfaSuccessReportType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="zip"/&gt;
 *     &lt;enumeration value="linked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
