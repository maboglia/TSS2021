<%@page import="model.Bimbo"%>
<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<%@page import="java.util.ArrayList"%>
<ul>
<%
	if (request.getAttribute("bimbi") != null){
		ArrayList<Bimbo> bimbi = (ArrayList<Bimbo>) request.getAttribute("bimbi");
		for (Bimbo bimbo : bimbi){
			%>
			<li><%= bimbo.getNome() %></li>
			<%
		}
	}
%>
</ul>
<%@ include file="footer.jsp" %>