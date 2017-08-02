
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContextType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="page"/&gt;
 *     &lt;enumeration value="document"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContextType")
@XmlEnum
public enum ContextType {

    @XmlEnumValue("page")
    PAGE("page"),
    @XmlEnumValue("document")
    DOCUMENT("document"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    ContextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContextType fromValue(String v) {
        for (ContextType c: ContextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
