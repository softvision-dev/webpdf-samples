/**
 * Initialize and bind plupload uploader
 */
var initUploader = function () {
    var uploadUrl = config.baseURL + 'documents';
    var log = $('#log');

    $('#uploader').html('<input type="file" id="upload-input"/>');

    var uploader = new plupload.Uploader(
        {
            browse_button: 'upload-input',
            url: uploadUrl,
            headers: {
                Token: config.token
            },
            multiple_queues: false,
            urlstream_upload: false,
            file_data_name: 'filedata'
        }
    );

    uploader.init();

    uploader.bind(
        'FilesAdded',
        function () {
            uploader.start();
        }
    );

    uploader.bind(
        'FileUploaded',
        function (up, file, response) {
            var document = JSON.parse(response.response);
            log.html('upload successfull\n\n');
            log.append(JSON.stringify(document, null, '\t'));
            refreshFiles();
        }
    );

    uploader.bind(
        'Error',
        function (up, error) {
            log.html('upload failed\n\n');
            log.append(JSON.stringify(error, null, '\t'));
        }
    );

    $('#upload-input').on(
        'change', function (event) {
            uploader.start();
        }
    );
};