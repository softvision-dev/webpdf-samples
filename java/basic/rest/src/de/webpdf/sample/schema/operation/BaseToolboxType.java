
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BaseToolboxType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseToolboxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseToolboxType")
@XmlSeeAlso({
    AnnotationType.class,
    AttachmentType.class,
    DeleteType.class,
    DescriptionType.class,
    ExtractionType.class,
    FormsType.class,
    ImageType.class,
    MergeType.class,
    OptionsType.class,
    PrintType.class,
    RotateType.class,
    SecurityType.class,
    SplitType.class,
    WatermarkType.class,
    XmpType.class
})
public class BaseToolboxType {


}
