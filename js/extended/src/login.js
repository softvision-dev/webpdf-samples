/**
 * Login and create User token
 * @param username
 * @param password
 */
var login = function (username, password) {
    var loginUrl = config.baseURL + 'authentication/user/login';
    var log = $('#log');

    var header = {
        Authorization: 'Basic ' + btoa(username + ':' + password)
    };

    /**
     * keep old token active if set (also needed for relogin when the user is timed out)
     */
    if (config.token !== '') {
        header.Token = config.token;
    }

    $.ajax(
        {
            url: loginUrl,
            type: 'GET',
            headers: header,
            cache: false,
            success: function (result) {
                config.token = result.token;
                log.html('login successfull\n\n');
                log.append(JSON.stringify(result, null, '\t'));
                initUploader();
            },
            error: function (error) {
                log.html('login failed\n\n');
                log.append(JSON.stringify(error, null, '\t'));
            }
        }
    );
};