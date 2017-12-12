/**
 * convert document to pdfa
 * @param documentId
 */
var pdfa = function (documentId) {
    var pdfaUrl = config.baseURL + 'pdfa/' + documentId;
    var log = $('#log');

    var options = JSON.stringify(
        {
            pdfa: {
                convert: {
                    level: '3b',
                    imageQuality: 75,
                    errorReport: 'file'
                }
            }
        }
    );

    $.ajax(
        {
            url: pdfaUrl,
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
                log.html('pdfa conversion successfull\n');
                log.append(JSON.stringify(result, null, '\t'));
                refreshFiles();
            },
            error: function (error) {
                log.html('pdfa conversion failed\n');
                log.append(JSON.stringify(error, null, '\t'));
            }
        }
    );
};