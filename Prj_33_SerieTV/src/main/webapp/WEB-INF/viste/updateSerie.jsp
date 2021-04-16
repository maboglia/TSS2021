<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add serie</title>
</head>
<body>

<h1>Aggiungi serie</h1>

<form method="post" action="/api/serie">

	<input type="hidden" name="id" value="${serie.id}">
	<input type="text" name="name" value="${serie.name}">
	<input type="text" name="image" value="${serie.image}">
	<input type="text" name="rating" value="${serie.rating}">
	
	<select name="idGenere" id="idGenere">
		<option value="${serie.idGenere.id}">${serie.idGenere.name}</option>
	</select>
	
	<input type="submit" value="modifica">

</form>

<div id="scheda"></div>

<script src="/script2.js"></script>


</body>
</html>