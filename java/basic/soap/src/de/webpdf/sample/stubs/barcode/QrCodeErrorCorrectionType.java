
package de.webpdf.sample.stubs.barcode;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QrCodeErrorCorrectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QrCodeErrorCorrectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="l"/>
 *     &lt;enumeration value="m"/>
 *     &lt;enumeration value="q"/>
 *     &lt;enumeration value="h"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QrCodeErrorCorrectionType")
@XmlEnum
public enum QrCodeErrorCorrectionType {

    @XmlEnumValue("l")
    L("l"),
    @XmlEnumValue("m")
    M("m"),
    @XmlEnumValue("q")
    Q("q"),
    @XmlEnumValue("h")
    H("h");
    private final String value;

    QrCodeErrorCorrectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QrCodeErrorCorrectionType fromValue(String v) {
        for (QrCodeErrorCorrectionType c: QrCodeErrorCorrectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
