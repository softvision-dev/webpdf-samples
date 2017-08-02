
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WatermarkPositionModeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="WatermarkPositionModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="custom"/&gt;
 *     &lt;enumeration value="top_left"/&gt;
 *     &lt;enumeration value="top_center"/&gt;
 *     &lt;enumeration value="top_right"/&gt;
 *     &lt;enumeration value="center_left"/&gt;
 *     &lt;enumeration value="center_center"/&gt;
 *     &lt;enumeration value="center_right"/&gt;
 *     &lt;enumeration value="bottom_left"/&gt;
 *     &lt;enumeration value="bottom_center"/&gt;
 *     &lt;enumeration value="bottom_right"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WatermarkPositionModeType")
@XmlEnum
public enum WatermarkPositionModeType {

    @XmlEnumValue("custom")
    CUSTOM("custom"),
    @XmlEnumValue("top_left")
    TOP_LEFT("top_left"),
    @XmlEnumValue("top_center")
    TOP_CENTER("top_center"),
    @XmlEnumValue("top_right")
    TOP_RIGHT("top_right"),
    @XmlEnumValue("center_left")
    CENTER_LEFT("center_left"),
    @XmlEnumValue("center_center")
    CENTER_CENTER("center_center"),
    @XmlEnumValue("center_right")
    CENTER_RIGHT("center_right"),
    @XmlEnumValue("bottom_left")
    BOTTOM_LEFT("bottom_left"),
    @XmlEnumValue("bottom_center")
    BOTTOM_CENTER("bottom_center"),
    @XmlEnumValue("bottom_right")
    BOTTOM_RIGHT("bottom_right");
    private final String value;

    WatermarkPositionModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WatermarkPositionModeType fromValue(String v) {
        for (WatermarkPositionModeType c: WatermarkPositionModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
