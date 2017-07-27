
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdfEncryptionKeyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PdfEncryptionKeyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RC4_40"/>
 *     &lt;enumeration value="RC4_128"/>
 *     &lt;enumeration value="AES_128"/>
 *     &lt;enumeration value="AES_256"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PdfEncryptionKeyType")
@XmlEnum
public enum PdfEncryptionKeyType {

    @XmlEnumValue("RC4_40")
    RC_4_40("RC4_40"),
    @XmlEnumValue("RC4_128")
    RC_4_128("RC4_128"),
    AES_128("AES_128"),
    AES_256("AES_256");
    private final String value;

    PdfEncryptionKeyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PdfEncryptionKeyType fromValue(String v) {
        for (PdfEncryptionKeyType c: PdfEncryptionKeyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
