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
 * Servlet implementation class RestController
 */
@WebServlet("/rest/add")
public class RestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String capital = request.getParameter("capital");
		String region = request.getParameter("region");
		String subregion = request.getParameter("subregion");
		String languages = request.getParameter("languages");
		long population = Long.parseLong(request.getParameter("population"));
		
		PaesiDAO pd = new PaesiDAO();
		try {
			pd.aggiungiPaese(name, capital, region, subregion, population, languages);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
