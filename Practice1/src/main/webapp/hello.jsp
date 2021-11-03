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
</head>

<body>
<%@ include file="header.jsp" %>
	<!-- <h1>hello</h1>
	<h1>JSP 실습</h1> -->
	
	<ul class="lst_type">
    <li>
      <span  style='margin-left:50px' >이미지 </span>
      <span >상품 이름</span>
      <span >선택하기</span>
    </li>

<li>
      <a href='#' style='margin-left:50px'  >
<img src='image/w-05.jpg' width='90' height='90' alt='' /></a>
      <a href='#' ><strong>발이 너무나 편한 레드포인트 운동화 </strong></a>
      <a href='#' > <input  name='chk<%=1 %>' type='checkbox'  /></a>
</li>

<li>
      <a href='#' style='margin-left:50px'  >
<img src='image/w1.jpg' width='90' height='90' alt='' /></a>
      <a href='#' ><strong>매력만점 뾰족스타일 힐 </strong></a>
      <a href='#' > <input  name='chk<%=2 %>' type='checkbox'  /></a>
</li>

<li>
      <a href='#' style='margin-left:50px'  >
<img src='image/w11.jpg' width='90' height='90' alt='' /></a>
      <a href='#' ><strong>안 신은 것 같이 편한 플립플롭 </strong></a>
      <a href='#' > <input  name='chk<%=3 %>' type='checkbox'  /></a>
</li>

<li>
      <a href='#' style='margin-left:50px'  >
<img src='image/w22.jpg' width='90' height='90' alt='' /></a>
      <a href='#' ><strong>내가 파티 주인공! 롱 부츠</strong></a>
      <a href='#' > <input  name='chk<%=4 %>' type='checkbox'  /></a>
</li>

<li>
      <a href='#' style='margin-left:50px'  >
<img src='image/w3.jpg' width='90' height='90' alt='' /></a>
      <a href='#' ><strong>숨겨진 키 7cm를 찾아라! 여름용 샌들 </strong></a>
      <a href='#' > <input  name='chk<%=5 %>' type='checkbox'  /></a>
</li>

<li>
      <a href='#' style='margin-left:50px'  >
<img src='image/w5.jpg' width='90' height='90' alt='' /></a>
      <a href='#' ><strong>키높이는 기본, 화려한 컬러가 돋보이는 여름용 샌들 </strong></a>
      <a href='#' > <input  name='chk<%=6 %>' type='checkbox'  /></a>
</li>

</ul>
</body>
<%@ include file="footer.jsp" %>
</html>