package de.webpdf.sample.schema.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SessionToken {
    private String token;

    public String getToken() {
        return token;
    }

    @XmlElement(name = "token")
    public void setToken(String token) {
        this.token = token;
    }
}
