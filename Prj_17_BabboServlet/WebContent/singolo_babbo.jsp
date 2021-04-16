<%@page import="model.Babbo"%>
<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<div>
<%
	if (request.getAttribute("babbo") != null){
		Babbo babbo = (Babbo) request.getAttribute("babbo");

			%>
			<h2><%= babbo.getNome() %></h2>
			<%
	}
%>
</div>
<%@ include file="footer.jsp" %>