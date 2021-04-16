<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VideoGiochi</title>

<link rel="stylesheet" href="css/style.css">
</head>
<body>
<h1>VideoGiochi</h1>
<p>Il mio sito web di videogiochi</p>




<%

	if (request.getParameter("nome") != null &&  request.getParameter("password") != null){
	String nome = request.getParameter("nome");		
	String passw = request.getParameter("password");		
	
		if (nome.equals("mauro") && passw.equals("12345")){
			out.print("Benvenuto utente " + nome);
			%>
			
			<%@ include file="riservata.jsp" %>	
			
			<%			
			
		} else {
			out.print("Non puoi entrare!");
		}
	} else {

		%>
		
		<%@ include file="login.html" %>	
		
		<%
		out.print("inserisci user e pw per entrare");
	}
	

%>
<script src="js/script.js"></script>
</body>
</html>