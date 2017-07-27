
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergeModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MergeModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="atTheEnd"/>
 *     &lt;enumeration value="atTheBeginning"/>
 *     &lt;enumeration value="afterPage"/>
 *     &lt;enumeration value="beforePage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
