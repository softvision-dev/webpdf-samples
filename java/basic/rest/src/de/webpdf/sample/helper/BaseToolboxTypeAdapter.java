package de.webpdf.sample.helper;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import de.webpdf.sample.schema.operation.BaseToolboxType;
import de.webpdf.sample.schema.operation.Operation;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class BaseToolboxTypeAdapter implements JsonSerializer<BaseToolboxType> {

    @Override
    public JsonElement serialize(BaseToolboxType src, Type typeOfSrc, JsonSerializationContext context) {

        JsonObject jsonObject = new JsonObject();

        try {
            Field nameField = Operation.class.getDeclaredField("toolbox");
            XmlElements xmlElements = nameField.getAnnotation(XmlElements.class);
            XmlElement[] allXmlElement = xmlElements.value();

            for (XmlElement xmlElement : allXmlElement) {
                if (src.getClass().getName().equals(xmlElement.type().getName())) {
                    jsonObject.add(xmlElement.name(), context.serialize(src));
                    break;
                }
            }

        } catch (NoSuchFieldException ignore) {
        } finally {
            return jsonObject;
        }
    }
}
