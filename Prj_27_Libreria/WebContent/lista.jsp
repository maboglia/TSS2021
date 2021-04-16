<%@page import="java.util.Map.Entry"%>
<%@page import="entities.Libro"%>
<%@page import="java.util.Map"%>
<%  Map<Integer, Libro> libri =   (Map<Integer, Libro>) request.getAttribute("elenco"); %>

<table class="table table-striped">
<% for ( Entry<Integer, Libro> libro : libri.entrySet() ){ %>

	<tr><td><%= libro.getValue().getTitolo() %></td></tr>

<% } %>
</table>