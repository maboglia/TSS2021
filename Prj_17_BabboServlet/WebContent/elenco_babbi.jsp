<%@page import="model.Babbo"%>
<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<%@page import="java.util.ArrayList"%>
<ul>
<%
	if (request.getAttribute("babbi") != null){
		ArrayList<Babbo> babbi = (ArrayList<Babbo>) request.getAttribute("babbi");
		for (Babbo babbo : babbi){
			%>
			<li><%= babbo.getNome() %></li>
			<%
		}
	}
%>
</ul>
<%@ include file="footer.jsp" %>