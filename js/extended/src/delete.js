/**
 * Delete a file from the server
 * @param documentId
 */
var deleteFile = function (documentId) {
    var fileUrl = config.baseURL + 'documents/' + documentId;
    var log = $('#log');

    $.ajax(
        {
            url: fileUrl,
            type: 'DELETE',
            headers: {
                Token: config.token
            },
            cache: false,
            processData: false,
            success: function (result) {
                log.html('file deleted\n');
                log.append(JSON.stringify(result, null, '\t'));
                refreshFiles();
            },
            error: function (error) {
                log.html('deletion failed\n');
                log.append(JSON.stringify(error, null, '\t'));
            }
        }
    );
};