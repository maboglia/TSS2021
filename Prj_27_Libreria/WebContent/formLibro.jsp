<%@page import="java.util.Map.Entry"%>
<%@page import="entities.Editore"%>
<%@page import="java.util.Map"%>
<form method="post" action="libri" class="row g-3">
  <div class="col-auto">
    <label for="titolo" class="form-label">titolo</label>
    <input type="text" name="titolo" class="form-control" id="titolo">
  </div>
  <div class="col-auto">
    <label for="pagine" class="form-label">pagine</label>
    <input type="text" name="pagine" class="form-control" id="pagine">
  </div>
  <div class="col-auto">
    <label for="prezzo" class="form-label">prezzo</label>
    <input type="text" name="prezzo" class="form-control" id="prezzo">
  </div>
  <div class="col-auto">
    <label for="editore" class="form-label">editore</label>
    <select name="editore">
    	<% Map<Integer, Editore> editori = (Map<Integer, Editore>) request.getAttribute("editori"); %>
    	<% for (Entry<Integer, Editore> ed : editori.entrySet()) { %>
    		<option value="<%= ed.getValue().getId() %>"><%= ed.getValue().getNome() %></option>
    	<% } %>
    
    </select>
<!--     <input type="text" name="editore" class="form-control" id="editore"> -->
  </div>
  <div class="col-auto">
    <button type="submit" class="btn btn-primary mb-3">Aggiungi libro</button>
  </div>
</form>