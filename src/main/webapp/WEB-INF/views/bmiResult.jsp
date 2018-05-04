<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<input type="text" value="${myinfo.name }">
			</p>
			<p>
				<label>키</label> 
				<input type="text" value="${myinfo.height }">
			</p>
			<p>
				<label>몸무게</label> 
				<input type="text" value="${myinfo.weight }">
			</p>
			
			
			<c:forEach var="hobby" items="${myinfo.hobbies }">
				<p>
				<label>취미</label> 
				<input type="text" value="${hobby }">
			</p>
			
			</c:forEach>
			<p>
				<label>비만도</label> 
				<input type="text" value="${myinfo.printInfo }">
			</p>
		</fieldset>
	</form>
</body>
</html>