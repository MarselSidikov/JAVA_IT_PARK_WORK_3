function getUser() {
    $.ajax({
        dataType: "json",
        url: 'http://localhost/all/users/8',
        success: function (response) {
            $('#namesPlace').html(
                '<h1>' + response['name'] + '</h1><br>' +
                '<h1>' + response['surname'] + '</h1>');
        }
    });
}