
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MergeModeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MergeModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="atTheEnd"/&gt;
 *     &lt;enumeration value="atTheBeginning"/&gt;
 *     &lt;enumeration value="afterPage"/&gt;
 *     &lt;enumeration value="beforePage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MergeModeType")
@XmlEnum
public enum MergeModeType {

    @XmlEnumValue("atTheEnd")
    AT_THE_END("atTheEnd"),
    @XmlEnumValue("atTheBeginning")
    AT_THE_BEGINNING("atTheBeginning"),
    @XmlEnumValue("afterPage")
    AFTER_PAGE("afterPage"),
    @XmlEnumValue("beforePage")
    BEFORE_PAGE("beforePage");
    private final String value;

    MergeModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MergeModeType fromValue(String v) {
        for (MergeModeType c: MergeModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
