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
	<form>
		<fieldset>
			<legend>학생 성적관리</legend>
			<p>
				<label>이름</label> 
				<input type="text" value="${info.name }">
			</p>
			<p>
				<label>학년</label> 
				<input type="text" value="${info.classGrade }">
			</p>
			<p>
				<label>수학점수</label> 
				<input type="text" value="${info.math }">
			</p>
			<p>
				<label>영어점수</label> 
				<input type="text" value="${info.eng }">
			</p>
			<p>
				<label>한국어점수</label> 
				<input type="text" value="${info.kor }">
			</p>
			<p>
				<label>내신등급</label> 
				<input type="text" value="${info.info }">
			</p>
			
		</fieldset>
	</form>
</body>
</html>