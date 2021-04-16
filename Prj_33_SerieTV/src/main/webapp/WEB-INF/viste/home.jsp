<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>home</h1>

<ul>
<c:forEach items="${elenco}" var="serie">

<li>${serie.name}  <a href="/mvc/serie/view/${serie.id}">view</a> <a href="/mvc/serie/update/${serie.id}">edit</a>    </li>


</c:forEach>
</ul>



</body>
</html>