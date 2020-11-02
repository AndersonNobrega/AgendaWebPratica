<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/agenda/contatos/atualizar" var="servletAtualizarContatos"/>
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
	
	<form action="${servletAtualizarContatos}" method="POST">
		<b>Nome:</b> <input type="text" name="nome" />
		<b>Telefone:</b> <input type="text" name="telefone" />
		<input type="submit" />
	</form>

</body>
</html>