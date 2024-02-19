function doLogin(){
    // 1. HTML에서 입력받은 값 가져오기
    let eid = document.querySelector("#eid").value;
    let epw = document.querySelector("#epw").value;

    // 2. 객체화
    let info= {
        eid : eid,
       epw : epw
    }
    // 3. 컨트롤에게 요청 / 응 답
    $.ajax({
        url : "/login",
        method:"post",
        data : info,
        success : function(result){
            console.log(result)
            if(result == true){
                console.log("로그인성공")
                sessionStorage.setItem('userId', eid);
                window.location = `/main.html`
            }
        }
    })
}