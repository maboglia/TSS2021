<%@page import="model.Babbo"%>
<%@page import="controller.BabbiCtrl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Babbo natale</title>
</head>
<body>

<h1>Hello babbo</h1>

<a href="?azione=listaBabbi">lista babbi</a>
<a href="?azione=aggiungiBabbo">add babbo</a>

<%
BabbiCtrl bc = null;
if (session.getAttribute("babbi")!=null){
	bc = (BabbiCtrl) session.getAttribute("babbi");
} else {
	bc = new BabbiCtrl();
	
}

	if (request.getParameter("azione")!=null){
			
				
			if(request.getParameter("nome")!=null){
				bc.addBabbo(request.getParameter("nome"));
				session.setAttribute("babbi", bc);
			}
			
		if (request.getParameter("azione").equals("listaBabbi"))
		{
			
			out.print("<table>");
			for (Babbo b : bc.getBabbi()){
			//accedere a AL babbi e stampare contenuto
			%>
			
			<tr><td><%= b.getNome() %></td></tr>
			
			<%
			}
			out.print("</table>");
		
		} else {
			%>
			<form method="post">
				<input type="text" name="nome">
				<input type="submit" value="aggiungi">
			</form>
			
			
			<%
		}
		
	}
		
	


%>



</body>
</html>