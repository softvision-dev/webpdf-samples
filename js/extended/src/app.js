var config = {
    baseURL: 'http://localhost:8080/webPDF/rest/',
    token: ''
};

/**
 * Get all files as Array
 */
var refreshFiles = function () {
    var filelistUrl = config.baseURL + 'documents/list';
    var filelist = $('#filelist');

    $.ajax(
        {
            url: filelistUrl,
            type: 'GET',
            headers: {
                Token: config.token
            },
            cache: false,
            success: function (documents) {
                filelist.html('');

                for (var i = 0; i < documents.length; i++) {
                    addFile(documents[i]);
                }
            }
        }
    );
};

/**
 * Add a file to the file list
 * @param document
 */
var addFile = function (document) {
    var downloadUrl = config.baseURL + 'documents/' + document.documentId + '?Token=' + config.token;
    var filelist = $('#filelist');

    var element =
        '<tr id="' + document.documentId + '">' +
        '   <td><a href="' + downloadUrl + '" target="_blank">' + document.fileName + '.' + document.fileExtension + '</a></td>' +
        '   <td>';

    if (document.fileTypeGroups.indexOf('PDF') !== -1) {
        element +=
            '       <button type="button" class="barcode">Add barcode</button>' +
            '       <button type="button" class="rotate">Rotate</button>' +
            '       <button type="button" class="pdfa">Convert to PDF/A</button>';
    }
    else {
        element +=
            '       <button type="button" class="convert">Convert to PDF</button>';
    }

    element +=
        '       <button type="button" class="delete">Delete</button>';

    element +=
        '   </td>' +
        '</tr>';

    filelist.append(element);
    var file = $('#' + document.documentId);

    file.find('.convert').click(function () {
        convert(document.documentId);
    });

    file.find('.barcode').click(function () {
        barcode(document.documentId);
    });

    file.find('.pdfa').click(function () {
        pdfa(document.documentId);
    });

    file.find('.delete').click(function () {
        deleteFile(document.documentId)
    });

    file.find('.rotate').click(function () {
        rotate(document.documentId)
    });
};

$(function () {
    $('#login').click(function () {
        var username = $('#username').val();
        var password = $('#password').val();

        login(username, password);
    });

    $('#logout').click(function () {
        logout();
    });

    $('#setUrl').click(function () {
        config.baseURL = $('#serverUrl').val();
        $('#log').html('server url set');
    });
});