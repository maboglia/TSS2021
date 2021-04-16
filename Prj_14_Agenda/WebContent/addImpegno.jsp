<%@ include file="header.jsp" %>

	<form method="post" action="doInserisci.jsp">

		<select name="giorno" id="">
			<option value="0">Lunedì</option>
			<option value="1">Martedì</option>
			<option value="2">Mercoledì</option>
			<option value="3">Giovedì</option>
			<option value="4">Venerdì</option>
			<option value="5">Sabato</option>
			<option value="6">Domenica</option>
		</select>
		<select name="ora" id="">
			<option value="0">8</option>
			<option value="1">9</option>
			<option value="2">10</option>
			<option value="3">11</option>
			<option value="4">12</option>
			<option value="5">13</option>
			<option value="6">14</option>
			<option value="7">15</option>
			<option value="8">16</option>
			<option value="9">17</option>
			<option value="10">18</option>
		</select>
		<input type="text" name="impegno" placeholder="impegno">
		<input type="submit" value="Aggiungi">
	</form>

<%@ include file="footer.html" %>