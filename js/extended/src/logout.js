/**
 * Logout current user
 */
var logout = function () {
    var logoutUrl = config.baseURL + 'authentication/user/logout';
    var log = $('#log');

    if (config.token === '') {
        log.html('Already logged out\n');
        return;
    }

    $.ajax(
        {
            url: logoutUrl,
            type: 'GET',
            headers: {
                Token: config.token
            },
            cache: false,
            success: function (result) {
                config.token = '';
                $('#uploader').html('');
                $('#filelist').html('');
                log.html('logout successfull\n\n');
                log.append(JSON.stringify(result, null, '\t'));
            },
            error: function (error) {
                log.html('logout failed\n\n');
                log.append(JSON.stringify(error, null, '\t'));
            }
        }
    );
};