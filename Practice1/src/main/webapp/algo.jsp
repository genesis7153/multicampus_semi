<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>초이스카 알고리즘</title>
</head>
<body>
<a>초이스카 알고리즘 페이지</a>
<button type="submit" onClick="location='main.jsp'" style="float: right">뒤로가기</button>
<br>
<hr>
	<form method="get" action="Algorithm">
	
	<a>
		<font size="5em">- 차종을 선택하세요 -</font><br><br>
		<input type="radio" name="style" value="sedan" checked="checked">세단
		<input type="radio" name="style" value="suv">SUV
		<input type="radio" name="style" value="hatch">해치백
		<input type="radio" name="style" value="wagon">왜건
		<input type="radio" name="style" value="rv">RV
		<input type="radio" name="style" value="coupe">쿠페
		<input type="radio" name="style" value="business">상용
		<br><br>
	</a><a>	
		<font size="5em">- 엔진/연료 타입을 선택하세요 -</font><br><br>
		<input type="radio" name="engine_type" value="gasoline" checked="checked">가솔린
		<input type="radio" name="engine_type" value="gasoline_turbo">가솔린 터보
		<input type="radio" name="engine_type" value="disel">디젤
		<input type="radio" name="engine_type" value="lpg">LPG
		<input type="radio" name="engine_type" value="hybrid">하이브리드
		<input type="radio" name="engine_type" value="ev">EV
		<br><br>
	</a><a>
		<font size="5em">- 변속기를 선택하세요 -</font><br><br>
		<input type="radio" name="transmission" value="auto" checked="checked">자동변속기
		<input type="radio" name="transmission" value="dct">DCT
		<input type="radio" name="transmission" value="manual">수동변속기
		<input type="radio" name="transmission" value="cvt">CVT
		<br><br>
	</a><a>
		<font size="5em">- 선호 옵션을 선택하세요 -</font><br><br>
		<input type="checkbox" name="option" value="display">디스플레이 계기판
		<input type="checkbox" name="option" value="4wd">사륜구동
		<input type="checkbox" name="option" value="sunroof">파노라마 썬루프
		<input type="checkbox" name="option" value="sbw">전자식 변속기
		<input type="checkbox" name="option" value="hud">헤드업 디스플레이
		<input type="checkbox" name="option" value="autopilot">반자율주행
		<br><br>
	</a>
		<input type="submit" value="확인" >
	</form>
</body>
</html>