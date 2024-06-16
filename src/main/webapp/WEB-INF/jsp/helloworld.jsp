<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP with UTF-8 Encoding</title>
</head>
<body>

<h1>${welcomeMessage}</h1>
<%--spring message connot make multilanguage--%>
<h2><spring:message  code="welcome.name" /></h2>


<br>
<input type="button" value="alert" onclick="alertMessage()">

<br>
<a href="http://localhost:8080/th/helloworld">ภาษาไทย</a>
<a href="http://localhost:8080/en/helloworld">English</a>

<script type="text/javascript"><%@include file="helloworld.js" %></script>
</body>
</html>