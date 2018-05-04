<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	label{
		width:120px;
		float:left;
	}
</style>
</head>
<body>
	<form action="bmi" method="post">
		<fieldset>
			<legend>비만도 테스트 결과</legend>
			<p>
				<label>이름</label> 
				<input type="text" name="name">
			</p>
			<p>
				<label>키</label> 
				<input type="text" name="height">
			</p>
			<p>
				<label>몸무게</label> 
				<input type="text" name="weight">
			</p>
			<p>
				<label>취미1</label> 
				<input type="text" name="hobbies">
			</p>
			<p>
				<label>취미2</label> 
				<input type="text" name="hobbies">
			</p>
			<p>
				<label>취미3</label> 
				<input type="text" name="hobbies">
			</p>
			<p>
				<input type="submit" value="결과">
			</p>
		</fieldset>
	</form>
</body>
</html>