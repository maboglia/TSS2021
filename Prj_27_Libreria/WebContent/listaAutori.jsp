<%@page import="entities.Autore"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="entities.Libro"%>
<%@page import="java.util.Map"%>
<%  Map<Integer, Autore> autori =   (Map<Integer, Autore>) request.getAttribute("elenco"); %>

<table class="table table-striped">
<% for ( Entry<Integer, Autore> autore : autori.entrySet() ){ %>

	<tr>
		<td class="col-3"><%= autore.getValue().getNome() %></td>
		<td class="col-4"><%= autore.getValue().getCognome() %></td>
	</tr>

<% } %>
</table>