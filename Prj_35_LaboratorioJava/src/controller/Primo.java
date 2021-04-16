package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Primo
 */
@WebServlet({ "/Primo", "/primo", "/primipiatti" })
public class Primo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Primo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("prova");
		request.setAttribute("aggiunta", 123);
//		request.getRequestDispatcher("primo.jsp").forward(request, response);
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		if (request.getParameter("parametro1")!=null)
			response.getWriter().append("ciao dalla servlet " + request.getParameter("parametro1"));
		request.getRequestDispatcher("primo.jsp").include(request, response);

		request.getRequestDispatcher("footer.jsp").include(request, response);

		
		//response.sendRedirect("primo.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
