<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 

@WebServlet("/join")
<html lang="ko"> 
<head> 
<meta charset="UTF-8"> 
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
<title>초이스카 회원가입</title> 
<style> * { box-sizing: border-box; } 
body { margin: 0; padding: 0; color: #ffffff; font-size: 15px; } 
input, textarea, button { color: #ffffff; font-size: 15px; } 
input:focus, textarea:focus, button:focus { outline: none; } 
textarea { resize: none; } h3 { margin: 0 0 12px 0; font-size: 45px; text-align: center; text-transform: uppercase; } 
p { padding: 0 10px; margin: 0 0 55px 0; text-align: center; line-height: 1.8; } 
.wrapper { min-height: 100vh; display: flex; align-items: center; } 
.form-container { max-width: 767px; margin: auto; padding: 70px 100px 80px; border: 10px solid #95c6db; background: #39459b; box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.2); } 
.form-group { position: relative; display: block; margin-bottom: 48px; } 
.form-group span { position: absolute; top: 11px; color: #04a5db; font-size: 15px; cursor: text; transition: all 0.2s ease; transform-origin: 0 0; } 
.form-group span.border { position: absolute; left: 0; top: 41px; width: 100%; height: 2px; display: block; background: #ffffff; transform: scaleX(0); transition: all 0.15s ease; } 
.form-control { width: 100%; height: 43px; display: block; font-size: 15px; border: none; border-bottom: 2px solid #04a5db; background: none; } 
.form-control:focus, .form-control:valid { border-bottom: 2px solid #ffffff; } 
.form-control:focus + span, .form-control:valid + span { transform: translateY(-22px) scale(0.8); } 
.form-control:focus + span + .border, .form-control:valid + span + .border { transform: scaleX(1); } 
textarea.form-control { padding: 13px 1px; } button[type="submit"] { width: 162px; height: 51px; display: flex; align-items: center; justify-content: center; margin: 60px auto 0; padding: 0; color: #ffffff; border: 2px solid #ffffff; border-radius: 4px; background-color: #39459b; cursor: pointer; text-transform: uppercase; transition: background-color 0.2s linear; } 
button[type="submit"]:hover { background-color: #299cd1; } 
@media(max-width:767px) { h3 { font-size: 38px } 
p { padding: 0; font-size: 14px; } 
.wrapper { background: #39459b; border: 10px solid #95c6db; } 
.form-container { width: 100%; padding: 24px; border: none; box-shadow: none; } } 
</style> 
</head> 
<body> 
<script>
	function fn_sendMember(){
		var frmMember = document.frmMember;
		asdf;
		ffewjj
	}
</script>
<div class="wrapper"> 
<div class="form-container"> 

<form name="frmJoin" method="post" action="main.jsp"  encType="UTF-8"><h3>이런!</h3> 
<p>Q&A 기능은 준비중입니다.</p> 
 


<button type="submit" onClick="location='main.jsp'" >홈으로</button>
<input type="hidden" name="command" value="addMember"/>
<script>
	function nowjoin(){
		alert("아이디 생성 완료. 다시 로그인 해주세요")
		location.href="main.jsp";
	}
</script>
</form>
</div> 
</div> 
</body> 
</html>
