$(function () {
    var baseURL = 'http://localhost:8080/webPDF/rest/';
    var log = $('#log');
    var document;
    var token;

    /**
     * Login with default admin credentials
     */
    var login = function () {
        var loginUrl = baseURL + 'authentication/user/login';
        var username = 'admin';
        var password = 'admin';

        $.ajax(
            {
                url: loginUrl,
                type: 'GET',
                headers: {
                    Authorization:  'Basic ' + btoa(username + ':' + password)
                },
                cache: false,
                success: function (result) {
                    token = result.token;
                    log.append('login successfull');
                    initUploader();
                },
                error: function () {
                    log.append('login failed');
                }
            }
        );
    };

    /**
     * Initialize plupload file uploader
     */
    var initUploader = function () {
        var uploadUrl = baseURL + 'documents';

        var uploader = new plupload.Uploader(
            {
                browse_button: 'uploader',
                url: uploadUrl,
                headers: {
                    Token: token
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
                document = JSON.parse(response.response);
                log.append('<br>upload successfull');
                convert();
            }
        );

        uploader.bind(
            'Error',
            function () {
                log.append('<br>upload failed');
            }
        );

        $('#uploader').on(
            'change', function (event) {
                uploader.start();
            }
        );
    };

    /**
     * convert the uploaded file to PDF
     */
    var convert = function () {
        var converterUrl = baseURL + 'converter/' + document.documentId;
        var downloadUrl = baseURL + 'documents/' + document.documentId + '?Token=' + token;

        /**
         * The options used for the conversion
         * @type {string}
         */
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
                    Token: token
                },
                data: options,
                cache: false,
                dataType: 'json',
                processData: false,
                contentType: 'application/json',
                success: function () {
                    log.append('<br>conversion successfull');
                    log.append('<br><a href="' + downloadUrl + '">Result</a>');
                },
                error: function () {
                    log.append('<br>conversion failed');
                }
            }
        );
    };

    login();
});