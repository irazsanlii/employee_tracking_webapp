function checkEmail(email) {
    return (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email));
}

function checkValidation(login) {

    let errorMessage = new Array () ;

    if (login.email === "" ) {
        errorMessage.push("E-posta adresi giriniz.");
    }
    if (!checkEmail(login.email)) {
        errorMessage.push("Geçerli bir e-posta adresi giriniz.");
    }

    if (login.password === "" ) {
        errorMessage.push("Parolanızı giriniz.");
    }

    return errorMessage;
}; //end of validator

$(document).ready(function() {
    $("#send").click(function(event) {
        event.preventDefault();

        var login = {
            email: $('#email').val(),
            password: $('#password').val(),
        };  // object definition

        var validation = checkValidation(login);

        var errors = "" ;

        if (validation) {
            for(var i = 0; i < validation.length; i++) {
                errors +=
                    "<div class='invalid mb1'>" +
                        "<i class='fa fa-times-circle fa-lg icons' style='color:#E37780;'></i>" + "<div>" + validation[i] + "</div>" +
                    "</div>";
            }
            document.getElementById('inputErrors').innerHTML = errors;
            document.getElementById('inputErrors').setAttribute("style","display: block");
        } // input validation errors

        $.ajax({
            url: "http://localhost:8080/api/v1/admin/create/user",
            type: 'POST',
            data: JSON.stringify(login),
            contentType: "application/json",
            dataType: 'json',
            success: function (data) {
                document.getElementById('ok').setAttribute("style","display: block");
            }
        }); // end of ajax call
    });
});
