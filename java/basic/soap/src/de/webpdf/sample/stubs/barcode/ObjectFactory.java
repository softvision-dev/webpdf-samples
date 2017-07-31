
package de.webpdf.sample.stubs.barcode;

import javax.activation.DataHandler;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.webpdf.sample.stubs.barcode package. 
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

    private final static QName _ExecuteResponse_QNAME = new QName("http://schema.webpdf.de/1.0/soap/barcode", "executeResponse");
    private final static QName _Execute_QNAME = new QName("http://schema.webpdf.de/1.0/soap/barcode", "execute");
    private final static QName _WebserviceException_QNAME = new QName("http://schema.webpdf.de/1.0/soap/barcode", "WebserviceException");
    private final static QName _ExecuteResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.webpdf.sample.stubs.barcode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BarcodeType }
     * 
     */
    public BarcodeType createBarcodeType() {
        return new BarcodeType();
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
     * Create an instance of {@link Code39BarcodeType }
     * 
     */
    public Code39BarcodeType createCode39BarcodeType() {
        return new Code39BarcodeType();
    }

    /**
     * Create an instance of {@link Code128BarcodeType }
     * 
     */
    public Code128BarcodeType createCode128BarcodeType() {
        return new Code128BarcodeType();
    }

    /**
     * Create an instance of {@link CodabarBarcodeType }
     * 
     */
    public CodabarBarcodeType createCodabarBarcodeType() {
        return new CodabarBarcodeType();
    }

    /**
     * Create an instance of {@link Ean8BarcodeType }
     * 
     */
    public Ean8BarcodeType createEan8BarcodeType() {
        return new Ean8BarcodeType();
    }

    /**
     * Create an instance of {@link DataMatrixBarcodeType }
     * 
     */
    public DataMatrixBarcodeType createDataMatrixBarcodeType() {
        return new DataMatrixBarcodeType();
    }

    /**
     * Create an instance of {@link ItfBarcodeType }
     * 
     */
    public ItfBarcodeType createItfBarcodeType() {
        return new ItfBarcodeType();
    }

    /**
     * Create an instance of {@link RectangleType }
     * 
     */
    public RectangleType createRectangleType() {
        return new RectangleType();
    }

    /**
     * Create an instance of {@link UpcaBarcodeType }
     * 
     */
    public UpcaBarcodeType createUpcaBarcodeType() {
        return new UpcaBarcodeType();
    }

    /**
     * Create an instance of {@link BarcodeSelectionType }
     * 
     */
    public BarcodeSelectionType createBarcodeSelectionType() {
        return new BarcodeSelectionType();
    }

    /**
     * Create an instance of {@link Pdf417BarcodeType }
     * 
     */
    public Pdf417BarcodeType createPdf417BarcodeType() {
        return new Pdf417BarcodeType();
    }

    /**
     * Create an instance of {@link Ean13BarcodeType }
     * 
     */
    public Ean13BarcodeType createEan13BarcodeType() {
        return new Ean13BarcodeType();
    }

    /**
     * Create an instance of {@link QrBarcodeType }
     * 
     */
    public QrBarcodeType createQrBarcodeType() {
        return new QrBarcodeType();
    }

    /**
     * Create an instance of {@link BaseBarcodeType }
     * 
     */
    public BaseBarcodeType createBaseBarcodeType() {
        return new BaseBarcodeType();
    }

    /**
     * Create an instance of {@link AztecBarcodeType }
     * 
     */
    public AztecBarcodeType createAztecBarcodeType() {
        return new AztecBarcodeType();
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
     * Create an instance of {@link BarcodeType.Add }
     * 
     */
    public BarcodeType.Add createBarcodeTypeAdd() {
        return new BarcodeType.Add();
    }

    /**
     * Create an instance of {@link BarcodeType.Detect }
     * 
     */
    public BarcodeType.Detect createBarcodeTypeDetect() {
        return new BarcodeType.Detect();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.webpdf.de/1.0/soap/barcode", name = "executeResponse")
    public JAXBElement<ExecuteResponse> createExecuteResponse(ExecuteResponse value) {
        return new JAXBElement<ExecuteResponse>(_ExecuteResponse_QNAME, ExecuteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Execute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.webpdf.de/1.0/soap/barcode", name = "execute")
    public JAXBElement<Execute> createExecute(Execute value) {
        return new JAXBElement<Execute>(_Execute_QNAME, Execute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.webpdf.de/1.0/soap/barcode", name = "WebserviceException")
    public JAXBElement<FaultInfo> createWebserviceException(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_WebserviceException_QNAME, FaultInfo.class, null, value);
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

}
