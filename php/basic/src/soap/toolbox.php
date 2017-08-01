<?php

$inputFile = '../../files/lorem-ipsum.pdf';
$inputFileURL = "file://".realpath($inputFile);
$mergeSourceFile = '../../files/merge.pdf';
$resultFile = '../../result/output-soap.pdf';
$resultFileURL = '../../result/output-url-soap.pdf';

if (!file_exists($inputFile)) {
    echo "Input file '".$inputFile."' does not exist";
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

$operationParameters = [
    'merge' => [
        'page' => 1,
        'sourceIsZip' => false,
        'mode' => 'afterPage',
        'data' => [
            '_' => file_get_contents($mergeSourceFile),
            'format' => 'pdf',
        ],
    ],
    'rotate' => [
        'pages' => '1-5',
        'degrees' => 90,
    ],
    'delete' => [
        'pages' => '5-8',
    ],
];

// merging local file and other pdf file with toolbox service + rotation + deletion
try {
    echo("Using web service 'toolbox' with local file '".$inputFile."'\n");
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

// merging URL resource and other pdf file with toolbox service + rotation + deletion
try {
    echo("Using web service 'toolbox' with file URL '".$inputFileURL."'\n");

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
