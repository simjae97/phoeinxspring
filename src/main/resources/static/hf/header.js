let userId = sessionStorage.getItem('userId');

window.onload = doGet();


function doGet(){
    let nowlogin =document.querySelector('#nowlogin')
    let html = ""
    html += `현재 로그인중인 유저 : ${userId} <button type= "button" onclick = "logout()"> 로그아웃</button>`
    console.log(html)
    console.log(nowlogin)
    nowlogin.innerHTML =html;
}

function logout(){
   sessionStorage.removeItem("userId")
   window.location = `/index.html`
}