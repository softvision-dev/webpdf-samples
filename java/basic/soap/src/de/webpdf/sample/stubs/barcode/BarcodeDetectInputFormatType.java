
package de.webpdf.sample.stubs.barcode;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeDetectInputFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BarcodeDetectInputFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pdf"/>
 *     &lt;enumeration value="img"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BarcodeDetectInputFormatType")
@XmlEnum
public enum BarcodeDetectInputFormatType {

    @XmlEnumValue("pdf")
    PDF("pdf"),
    @XmlEnumValue("img")
    IMG("img");
    private final String value;

    BarcodeDetectInputFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BarcodeDetectInputFormatType fromValue(String v) {
        for (BarcodeDetectInputFormatType c: BarcodeDetectInputFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
