<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="listProduct" items="${list }">
		상품 이름 : ${listProduct.name }<br>
		상품 가격 : ${listProduct.price }<br>
	</c:forEach>
	
</body>
</html>