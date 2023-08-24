<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
 if('${msg}')
	 alert('${msg}')
</script>
</head>
<body>
<h1>로그인 페이지 입니다.</h1>
	<div align="left">	
		<form:form action="${pageContext.request.contextPath}/login" method="post" modelAttribute="loginVO">
			id : <form:input path="id"/><form:errors path="id"/><br>	
			password: <form:input path="password"/><form:errors path="password"/> <br>
			<input type="submit" value="회원가입">
		</form:form>
	</div>
</body>
</html>