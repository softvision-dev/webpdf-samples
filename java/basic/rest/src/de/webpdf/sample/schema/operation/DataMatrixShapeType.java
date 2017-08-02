
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DataMatrixShapeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataMatrixShapeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="default"/&gt;
 *     &lt;enumeration value="rectangle"/&gt;
 *     &lt;enumeration value="square"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
