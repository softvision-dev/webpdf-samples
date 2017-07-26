package de.webpdf.sample.webservice;

import java.io.File;
import java.io.IOException;

/**
 * Interface for the web service wrapper
 */
interface Webservice {

    void execute(File targetFile) throws IOException;

}
