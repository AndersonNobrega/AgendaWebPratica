<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.ifpb.agenda.model.Contato" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/" var="servletHome"/>
<c:url value="/agenda" var="servletAgenda"/>
<c:url value="/agenda/contatos/remover" var="servletRemoverContatos"/>
<c:url value="/agenda/contatos/atualizar" var="servletAtualizarContatos"/>

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
	
	<c:if test="${not empty contato}">
		<p><b>Contato ${contato} cadastrado(a) com sucesso.</b></p>
	</c:if>
	
	<h2>Lista de Contatos:</h2>
	<ul>
		<c:forEach items="${agenda}" var="contato">
			<li>ID: ${contato.id} - Nome: ${contato.nome} - Telefone: ${contato.telefone} - Data de Cadastro: <fmt:formatDate 
			value="${contato.dataCadastro}" 
			pattern="dd/MM/yyyy"/> <a href="${servletAtualizarContatos}">Atualizar</a> | <a href="${servletRemoverContatos}">Remover</a></li>		
			
		</c:forEach>
	</ul>
</body>
</html>