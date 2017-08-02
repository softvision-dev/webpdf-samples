
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OcrLanguageType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OcrLanguageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="eng"/&gt;
 *     &lt;enumeration value="deu"/&gt;
 *     &lt;enumeration value="fra"/&gt;
 *     &lt;enumeration value="ita"/&gt;
 *     &lt;enumeration value="spa"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
