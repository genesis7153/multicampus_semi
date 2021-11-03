<%-- <%@page import="webapp.UserInfo"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<script>
	function gojoin(){
		//alert("안됨");
		location.href="join.jsp";
	} 
	function gologin(){
		location.href="login.jsp";
	}
	function gomypage(){
		location.href="/Practice1/show";
	}
</script>
	
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<%--<jsp:useBean id="userinfo" scope="session" class="webapp.UserInfo"/>  --%>
<% 
/* 	UserInfo userinfo = (UserInfo)session.getAttribute("userinfo"); */
%>

<body>

	<p style="background-color:silver;
	color:white; font-size:small; font-family:helvetica; height:20px;padding:10px;">
	<input type="button" value="1대1 Q&A" style="float: right" onClick="location='qna.jsp'">
	<input type="button" value="마이페이지" style="float: right" onClick="gomypage()">
	<!-- <input type="button" value="장바구니" style="float: right" onClick=""> -->
	<input type="button" value="회원가입" style="float: right" onClick="gojoin()"> <!-- name ="회원가입"-->
	<input type="button" value="로그인" style="float: right" onClick="gologin()">
	</p>

	<div style="background-color:skyblue;
	color:white; font-size: 2.5em; font-family:helvetica; height:60px;padding:10px;">
	ChoiceCAR</div>
	
	
	<%  
		if(/* userinfo!=null && userinfo.getId()!=null */true){ %>
			<span style="float:right;">
			<%-- <%=userinfo.getName() %> --%>
			<a style="color:white;" href="UserInfoLogOutServlet">로그아웃</a>
			
			</span>
		<% 
		}else{
			//response.sendRedirect("/webapp/auth/LogInForm.jsp");
		%>
		<a style="color:white;" href="/webapp/auth/LogInForm.jsp">로그인</a>
	<% }%>
	
	
</body>

</html>