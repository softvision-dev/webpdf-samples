
package de.webpdf.sample.stubs.ocr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OcrOutputType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OcrOutputType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="hocr"/>
 *     &lt;enumeration value="pdf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OcrOutputType")
@XmlEnum
public enum OcrOutputType {

    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("hocr")
    HOCR("hocr"),
    @XmlEnumValue("pdf")
    PDF("pdf");
    private final String value;

    OcrOutputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OcrOutputType fromValue(String v) {
        for (OcrOutputType c: OcrOutputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
