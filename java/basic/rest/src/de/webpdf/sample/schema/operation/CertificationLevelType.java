
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CertificationLevelType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CertificationLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="noChanges"/&gt;
 *     &lt;enumeration value="formFillingAndSignatures"/&gt;
 *     &lt;enumeration value="formFillingAndSignaturesAndAnnotations"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CertificationLevelType")
@XmlEnum
public enum CertificationLevelType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("noChanges")
    NO_CHANGES("noChanges"),
    @XmlEnumValue("formFillingAndSignatures")
    FORM_FILLING_AND_SIGNATURES("formFillingAndSignatures"),
    @XmlEnumValue("formFillingAndSignaturesAndAnnotations")
    FORM_FILLING_AND_SIGNATURES_AND_ANNOTATIONS("formFillingAndSignaturesAndAnnotations");
    private final String value;

    CertificationLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertificationLevelType fromValue(String v) {
        for (CertificationLevelType c: CertificationLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
