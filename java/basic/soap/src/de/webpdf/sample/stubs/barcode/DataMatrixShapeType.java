
package de.webpdf.sample.stubs.barcode;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataMatrixShapeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataMatrixShapeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="rectangle"/>
 *     &lt;enumeration value="square"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataMatrixShapeType")
@XmlEnum
public enum DataMatrixShapeType {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("rectangle")
    RECTANGLE("rectangle"),
    @XmlEnumValue("square")
    SQUARE("square");
    private final String value;

    DataMatrixShapeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataMatrixShapeType fromValue(String v) {
        for (DataMatrixShapeType c: DataMatrixShapeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
