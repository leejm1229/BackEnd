<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.error {
    color: red;
}
</style>
</head>
<body>
<h1>회원가입 페이지</h1>
	<form:form action="${pageContext.request.contextPath}/register" method="post" modelAttribute="memberVO">
			이름 : 
			<form:input path="name" /> <form:errors path="name"/> <br>
			ID : 
			<form:input path="id" /> <form:errors path="id"/> <br>
			PW :
			<form:input path="password" /> <form:errors path="password"/> <br>
			주소 :
			<form:input path="addr" /> <form:errors path="addr"/> <br>
			
			<input type="submit" value = "회원가입"> 
	</form:form>
</body>
</html>