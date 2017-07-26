package de.webpdf.sample.webservice;

import java.net.PasswordAuthentication;

/**
 * Implements a default authenticator which is required, when the webPDF server
 * uses a 'security constraint' to protect all URL's.
 */
public class WebserviceAuthenticator extends java.net.Authenticator {

    private String userName;
    private String userPassword;

    WebserviceAuthenticator(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.userName, this.userPassword.toCharArray());
    }
}
