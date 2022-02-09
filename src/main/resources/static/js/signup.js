$(function () {
    fn_init();
});

function fn_init() {
    $('#signUpBtn').click(function () {
        save();
    });
}

function save() {
    let data = {
        id: $('#id').val(),
        password: $('#password').val(),
        userName: $('#name').val()
    };
    $.ajax({
        type:"POST",
        contentType:"application/json",
        url:"/signUp",
        data:JSON.stringify(data),
        success : function (result) {
            alert("회원가입이 완료되었습니다.");
        },
        error : function () {
            console.log("회원가입 실패!!", result.errMessage);
        }
    })
}