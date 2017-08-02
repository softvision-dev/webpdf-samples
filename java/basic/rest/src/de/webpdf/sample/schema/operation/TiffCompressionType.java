
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TiffCompressionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TiffCompressionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="rle"/&gt;
 *     &lt;enumeration value="deflate"/&gt;
 *     &lt;enumeration value="group3"/&gt;
 *     &lt;enumeration value="group4"/&gt;
 *     &lt;enumeration value="jpeg"/&gt;
 *     &lt;enumeration value="lzw"/&gt;
 *     &lt;enumeration value="packbits"/&gt;
 *     &lt;enumeration value="zlib"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
