<%@page import="model.Impegno"%>
<%@page import="controller.AgendaSettimanale"%>
<%@page import="model.Giornata"%>
<%@page import="model.Settimana"%>

<%

	Settimana s = (Settimana) session.getAttribute("calendario");
	AgendaSettimanale as = new AgendaSettimanale(s);
	String giorno = request.getParameter("giorno");
	String ora = request.getParameter("ora");
	String impegno = request.getParameter("impegno");

	int a = Integer.parseInt(giorno);
	int b = Integer.parseInt(ora);
	
	Impegno i = as.getImpegno(as.getGiornata(a), b);
	
	i.setImpegno(impegno);

	session.setAttribute("calendario", as.getSettimana());
	
	response.sendRedirect("index.jsp");
%>
