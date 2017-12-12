/**
 * Add qr code to page 1
 * @param documentId
 */
var barcode = function (documentId) {
    var barcodeUrl = config.baseURL + 'barcode/' + documentId;
    var log = $('#log');

    var options = JSON.stringify(
        {
            barcode: {
                add: {
                    qrcode: [
                        {
                            value: 'https://www.webpdf.de',
                            pages: '1',
                            rotation: 0,
                            margin: 3,
                            errorCorrection: 'l',
                            position: {
                                x: 25,
                                y: 50,
                                width: 25,
                                height: 25,
                                metrics: 'mm'
                            }
                        }
                    ]
                }
            }
        }
    );

    $.ajax(
        {
            url: barcodeUrl,
            type: 'POST',
            headers: {
                Token: config.token
            },
            data: options,
            cache: false,
            dataType: 'json',
            processData: false,
            contentType: 'application/json',
            success: function (result) {
                log.html('barcode successfully added\n');
                log.append(JSON.stringify(result, null, '\t'));
                refreshFiles();
            },
            error: function (error) {
                log.html('barcode failed\n');
                log.append(JSON.stringify(error, null, '\t'));
            }
        }
    );
};