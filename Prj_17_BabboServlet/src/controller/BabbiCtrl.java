package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Babbo;

/**
 * Servlet implementation class BabbiCtrl
 */
@WebServlet("/babbi")
public class BabbiCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ArrayList<Babbo> babbi = new ArrayList<>();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		babbi.add("babbo1");
//		babbi.add("babbo2");
//		babbi.add("babbo3");
		
//		StringBuilder sb = new StringBuilder();
//		sb.append("<ul>");
//		for (String babbo : babbi) {
//			sb.append("<li>");
//			sb.append(babbo);
//			sb.append("</li>");
//		}
//		sb.append("</ul>");
		
		//se vuoi un solo babbo 
		if (request.getParameter("id")!=null) {
			Babbo babbo = babbi.get(Integer.parseInt(request.getParameter("id")));
			request.setAttribute("babbo", babbo);
			request.getRequestDispatcher("singolo_babbo.jsp").forward(request, response);
		} else {			
			request.setAttribute("babbi", babbi);
			request.getRequestDispatcher("elenco_babbi.jsp").forward(request, response);
		}
		
		
		
//		response.setContentType("text/html");
//		response.getWriter().append("<h1>elenco babbi</h1>").append(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("nomeBabbo")!=null) {
			babbi.add(new Babbo(request.getParameter("nomeBabbo")));
		}
		
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		response.getWriter().append("Babbo inserito con successo!");
		request.getRequestDispatcher("footer.jsp").include(request, response);

	
	}

}
