<%@page import="java.util.ArrayList"%>
<%@page import="model.Forma"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>Lista stanze</h1>
<a href="addStanza.html">Aggiungi stanza</a>
<h2><%= request.getAttribute("area") %></h2>

<table>
<tr><th>Nome</th><th>Superficie</th></tr>
	<% ArrayList<Forma> stanze = (ArrayList<Forma>) request.getAttribute("stanze"); %>
	<% for (Forma f : stanze) { %>

		<tr><td><%= f.getNome() %></td><td><%= f.calcolaSuperficie() %></td></tr>
	
	<% } %>
</table>

</body>
</html>