<%@page import="java.util.Set"%>
<%@page import="model.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Elenco conti</title>
</head>
<body>

<h1>Elenco conti</h1>

<a href="addCliente.html">Aggiungi Cliente</a>
<a href="Clienti?azione=addConto">Aggiungi Conto</a>

<% Set<Conto> conti = (Set<Conto>) request.getAttribute("conti"); %>
<table>
<% for (Conto c : conti) { %>
	<tr><td><%= c.getNumero() %></td><td><%= c.getTitolare().getNome() %></td></tr>
<% } %>
</table>


</body>
</html>