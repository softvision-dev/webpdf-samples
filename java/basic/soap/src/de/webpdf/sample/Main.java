package de.webpdf.sample;

import de.webpdf.sample.webservice.*;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * This class calls the different webPDF web services
 */
public class Main {

    // base URL for the webPDF server
    private static URL serverURL;
    private static File targetFile = new File("./result/output.pdf");

    /**
     * Main method that calls the web services
     *
     * @param args args[0] defines the type of web service
     *             0 = Converter
     *             1 = Pdfa
     *             2 = Signature
     *             3 = Toolbox
     *             4 = OCR
     *             5 = Barcode
     *             6 = URLConverter
     * @throws IOException web service call exception
     */
    public static void main(String[] args) throws IOException, URISyntaxException {

        // dumps the http request and response to the console
        //com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump = true;

        // sets the base URL of the webPDF server
        serverURL = new URL("http://localhost:8080");

        int webservice = Integer.valueOf(args[0]);

        switch (webservice) {
            case 0:
                System.out.println("Using web service 'converter'");
                new Main().callConverter();
                break;
            case 1:
                System.out.println("Using web service 'pdfa'");
                new Main().callPdfa();
                break;
            case 2:
                System.out.println("Using web service 'signature'");
                new Main().callSignature();
                break;
            case 3:
                System.out.println("Using web service 'toolbox'");
                new Main().callToolbox();
                break;
            case 4:
                System.out.println("Using web service 'ocr'");
                new Main().callOCR();
                break;
            case 5:
                System.out.println("Using web service 'barcode'");
                new Main().callBarcode();
                break;
            case 6:
                System.out.println("Using web service 'urlconverter'");
                new Main().callUrlConverter();
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("No web service for argument %d available!", webservice));
        }

        System.out.println("Output file '" + targetFile.getAbsolutePath() + "' created");
    }

    /**
     * Call the 'Converter' web service
     *
     * @throws IOException web service exception
     */
    private void callConverter() throws IOException {

        File sourceFile = new File("./files/lorem-ipsum.docx");

        ConverterWebservice converterWebservice = new ConverterWebservice(serverURL, sourceFile.toURI());
        converterWebservice.setServerProtected(false);
        converterWebservice.setUseAuthorization(false);
        converterWebservice.execute(targetFile);
    }

    /**
     * Call the 'Pdfa' web service
     *
     * @throws IOException web service exception
     */
    private void callPdfa() throws IOException {
        File sourceFile = new File("./files/ocr.pdf");

        PdfaWebservice pdfaWebservice = new PdfaWebservice(serverURL, sourceFile.toURI());
        pdfaWebservice.setServerProtected(true);
        pdfaWebservice.setUseAuthorization(true);
        pdfaWebservice.execute(targetFile);
    }

    /**
     * Call the 'Toolbox' web service
     *
     * @throws IOException web service exception
     */
    private void callToolbox() throws IOException {
        File sourceFile = new File("./files/ocr.pdf");

        ToolboxWebservice toolboxWebservice = new ToolboxWebservice(serverURL, sourceFile.toURI());
        toolboxWebservice.setServerProtected(true);
        toolboxWebservice.setUseAuthorization(true);
        toolboxWebservice.execute(targetFile);
    }

    /**
     * Call the 'Signature' web service
     *
     * @throws IOException web service exception
     */
    private void callSignature() throws IOException {
        File sourceFile = new File("./files/ocr.pdf");

        SignatureWebservice signatureWebservice = new SignatureWebservice(serverURL, sourceFile.toURI());
        signatureWebservice.setServerProtected(true);
        signatureWebservice.setUseAuthorization(true);
        signatureWebservice.execute(targetFile);
    }

    /**
     * Call the 'OCR' web service
     *
     * @throws IOException web service exception
     */
    private void callOCR() throws IOException {
        File sourceFile = new File("./files/ocr.pdf");

        OCRWebservice ocrWebservice = new OCRWebservice(serverURL, sourceFile.toURI());
        ocrWebservice.setServerProtected(true);
        ocrWebservice.setUseAuthorization(true);
        ocrWebservice.execute(targetFile);
    }

    /**
     * Call the 'Barcode' web service
     *
     * @throws IOException web service exception
     */
    private void callBarcode() throws IOException {
        File sourceFile = new File("./files/ocr.pdf");

        BarcodeWebservice barcodeWebservice = new BarcodeWebservice(serverURL, sourceFile.toURI());
        barcodeWebservice.setServerProtected(true);
        barcodeWebservice.setUseAuthorization(true);
        barcodeWebservice.execute(targetFile);
    }

    /**
     * Call the 'URLConverter' web service
     *
     * @throws IOException web service exception
     */
    private void callUrlConverter() throws IOException, URISyntaxException {

        UrlConverterWebservice urlConverterWebservice = new UrlConverterWebservice(serverURL, new URI("https://www.webpdf.de"));
        urlConverterWebservice.setServerProtected(true);
        urlConverterWebservice.setUseAuthorization(true);
        urlConverterWebservice.execute(targetFile);
    }

}
