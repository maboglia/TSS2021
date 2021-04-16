package presentation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Autore;
import entities.Editore;
import entities.Libro;
import repos.EditoreDAO;
import repos.AutoreDAO;
import repos.LibroDAO;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/autori")
public class Autori extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AutoreDAO ad;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Autori() {
        super();
        
        ad = new AutoreDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		try {
			request.setAttribute("elenco", ad.getAutori());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		
		if (request.getParameter("aggiungi")!=null) {
			request.getRequestDispatcher("formAutore.jsp").include(request, response);			
		}
		
		request.getRequestDispatcher("listaAutori.jsp").include(request, response);
		//response.getWriter().append(sb.toString());
		request.getRequestDispatcher("footer.jsp").include(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("nome") != null && !request.getParameter("nome").trim().equals("") ) {
			Autore e = new Autore(0, request.getParameter("nome"), request.getParameter("cognome"));
			
			try {
				ad.addAutore(e);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		doGet(request, response);
	}

}
