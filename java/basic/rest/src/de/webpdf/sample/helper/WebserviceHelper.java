package de.webpdf.sample.helper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.webpdf.sample.schema.operation.BaseToolboxType;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

import javax.xml.bind.*;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class WebserviceHelper {

    private static String getResponseContent(HttpEntity httpEntity) throws IOException {
        try (InputStreamReader inputStreamReader = new InputStreamReader(httpEntity.getContent());
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String tempToken;
            StringBuilder response = new StringBuilder();

            while ((tempToken = bufferedReader.readLine()) != null) {
                response.append(tempToken);
            }
            return response.toString();
        }
    }

    public static <T> T fromJSON(HttpEntity httpEntity, Class<T> type) throws JAXBException, IOException {
        Gson gson = new Gson();
        String response = WebserviceHelper.getResponseContent(httpEntity);
        return gson.fromJson(response, type);
    }

    public static String toJSON(Object object) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new EnumAdapterFactory())
                .registerTypeAdapter(BaseToolboxType.class, new BaseToolboxTypeAdapter())
                .create();
        return gson.toJson(object);
    }

    public static <T> T fromXML(HttpEntity httpEntity, Class<T> type) throws JAXBException, IOException {

        String response = EntityUtils.toString(httpEntity);

        JAXBContext jaxbContext = JAXBContext.newInstance(type);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        try (StringReader stringReader = new StringReader(response)) {
            StreamSource xmlContent = new StreamSource(stringReader);
            JAXBElement<T> jaxbElement = unmarshaller.unmarshal(xmlContent, type);
            return type.cast(jaxbElement.getValue());
        }
    }

    public static String toXML(Object object, Class type) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(type);

        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

        StringWriter stringWriter = new StringWriter();
        jaxbMarshaller.marshal(object, stringWriter);

        return stringWriter.toString();
    }
}
