<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>한글임</h1>
<!-- http://localhost:8080/springmvc/hello/hello  -->
<a href ="<%= request.getContextPath()%>/hello/hello">hello.jsp로 갈래용~?</a>
<a href="${pageContext.request.contextPath}/hello/hello">el버전 hello.jsp로 갈래용~?</a>

<a href="${pageContext.request.contextPath}/method/method">el버전 methodForm.jsp로 갈래용~?</a>

<a href="${pageContext.request.contextPath}/member/joinform">회원가입 하러 갈래용~?</a>
<a href="${pageContext.request.contextPath}/stringresponse">스트링</a>
<a href="${pageContext.request.contextPath}/voresponse">memberVOresponseBody</a>
</body>
</html>