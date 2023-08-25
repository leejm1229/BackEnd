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
전체 게시판입니다.<br/>

	<div align="center">
		<table border = "1">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>지은이</th>
				<th>내용</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			<c:forEach items="${boardlist}" var="board" varStatus="loop">
				<tr>
				<td>${board.no}</td>
				<td>
					<a href="${pageContext.request.contextPath}/board/${board.no}">
						${board.title}
					</a>
				</td>
				<td>${board.writer}</td>
				<td>${board.content}</td>
				<td>${board.regDate}</td>
				<td>${board.count}</td>
			</tr>
			</c:forEach>
			
		</table>
	</div>

</body>
</html>