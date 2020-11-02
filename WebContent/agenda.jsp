<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/agenda/contatos" var="servletContatos"/>
<c:url value="/" var="servletHome"/>
<c:url value="/agenda/contatos/remover" var="servletRemoverContatos"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda</title>
</head>
<body>
	<ul>
		<li><a href="${servletHome}">Home</a></li>
	</ul>
	
	<h2>Sua agenda</h2>
	<ul>
		<li><a href="${servletContatos}">Listar Contatos</a></li>
		<li><a href="contatoFormulario.jsp">Adicionar Contato</a></li>
    	<li><a href="${servletRemoverContatos}">Remover Contato</a></li>
	</ul>
</body>
</html>