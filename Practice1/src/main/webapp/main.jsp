<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
.lst_type{overflow:hidden;width:80%;padding:0 10px 10px; margin:0 auto}
.lst_type li{overflow:hidden;clear:both;margin:10px 0 0;color:#2d2c2d;
font-family:'돋움',Dotum;font-size:12px;line-height:100px;
list-style:none ; border-bottom: 2px solid lightgray;position:relative; }
.lst_type li img{display:inline;float:left;position:absolute; }
.lst_type li a{color:#2d2c2d;text-decoration:none; margin-left:340px}
.lst_type li a:hover{text-decoration:underline}
.lst_type li span{color:blue; margin-left:330px;font-family:'돋움',Dotum;font-size:14px;  }
</style>
<title>안녕하세요 초이스카입니다.</title>
<%@ include file="header.jsp" %>
</head>
<body>

<br><font size="5em" color="blue" style="float: center ;text-align:center;">당신이 찾는 자동차 검색하러 가기 -></font>
<div>
<p><%@ include file ='/image_jsp/g80_image.jsp' %>


<!-- <input type="button" value="GO!" style='width:80px;float: right;'  onClick="gologin()"> -->
<style>
.button {
  background-color: blue; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: -50px 990px;
  cursor: pointer;
}
.button1 {width: 250px;}
</style>
<button class="button button1" onClick="location='algo.jsp'">GOGO!</button><br>

</p>
</div>
	
	
	
</body>
<div>
<br>
<%@ include file="footer.jsp" %>
</div>

</html>