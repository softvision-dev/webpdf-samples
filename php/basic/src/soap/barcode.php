<?php

$inputFile = '../../files/lorem-ipsum.pdf';
$inputFileURL = "file://".realpath($inputFile);
$resultFile = '../../result/output-soap.pdf';
$resultFileURL = '../../result/output-url-soap.pdf';

if (!file_exists($inputFile)) {
    echo "Input file '".$inputFile."' does not exist";
    exit;
}

// creating soap client for barcode service
try {
    $client = new SoapClient(
        "http://localhost:8080/webPDF/soap/barcode?wsdl", [
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

$operationParameters = [
    'barcode' => [
        'add' => [
            'qrcode' => [
                [
                    'position' => [
                        'x' => 2,
                        'y' => 2,
                        'width' => 20,
                        'height' => 20,
                    ],
                    'pages' => '1-3',
                    'value' => 'https://www.webpdf.de',
                ],
            ],
            'ean8' => [
                [
                    'position' => [
                        'x' => 190,
                        'y' => 2,
                        'width' => 10,
                        'height' => 40,
                    ],
                    'value' => '90311017',
                    'pages' => '*',
                    'rotation' => 90,
                ],
            ],
        ],
    ],
];

// generating barcode for local file with barcode service
try {
    echo("Using web service 'barcode' with local file '".$inputFile."'\n");
    $parameters = [
        'operation' => $operationParameters,
        'fileContent' => file_get_contents($inputFile),
    ];

    $response = $client->execute($parameters);
    file_put_contents($resultFile, $response->return);
    echo "Output file '".$resultFile."' created\n";

} catch (Exception $e) {
    if ($e->detail) {
        echo "Error code: {$e->detail->WebserviceException->errorCode}\n";
        echo "Error message: {$e->detail->WebserviceException->errorMessage}\n";
    }
    echo "$e\n";
}

echo "----------\n";

// generating barcode for URL resource with barcode service
try {
    echo("Using web service 'barcode' with file URL '".$inputFileURL."'\n");

    $parameters = [
        'operation' => $operationParameters,
        "fileURL" => $inputFileURL,
    ];

    $response = $client->execute($parameters);
    file_put_contents($resultFileURL, $response->return);
    echo "Output file $resultFileURL created\n";

} catch (SoapFault $e) {
    if ($e->detail) {
        echo "Error code: {$e->detail->WebserviceException->errorCode}\n";
        echo "Error message: {$e->detail->WebserviceException->errorMessage}\n\n";
    }
    echo "$e\n";
}
