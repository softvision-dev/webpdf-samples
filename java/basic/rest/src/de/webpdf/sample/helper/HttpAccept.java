package de.webpdf.sample.helper;

public enum HttpAccept {
    XML("application/xml"),
    JSON("application/json"),
    OCTET("application/octet-stream");

    private String mimeType;

    HttpAccept(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getMimeType() {
        return mimeType;
    }
}

