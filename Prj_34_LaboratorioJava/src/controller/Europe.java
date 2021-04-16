package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.PaesiDAO;

/**
 * Servlet implementation class Europe
 */
@WebServlet("/Europe")
public class Europe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private PaesiDAO pd;
    public Europe() {
        pd = new PaesiDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String paese = request.getParameter("paese");
		
		try {
			String string = pd.paesiCapitali().get(paese);
			response.getWriter().append(string);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			response.getWriter().append("non trovato");

//			e.printStackTrace();
		}
		response.getWriter().append("fine");
	}


}
