
package de.webpdf.sample.stubs.ocr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OcrLanguageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OcrLanguageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="eng"/>
 *     &lt;enumeration value="deu"/>
 *     &lt;enumeration value="fra"/>
 *     &lt;enumeration value="ita"/>
 *     &lt;enumeration value="spa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OcrLanguageType")
@XmlEnum
public enum OcrLanguageType {

    @XmlEnumValue("eng")
    ENG("eng"),
    @XmlEnumValue("deu")
    DEU("deu"),
    @XmlEnumValue("fra")
    FRA("fra"),
    @XmlEnumValue("ita")
    ITA("ita"),
    @XmlEnumValue("spa")
    SPA("spa");
    private final String value;

    OcrLanguageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OcrLanguageType fromValue(String v) {
        for (OcrLanguageType c: OcrLanguageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
