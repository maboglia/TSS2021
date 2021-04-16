package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DB;
import model.Bimbo;
import model.Studente;

/**
 * Servlet implementation class BimbiCtrl
 */
@WebServlet("/bimbi")
public class BimbiCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DB miodb = new DB();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Bimbo> bimbi = new ArrayList<>();
		for (Studente s : miodb.getStudentiAL()) {
			System.out.println(s);
			bimbi.add(new Bimbo(s.getNome(),s.getCognome(),s.getEta()));
		}
		
		request.setAttribute("bimbi", bimbi);
		request.getRequestDispatcher("elenco_bimbi.jsp").forward(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
