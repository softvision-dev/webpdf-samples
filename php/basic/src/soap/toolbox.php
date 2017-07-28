<?php

$inputFile = '../../files/ocr.pdf';
$inputFileURL = "file://" . realpath($inputFile);
$mergeSourceFile = '../../files/lorem-ipsum.pdf';
$resultFile = '../../result/output-soap.pdf';

if (!file_exists($inputFile)) {
    echo "Input file '" . $inputFile . "' does not exist";
    exit;
}

// creating soap client for toolbox service
try {
    $client = new SoapClient(
        "http://localhost:8080/webPDF/soap/toolbox?wsdl", [
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


// merging local file and other pdf file with toolbox service
try {
    echo("Using web service 'toolbox' with local file '" . $inputFile . "'\n");
    $parameters = [
        'operation' => [
            'merge' => [
                'page' => 2,
                'sourceIsZip' => false,
                'data' => [
                    '_' => file_get_contents($mergeSourceFile),
                    'format' => 'pdf'
                ]
            ]
        ],
        'fileContent' => file_get_contents($inputFile),
    ];

    $response = $client->execute($parameters);
    file_put_contents($resultFile, $response->return);
    echo "Output file '" . $resultFile . "' created\n";

} catch (Exception $e) {
    if ($e->detail) {
        echo "Error code: {$e->detail->WebserviceException->errorCode}\n";
        echo "Error message: {$e->detail->WebserviceException->errorMessage}\n";
    }
    echo "$e\n";
}

echo "----------\n";

// merging URL resource and other pdf file with toolbox service
try {
    echo("Using web service 'toolbox' with file URL '" . $inputFileURL . "'\n");

    $parameters = [
        'operation' => [
            'merge' => [
                'page' => 2,
                'sourceIsZip' => false,
                'data' => [
                    '_' => file_get_contents($mergeSourceFile),
                    'format' => 'pdf'
                ]
            ]
        ],
        "fileURL" => $inputFileURL,
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
