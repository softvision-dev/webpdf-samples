package de.webpdf.sample;

import de.webpdf.sample.helper.HttpAccept;
import de.webpdf.sample.webservice.*;

import javax.xml.bind.JAXBException;
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
    private static HttpAccept httpAccept = HttpAccept.XML;

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
     * @throws IOException        web service call exception
     * @throws JAXBException      object conversion exception
     * @throws URISyntaxException URL syntax exception
     */
    public static void main(String[] args) throws IOException, JAXBException, URISyntaxException {

        // sets the base URL of the webPDF server
        serverURL = new URL("http://localhost:8080/webPDF");

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
                new Main().callOcr();
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
     * Call the 'converter' web service
     *
     * @throws IOException web service exception
     */
    private void callConverter() throws IOException, JAXBException, URISyntaxException {
        File sourceFile = new File("./files/lorem-ipsum.docx");

        try (ConverterWebservice converterWebservice = new ConverterWebservice(serverURL, sourceFile.toURI(), httpAccept)) {
            converterWebservice.setUseAuthorization(true);
            converterWebservice.execute(targetFile);
        }
    }

    /**
     * Call the 'pdfa' web service
     *
     * @throws IOException web service exception
     */
    private void callPdfa() throws IOException, JAXBException, URISyntaxException {
        File sourceFile = new File("./files/lorem-ipsum.pdf");

        try (PdfaWebservice pdfaWebservice = new PdfaWebservice(serverURL, sourceFile.toURI(), httpAccept)) {
            pdfaWebservice.setUseAuthorization(true);
            pdfaWebservice.execute(targetFile);
        }
    }

    /**
     * Call the 'signature' web service
     *
     * @throws IOException web service exception
     */
    private void callSignature() throws IOException, JAXBException, URISyntaxException {
        File sourceFile = new File("./files/lorem-ipsum.pdf");

        try (SignatureWebservice signatureWebservice = new SignatureWebservice(serverURL, sourceFile.toURI(), httpAccept)) {
            signatureWebservice.setUseAuthorization(true);
            signatureWebservice.execute(targetFile);
        }
    }

    /**
     * Call the 'toolbox' web service
     *
     * @throws IOException web service exception
     */
    private void callToolbox() throws IOException, JAXBException, URISyntaxException {
        File sourceFile = new File("./files/lorem-ipsum.pdf");

        try (ToolboxWebservice toolboxWebservice = new ToolboxWebservice(serverURL, sourceFile.toURI(), httpAccept)) {
            toolboxWebservice.setUseAuthorization(true);
            toolboxWebservice.execute(targetFile);
        }
    }

    /**
     * Call the 'ocr' web service
     *
     * @throws IOException web service exception
     */
    private void callOcr() throws IOException, JAXBException, URISyntaxException {
        File sourceFile = new File("./files/ocr.png");

        try (OcrWebservice ocrWebservice = new OcrWebservice(serverURL, sourceFile.toURI(), httpAccept)) {
            ocrWebservice.setUseAuthorization(true);
            ocrWebservice.execute(targetFile);
        }
    }

    /**
     * Call the 'barcode' web service
     *
     * @throws IOException web service exception
     */
    private void callBarcode() throws IOException, JAXBException, URISyntaxException {
        File sourceFile = new File("./files/lorem-ipsum.pdf");

        try (BarcodeWebservice barcodeWebservice = new BarcodeWebservice(serverURL, sourceFile.toURI(), httpAccept)) {
            barcodeWebservice.setUseAuthorization(true);
            barcodeWebservice.execute(targetFile);
        }
    }

    /**
     * Call the 'urlconverter' web service
     *
     * @throws IOException web service exception
     */
    private void callUrlConverter() throws IOException, JAXBException, URISyntaxException {

        try (UrlConverterWebservice urlConverterWebservice = new UrlConverterWebservice(
                serverURL, new URI("https://www.webpdf.de"), httpAccept)) {
            urlConverterWebservice.setUseAuthorization(true);
            urlConverterWebservice.execute(targetFile);
        }
    }
}
