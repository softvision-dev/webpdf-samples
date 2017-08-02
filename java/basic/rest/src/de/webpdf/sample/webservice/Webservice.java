package de.webpdf.sample.webservice;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

interface Webservice {

    void execute(File targetFile) throws IOException, JAXBException, URISyntaxException;
}
