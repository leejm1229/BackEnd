<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
게시판 상세페이지
	<div align="center">
		<table border = "1" width = "60%">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>지은이</th>
				<th>내용</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			<tr>
				<td>${boardVO.no}</td>
				<td>${boardVO.title}</td>
				<td>${boardVO.writer}</td>
				<td>${boardVO.content}</td>
				<td>${boardVO.regDate}</td>
				<td>${boardVO.count}</td>
			</tr>
		</table>
	</div>
</body>
</html>