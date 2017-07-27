
package de.webpdf.sample.stubs.toolbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TiffCompressionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TiffCompressionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="rle"/>
 *     &lt;enumeration value="deflate"/>
 *     &lt;enumeration value="group3"/>
 *     &lt;enumeration value="group4"/>
 *     &lt;enumeration value="jpeg"/>
 *     &lt;enumeration value="lzw"/>
 *     &lt;enumeration value="packbits"/>
 *     &lt;enumeration value="zlib"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TiffCompressionType")
@XmlEnum
public enum TiffCompressionType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("rle")
    RLE("rle"),
    @XmlEnumValue("deflate")
    DEFLATE("deflate"),
    @XmlEnumValue("group3")
    GROUP_3("group3"),
    @XmlEnumValue("group4")
    GROUP_4("group4"),
    @XmlEnumValue("jpeg")
    JPEG("jpeg"),
    @XmlEnumValue("lzw")
    LZW("lzw"),
    @XmlEnumValue("packbits")
    PACKBITS("packbits"),
    @XmlEnumValue("zlib")
    ZLIB("zlib");
    private final String value;

    TiffCompressionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TiffCompressionType fromValue(String v) {
        for (TiffCompressionType c: TiffCompressionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
