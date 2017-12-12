/**
 * Rotate page 1 by 90 deg
 * @param documentId
 */
var rotate = function (documentId) {
    var toolboxUrl = config.baseURL + 'toolbox/' + documentId;
    var log = $('#log');

    var options = JSON.stringify(
        {
            toolbox: [
                {
                    rotate: {
                        pages: '1',
                        degrees: 90,
                        pageGroup: 'all',
                        pageOrientation: 'any'
                    }
                }
            ]
        }
    );

    $.ajax(
        {
            url: toolboxUrl,
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
                log.html('page successfully rotated\n');
                log.append(JSON.stringify(result, null, '\t'));
                refreshFiles();
            },
            error: function (error) {
                log.html('page rotation failed\n');
                log.append(JSON.stringify(error, null, '\t'));
            }
        }
    );
};