<%@page import="java.util.ArrayList"%>
<%@page import="model.Libro"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Libreria</h1>

<% ArrayList<Libro> libri = (ArrayList<Libro>) request.getAttribute("libri"); %>

<ul>
<% for (Libro l : libri) {    %>

	<li><%= l %></li>

<% } %>
</ul>

</body>
</html>