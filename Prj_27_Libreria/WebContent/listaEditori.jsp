<%@page import="entities.Editore"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="entities.Libro"%>
<%@page import="java.util.Map"%>
<%  Map<Integer, Editore> editori =   (Map<Integer, Editore>) request.getAttribute("elenco"); %>

<table class="table table-striped">
<% for ( Entry<Integer, Editore> editore : editori.entrySet() ){ %>

	<tr><td><%= editore.getValue().getNome() %></td></tr>

<% } %>
</table>