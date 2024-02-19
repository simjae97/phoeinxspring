function doRegister() {
    console.log("회원가입");
    // 1. HTML에서 입력받은 값 가져오기
    let ename = document.querySelector("#ename").value;
    let ephone = document.querySelector("#ephone").value;
    let eemail = document.querySelector("#eemail").value;
    let eid = document.querySelector("#eid").value;
    let epw = document.querySelector("#epw").value;

    // 2. 객체화
    let info = {
       ename: ename,
       ephone: ephone,
       eemail: eemail,
       eid: eid,
       epw: epw
    }

    // 3. 컨트롤에게 요청 / 응 답
    $.ajax({
        url: "/register",
        method: "post",
        data: info,
        success: function(response) {
            if (response === 0) {
                alert("회원가입이 성공적으로 완료되었습니다.");
                window.location = `/index.html`
                // 여기에 페이지 리디렉션 등 추가 작업을 할 수 있음
            } else {
                alert("회원가입에 실패했습니다. 오류: " + response);
            }
        }
    });
}