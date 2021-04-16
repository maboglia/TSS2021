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
<h1>Elenco Libri</h1>

<c:forEach items="${libri}" var="libro">
	<li>${libro.getTitolo()}</li>
</c:forEach>


</body>
</html>