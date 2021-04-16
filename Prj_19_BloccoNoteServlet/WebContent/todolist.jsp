<%@page import="model.Todo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="addTodo.html">aggiungi</a>

<ul>
	<%
	
		ArrayList<Todo> todoList = (ArrayList<Todo>) request.getAttribute("todo"); 
	
		for(Todo t : todoList){
			out.print("<li>");
			
			if (!t.isCompletato()){
				out.print("<a href='todo?completa=0'>X</a> ");
			}
			
			out.print(t.getDescrizione());
			
			out.print("</li>");
		}
	
	%>
</ul>


</body>
</html>