<%@page import="model.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Elenco clienti</title>
</head>
<body>

<h1>Elenco clienti</h1>

<a href="addCliente.html">Aggiungi Cliente</a>
<a href="Clienti?azione=addConto">Aggiungi Conto</a>

<% List<Cliente> clienti = (List<Cliente>) request.getAttribute("clienti"); %>
<table>
<% for (Cliente c : clienti) { %>
	<tr><td><%= c.getNome() %></td></tr>
<% } %>
</table>


</body>
</html>