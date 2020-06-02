$(function () {
    var contentFrame = $('#hmcontent');

    contentFrame.load(function () {
        window.history.replaceState("", "", contentFrame.contents()[0].URL);
    });
});