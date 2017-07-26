
package de.webpdf.sample.stubs.converter;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConverterService", targetNamespace = "http://schema.webpdf.de/1.0/soap/converter", wsdlLocation = "http://localhost:8080/webPDF/soap/converter?wsdl")
public class ConverterService
    extends Service
{

    private final static URL CONVERTERSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONVERTERSERVICE_EXCEPTION;
    private final static QName CONVERTERSERVICE_QNAME = new QName("http://schema.webpdf.de/1.0/soap/converter", "ConverterService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/webPDF/soap/converter?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERTERSERVICE_WSDL_LOCATION = url;
        CONVERTERSERVICE_EXCEPTION = e;
    }

    public ConverterService() {
        super(__getWsdlLocation(), CONVERTERSERVICE_QNAME);
    }

    public ConverterService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVERTERSERVICE_QNAME, features);
    }

    public ConverterService(URL wsdlLocation) {
        super(wsdlLocation, CONVERTERSERVICE_QNAME);
    }

    public ConverterService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVERTERSERVICE_QNAME, features);
    }

    public ConverterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConverterService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Converter
     */
    @WebEndpoint(name = "ConverterPort")
    public Converter getConverterPort() {
        return super.getPort(new QName("http://schema.webpdf.de/1.0/soap/converter", "ConverterPort"), Converter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Converter
     */
    @WebEndpoint(name = "ConverterPort")
    public Converter getConverterPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://schema.webpdf.de/1.0/soap/converter", "ConverterPort"), Converter.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERTERSERVICE_EXCEPTION!= null) {
            throw CONVERTERSERVICE_EXCEPTION;
        }
        return CONVERTERSERVICE_WSDL_LOCATION;
    }

}
