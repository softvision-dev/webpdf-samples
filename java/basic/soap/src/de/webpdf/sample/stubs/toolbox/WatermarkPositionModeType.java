
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WatermarkPositionModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WatermarkPositionModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="custom"/>
 *     &lt;enumeration value="top_left"/>
 *     &lt;enumeration value="top_center"/>
 *     &lt;enumeration value="top_right"/>
 *     &lt;enumeration value="center_left"/>
 *     &lt;enumeration value="center_center"/>
 *     &lt;enumeration value="center_right"/>
 *     &lt;enumeration value="bottom_left"/>
 *     &lt;enumeration value="bottom_center"/>
 *     &lt;enumeration value="bottom_right"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
