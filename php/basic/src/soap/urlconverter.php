<?php

$inputURL = 'https://www.webpdf.de';
$resultFile = '../../result/output-soap.pdf';


// creating soap client for urlconverter service
try {
    $client = new SoapClient(
        "http://localhost:8080/webPDF/soap/urlconverter?wsdl", [
            'soap_version' => SOAP_1_2,
            'exceptions' => true,
            'trace' => true,
            'connection_timeout' => 5,
            'cache_wsdl' => WSDL_CACHE_NONE,
            'cache_ttl' => 24 * 60 * 60,
            'login' => "admin",
            'password' => "admin",

        ]
    );
} catch (Exception $e) {
    echo $e;
    exit;
}


// converting URL resource with urlconverter service
try {
    echo("Using web service 'urlconverter' with URL '" . $inputURL . "'\n");

    $parameters = [
        'operation' => [
            'urlconverter' => [
                'url' => $inputURL
            ]
        ]
    ];

    $response = $client->execute($parameters);
    file_put_contents($resultFile, $response->return);
    echo "Output file $resultFile created\n";

} catch (SoapFault $e) {
    if ($e->detail) {
        echo "Error code: {$e->detail->WebserviceException->errorCode}\n";
        echo "Error message: {$e->detail->WebserviceException->errorMessage}\n\n";
    }
    echo "$e\n";
}
