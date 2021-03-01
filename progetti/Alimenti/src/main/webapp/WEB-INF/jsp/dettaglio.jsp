<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dettaglio prodotto</title>
</head>
<body>
	<h1>Scheda Prodotto Alimentare</h1>
	
	<h2>${prodotto.prodotto}</h2>
	
	<ul>
		<li>Cat: ${prodotto.categoria}</li>
		<li>Lip: ${prodotto.lipidi}</li>
		<li>Prot: ${prodotto.proteine}</li>
		<li>Car: ${prodotto.carboidrati}</li>
		<li>Cal: ${prodotto.energia}</li>
	</ul>
	
	<div><a class="btn btn-primary" href="/web/prodotti">Torna all'elenco</a></div>
	
</body>
</html>