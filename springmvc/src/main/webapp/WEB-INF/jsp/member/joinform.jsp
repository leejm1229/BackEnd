<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원가입 페이지 입니다.
	<form action="${pageContext.request.contextPath}/member/join" method = "post">
		ID : <input type = "text" name = "id">
		PW : <input type = "text" name = "password">
		<input type = "submit" value = "회원가입">
	</form>
</body>
</html>