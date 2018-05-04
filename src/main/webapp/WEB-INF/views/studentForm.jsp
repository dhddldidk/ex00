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
	<form action="report" method="post">
		<fieldset>
			<legend>학생 성적관리</legend>
			<p>
				<label>이름</label> 
				<input type="text" name="name">
			</p>
			<p>
				<label>학년</label> 
				<input type="text" name="classGrade">
			</p>
			<p>
				<label>수학점수</label> 
				<input type="text" name="math">
			</p>
			<p>
				<label>영어점수</label> 
				<input type="text" name="eng">
			</p>
			<p>
				<label>한국어점수</label> 
				<input type="text" name="kor">
			</p>
			<p>
				<input type="submit" value="결과">
			</p>
		</fieldset>
	</form>
</body>
</html>