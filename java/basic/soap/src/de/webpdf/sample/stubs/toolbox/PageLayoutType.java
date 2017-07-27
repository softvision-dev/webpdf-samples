
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageLayoutType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PageLayoutType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="singlePage"/>
 *     &lt;enumeration value="singlePageContinous"/>
 *     &lt;enumeration value="twoPages"/>
 *     &lt;enumeration value="twoPagesContinous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
