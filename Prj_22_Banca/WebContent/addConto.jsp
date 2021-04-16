<!DOCTYPE html>
<%@page import="model.Cliente"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Aggiungi conto</title>
</head>
<body>
<h1>Aggiungi conto</h1>

<a href="Conti">Elenco Conti</a>

<% List<Cliente> clienti = (List<Cliente>) request.getAttribute("clienti"); %>

	<form method="post" action="Conti">
	<select name="cliente">
		<% for (Cliente c : clienti) { %>
			<option><%= c.getNome() %></option>
		<% } %>
	
	</select>	
		
		<input type="submit" value="Aggiungi conto">
	</form>
</body>
</html>