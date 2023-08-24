<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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