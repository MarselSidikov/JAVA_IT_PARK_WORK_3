function uploadFile(file) {
    var formData = new FormData();
    formData.append("file", file);

    $.ajax({
        type: "POST",
        url: "/files",
        data: formData,
        contentType: false,
        processData: false,
        success: function (data) {
            alert(data);
        },
        error: function (data) {
            alert(data.status);
        }
    })
}