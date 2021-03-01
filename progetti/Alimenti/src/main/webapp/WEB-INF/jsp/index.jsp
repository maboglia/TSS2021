<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dettaglio prodotto</title>
</head>
<body>
	<h1>Scheda Prodotto Alimentare</h1>

<table>

<tr>
	<th>Prodotto</th>
	<th>Categoria</th>
	<th>Calorie</th>
	<th>Elimina</th>

</tr>

<c:forEach items="${prodotti}" var="prodotto">
	

	<tr>
		<td><a href="/web/prodotti/${prodotto.id}" title="Scheda dettaglio">${prodotto.prodotto}</a></td>
		<td>${prodotto.categoria}</td>
		<td>${prodotto.energia}</td>
		<td><a href="/web/delete/${prodotto.id}">Canc.</a></td>
	</tr>

</c:forEach>
	
</table>
</body>
</html>