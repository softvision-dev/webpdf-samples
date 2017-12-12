/**
 * Convert document to pdf
 */
var convert = function (documentId) {
    var converterUrl = config.baseURL + 'converter/' + documentId;
    var log = $('#log');

    var options = JSON.stringify(
        {
            converter: {
                embedFonts: false,
                jpegQuality: 90,
                pages: '*',
                reduceResolution: false
            }
        }
    );

    $.ajax(
        {
            url: converterUrl,
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
                log.html('conversion successfull\n');
                log.append(JSON.stringify(result, null, '\t'));
                refreshFiles();
            },
            error: function (error) {
                log.html('conversion failed\n');
                log.append(JSON.stringify(error, null, '\t'));
            }
        }
    );
};