<% final String TITOLO = "Agenda settimanale"; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= TITOLO %></title>
<style type="text/css">
	.colonna {border: 1px solid red;margin-right:3px;float:left;width:12%;}
	.impegno {font-size:0.8em; border: 1px solid green;margin:2px;padding:3px;background-color: orange;}
	nav a { border:1px solid red; padding: 2px; margin: 2px; }
</style>
</head>
<body>
<nav>
	<a href="index.jsp">agenda settimanale</a> 
	<a href="addImpegno.jsp">aggiungi impegno</a> 
</nav>

<div class="container">
<!-- qui inizia il contenuto -->