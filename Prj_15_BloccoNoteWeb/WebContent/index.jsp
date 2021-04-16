<%@page import="controller.NoteController"%>
<%@page import="model.Nota"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Blocco Note</h1>
	
	<form method="post" action="?">
		<input type="text" name="nota" placeholder="scrivi nota">
		<input type="submit" value="aggiungi nota">
	</form>
	
	<%
	NoteController nc = null;
	
	if (session.getAttribute("blocconote") != null){
		//esiste quindi lo uso dierttamente
		nc = (NoteController) session.getAttribute("blocconote");
	} else {
		//non esiste, quindi lo creo e poi lo uso
		nc = new NoteController();
	}
	
		if(request.getParameter("nota")!=null && request.getParameter("nota").trim().length() > 0){
			String s = request.getParameter("nota");
			nc.aggiungi(s);
		} 
		
		if (request.getParameter("completa")!=null && request.getParameter("completa").equals("ok") ){
			int id = Integer.parseInt(request.getParameter("idNota"));
			nc.completa(id);
		}

		if (request.getParameter("delete")!=null && request.getParameter("delete").equals("ok") ){
			int id = Integer.parseInt(request.getParameter("idNota"));
			nc.delete(id);
		}		
		
		session.setAttribute("blocconote", nc);
		
	%>
	
	<ul>
		<%
			
		
		
		for(Nota n : nc.getLista()){
			String checked = (n.isCompleta()) ? "checked"	: "";
			out.print("<li>" 
				+"<input type='checkbox'" + checked + "  >" 
				+ n 
				+ " <a href='?completa=ok&idNota=" + n.getIdNota() + "'>completa</a>"
				+ " <a href='?delete=ok&idNota=" + n.getIdNota() + "'>elimina</a>"
				+ "</li>");
		}
		
		%>
	</ul>
	
	
</body>
</html>