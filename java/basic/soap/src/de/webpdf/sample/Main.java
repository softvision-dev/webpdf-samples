package de.webpdf.sample;

import de.webpdf.sample.webservice.ConverterWebservice;
import de.webpdf.sample.webservice.UrlConverterWebservice;

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
                // pdfa
                break;
            case 2:
                // signature
                break;
            case 3:
                // toolbox
                break;
            case 4:
                // ocr
                break;
            case 5:
                // barcode
            case 6:
                // urlconverter
                new Main().callUrlConverter();
                break;
            default:
                break;
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
