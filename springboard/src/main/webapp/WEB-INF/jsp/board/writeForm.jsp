<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.error{
		color : red;
	}
	
</style>
</head>
<body>
<h1>게시판입니다.</h1>
	<a href="${pageContext.request.contextPath }"><img src="https://autoimg.danawa.com/photo/4069/model_200.png"></a>	
	<a href="${pageContext.request.contextPath}/board">게시판</a><br/>
	<a href="${pageContext.request.contextPath}/board/new"> 새글쓰기 </a><br/>
	
	<c:if test = "${empty currentUser }">
		<a href="${pageContext.request.contextPath}/login"> 로그인 </a><br/>
	</c:if>
	<c:if test = "${not empty currentUser }">
		${currentUser.name }님 안녕하세요.
		<a href="${pageContext.request.contextPath}/logout"> 로그아웃 </a><br/>
	</c:if>
	<a href="${pageContext.request.contextPath}/register">회원가입 </a>
새 글입니다.

	<div>
		<form:form action="${pageContext.request.contextPath }/board/new" method="post" modelAttribute="boardVO">
			<table>
				<tr>
					<th>제목</th>
					<td><form:input path="title"/></td>
					<td><form:errors path="title" class="error"/></td>
				</tr>
				<tr>
					<th>글쓴이</th>
					<td><form:input path="writer"/></td>
					<td><form:errors path="writer" class="error"/></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><form:input path="content"/></td>
					<td><form:errors path="content" class="error"/></td>
				</tr>
			</table>
			<input type="submit" value="글쓰기">
		</form:form>
	</div>

</body>
</html>