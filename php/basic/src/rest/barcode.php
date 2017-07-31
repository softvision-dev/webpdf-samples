<?php
$baseURL = 'http://localhost:8080/webPDF/';
$resultFile = '../../result/output-rest.pdf';
$sourceFile = realpath('../../files/lorem-ipsum.pdf');

function getClient($url, $post = false, $token = null, $data = null)
{
    $options = [
        CURLOPT_URL => $url,
        CURLOPT_RETURNTRANSFER => true,
        CURLOPT_POST => $post,
        CURLOPT_HTTPAUTH => CURLAUTH_BASIC,
        CURLOPT_USERNAME => "admin",
        CURLOPT_PASSWORD => "admin",
        CURLOPT_FOLLOWLOCATION => true,
    ];

    if ($token) {
        $options[CURLOPT_HTTPHEADER] = $token;
    }

    if ($data) {
        $options[CURLOPT_POSTFIELDS] = $data;
    }

    $client = curl_init();
    curl_setopt_array($client, $options);
    $response = curl_exec($client);

    $status = curl_getinfo($client, CURLINFO_HTTP_CODE);
    curl_close($client);

    if ($status != 200) {
        die("HTTP status: $status \nResponse: $response\n");
    }

    return $response;
}

echo("Using web service with file '$sourceFile'\n");

// Login on Server (GET)
$loginUrl = $baseURL . "rest/authentication/user/login";
$response = getClient($loginUrl);
$response = json_decode($response);
$token = $response->token;
echo "Login successful: $token\n";

// Upload document (POST)
$uploadUrl = $baseURL . "rest/documents";
$headerInfo = ["Token: $token"];

$postFields = ["filedata" => curl_file_create($sourceFile)];
$response = getClient($uploadUrl, true, $headerInfo, $postFields);
$response = json_decode($response);
$documentId = $response->documentId;
echo "Document ID: $documentId\n";

// Create barcode in PDF (POST)
$headerInfo = ["Token: $token", "Content-Type: application/json; charset=utf-8"];
$barcodeUrl = $baseURL . "rest/barcode/" . $response->documentId;
$barcodeOptions = [
    'barcode' => [
        'add' => [
            'qrcode' => [[
                'position' => [
                    'x' => 2,
                    'y' => 2,
                    'width' => 20,
                    'height' => 20
                ],
                'pages' => '1-3',
                'value' => 'https://www.webpdf.de',
            ]],
            'ean8' => [[
                'position' => [
                    'x' => 190,
                    'y' => 2,
                    'width' => 10,
                    'height' => 40
                ],
                'value' => '90311017',
                'pages' => '*',
                'rotation' => 90
            ]]
        ],
    ],
];
$response = getClient($barcodeUrl, true, $headerInfo, json_encode($barcodeOptions));
$response = json_decode($response);
echo "Web service call successful\n";

// Download the PDF
$downloadUrl = $baseURL . "rest/documents/" . $response->documentId;
$headerInfo = ["Token: $token"];
$response = getClient($downloadUrl, false, $headerInfo);
file_put_contents($resultFile, $response);
echo "Download to file '$resultFile' successful\n";

// Logout on Server (GET)
$logoutUrl = $baseURL . "rest/authentication/user/logout";
$headerInfo = ["Token: $token"];
$response = getClient($logoutUrl, false, $headerInfo);
$response = json_decode($response);
echo "Logout successful";
