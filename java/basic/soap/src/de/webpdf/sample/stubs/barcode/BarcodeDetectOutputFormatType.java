
package de.webpdf.sample.stubs.barcode;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeDetectOutputFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BarcodeDetectOutputFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="json"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BarcodeDetectOutputFormatType")
@XmlEnum
public enum BarcodeDetectOutputFormatType {

    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("json")
    JSON("json");
    private final String value;

    BarcodeDetectOutputFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BarcodeDetectOutputFormatType fromValue(String v) {
        for (BarcodeDetectOutputFormatType c: BarcodeDetectOutputFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
