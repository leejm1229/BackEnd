<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
새 글입니다.

	<div>
		<form:form action="${pageContext.request.contextPath }/board/new" method="post" modelAttribute="boardVO">
			<table>
				<tr>
					<th>제목</th>
					<td><form:input path="title"/></td>
				</tr>
				<tr>
					<th>글쓴이</th>
					<td><form:input path="writer"/></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><form:input path="content"/></td>
				</tr>
			</table>
			<input type="submit" value="글쓰기">
		</form:form>
	</div>

</body>
</html>