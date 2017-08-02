
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für QrCodeErrorCorrectionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="QrCodeErrorCorrectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="l"/&gt;
 *     &lt;enumeration value="m"/&gt;
 *     &lt;enumeration value="q"/&gt;
 *     &lt;enumeration value="h"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
