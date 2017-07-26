
package de.webpdf.sample.stubs.converter;

import javax.activation.DataHandler;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.webpdf.sample.stubs.converter package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExecuteResponseReturn_QNAME = new QName("", "return");
    private final static QName _Execute_QNAME = new QName("http://schema.webpdf.de/1.0/soap/converter", "execute");
    private final static QName _WebserviceException_QNAME = new QName("http://schema.webpdf.de/1.0/soap/converter", "WebserviceException");
    private final static QName _ExecuteResponse_QNAME = new QName("http://schema.webpdf.de/1.0/soap/converter", "executeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.webpdf.sample.stubs.converter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link SignatureType.Add }
     * 
     */
    public SignatureType.Add createSignatureTypeAdd() {
        return new SignatureType.Add();
    }

    /**
     * Create an instance of {@link PdfaType }
     * 
     */
    public PdfaType createPdfaType() {
        return new PdfaType();
    }

    /**
     * Create an instance of {@link FaultInfo }
     * 
     */
    public FaultInfo createFaultInfo() {
        return new FaultInfo();
    }

    /**
     * Create an instance of {@link Execute }
     * 
     */
    public Execute createExecute() {
        return new Execute();
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     * 
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link BillingType }
     * 
     */
    public BillingType createBillingType() {
        return new BillingType();
    }

    /**
     * Create an instance of {@link PdfPasswordType }
     * 
     */
    public PdfPasswordType createPdfPasswordType() {
        return new PdfPasswordType();
    }

    /**
     * Create an instance of {@link ConverterType }
     * 
     */
    public ConverterType createConverterType() {
        return new ConverterType();
    }

    /**
     * Create an instance of {@link ZugferdType }
     * 
     */
    public ZugferdType createZugferdType() {
        return new ZugferdType();
    }

    /**
     * Create an instance of {@link TemplateType }
     * 
     */
    public TemplateType createTemplateType() {
        return new TemplateType();
    }

    /**
     * Create an instance of {@link SignatureImageType }
     * 
     */
    public SignatureImageType createSignatureImageType() {
        return new SignatureImageType();
    }

    /**
     * Create an instance of {@link SharePointBridgeType }
     * 
     */
    public SharePointBridgeType createSharePointBridgeType() {
        return new SharePointBridgeType();
    }

    /**
     * Create an instance of {@link PageType }
     * 
     */
    public PageType createPageType() {
        return new PageType();
    }

    /**
     * Create an instance of {@link ConverterMailType }
     * 
     */
    public ConverterMailType createConverterMailType() {
        return new ConverterMailType();
    }

    /**
     * Create an instance of {@link ConverterReportType }
     * 
     */
    public ConverterReportType createConverterReportType() {
        return new ConverterReportType();
    }

    /**
     * Create an instance of {@link SignaturePositionType }
     * 
     */
    public SignaturePositionType createSignaturePositionType() {
        return new SignaturePositionType();
    }

    /**
     * Create an instance of {@link OfficeBridgeType }
     * 
     */
    public OfficeBridgeType createOfficeBridgeType() {
        return new OfficeBridgeType();
    }

    /**
     * Create an instance of {@link ConverterHtmlType }
     * 
     */
    public ConverterHtmlType createConverterHtmlType() {
        return new ConverterHtmlType();
    }

    /**
     * Create an instance of {@link MarginType }
     * 
     */
    public MarginType createMarginType() {
        return new MarginType();
    }

    /**
     * Create an instance of {@link SignatureIdentifierType }
     * 
     */
    public SignatureIdentifierType createSignatureIdentifierType() {
        return new SignatureIdentifierType();
    }

    /**
     * Create an instance of {@link ConverterTemplateType }
     * 
     */
    public ConverterTemplateType createConverterTemplateType() {
        return new ConverterTemplateType();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link SignatureType.Add.Appearance }
     * 
     */
    public SignatureType.Add.Appearance createSignatureTypeAddAppearance() {
        return new SignatureType.Add.Appearance();
    }

    /**
     * Create an instance of {@link PdfaType.Convert }
     * 
     */
    public PdfaType.Convert createPdfaTypeConvert() {
        return new PdfaType.Convert();
    }

    /**
     * Create an instance of {@link PdfaType.Analyze }
     * 
     */
    public PdfaType.Analyze createPdfaTypeAnalyze() {
        return new PdfaType.Analyze();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = ExecuteResponse.class)
    @XmlMimeType("application/octet-stream")
    public JAXBElement<DataHandler> createExecuteResponseReturn(DataHandler value) {
        return new JAXBElement<DataHandler>(_ExecuteResponseReturn_QNAME, DataHandler.class, ExecuteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Execute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.webpdf.de/1.0/soap/converter", name = "execute")
    public JAXBElement<Execute> createExecute(Execute value) {
        return new JAXBElement<Execute>(_Execute_QNAME, Execute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.webpdf.de/1.0/soap/converter", name = "WebserviceException")
    public JAXBElement<FaultInfo> createWebserviceException(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_WebserviceException_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.webpdf.de/1.0/soap/converter", name = "executeResponse")
    public JAXBElement<ExecuteResponse> createExecuteResponse(ExecuteResponse value) {
        return new JAXBElement<ExecuteResponse>(_ExecuteResponse_QNAME, ExecuteResponse.class, null, value);
    }

}
