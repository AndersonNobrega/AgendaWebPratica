<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/" var="servletHome"/>
<c:url value="/agenda" var="servletAgenda"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda</title>
</head>
<body>
	<ul>
		<li><a href="${servletHome}">Home</a></li>
		<li><a href="${servletAgenda}">Agenda</a></li>
	</ul>
	
	<c:if test="${resultado}">
		<h2>Contato removido com sucesso.</h2>
	</c:if>

	<c:if test="${not resultado}">
		<h2>Contato não removido, algo inesperado aconteceu.</h2>
	</c:if>
</body>
</html>