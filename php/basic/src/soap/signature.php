<?php

$inputFile = '../../files/lorem-ipsum.pdf';
$inputFileURL = "file://" . realpath($inputFile);
$imageSourceFile = realpath('../../files/logo.png');
$resultFile = '../../result/output-soap.pdf';

if (!file_exists($inputFile)) {
    echo "Input file '" . $inputFile . "' does not exist";
    exit;
}

// creating soap client for signature service
try {
    $client = new SoapClient(
        "http://localhost:8080/webPDF/soap/signature?wsdl", [
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

//sign image
$imageData = file_get_contents($imageSourceFile);

$operationParameters = [
    'signature' => [
        'add' => [
            'certificationLevel' => 'noChanges',
            'contact' => 'John Doe',
            'keyName' => 'Generic self-signed certificate',
            'appearance' => [
                'page' => 1,
                'name' => 'John Doe, Company',
                'identifierElements' => [
                    'showCommonName' => true,
                    'showOrganisationName' => false,
                    'showSignedBy' => true,
                    'showCountry' => false,
                    'showMail' => false,
                    'showOrganisationUnit' => false,
                ],
                'position' => [
                    'x' => 5,
                    'y' => 5,
                    'width' => 80,
                    'height' => 15
                ],
                'image' => [
                    'position' => 'center',
                    'data' => $imageData
                ],

            ]
        ]
    ],
];

// sign local pdf with signature service
try {
    echo("Using web service 'signature' with local file '" . $inputFile . "'\n");
    $parameters = [
        'operation' => $operationParameters,
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

// sign pdf with signature  service
try {
    echo("Using web service 'signature' with file URL '" . $inputFileURL . "'\n");

    $parameters = [
        'operation' => $operationParameters,
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
