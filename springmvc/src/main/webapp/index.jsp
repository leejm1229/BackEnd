<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>�ѱ���</h1>
<!-- http://localhost:8080/springmvc/hello/hello  -->
<a href ="<%= request.getContextPath()%>/hello/hello">hello.jsp�� ������~?</a>
<a href="${pageContext.request.contextPath}/hello/hello">el���� hello.jsp�� ������~?</a>

<a href="${pageContext.request.contextPath}/method/method">el���� methodForm.jsp�� ������~?</a>

<a href="${pageContext.request.contextPath}/member/joinform">ȸ������ �Ϸ� ������~?</a>
<a href="${pageContext.request.contextPath}/stringresponse">��Ʈ��</a>
<a href="${pageContext.request.contextPath}/voresponse">memberVOresponseBody</a>
</body>
</html>