
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PageLayoutType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PageLayoutType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="singlePage"/&gt;
 *     &lt;enumeration value="singlePageContinous"/&gt;
 *     &lt;enumeration value="twoPages"/&gt;
 *     &lt;enumeration value="twoPagesContinous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PageLayoutType")
@XmlEnum
public enum PageLayoutType {

    @XmlEnumValue("singlePage")
    SINGLE_PAGE("singlePage"),
    @XmlEnumValue("singlePageContinous")
    SINGLE_PAGE_CONTINOUS("singlePageContinous"),
    @XmlEnumValue("twoPages")
    TWO_PAGES("twoPages"),
    @XmlEnumValue("twoPagesContinous")
    TWO_PAGES_CONTINOUS("twoPagesContinous");
    private final String value;

    PageLayoutType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PageLayoutType fromValue(String v) {
        for (PageLayoutType c: PageLayoutType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
