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

import entities.Editore;
import entities.Libro;
import repos.EditoreDAO;
import repos.EditoreDAOImpl;
import repos.LibroDAO;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/editori")
public class Editori extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EditoreDAOImpl ed;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Editori() {
        super();
        
        ed = new EditoreDAOImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		try {
			request.setAttribute("elenco", ed.getAll());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		
		if (request.getParameter("aggiungi")!=null) {
			request.getRequestDispatcher("formEditore.jsp").include(request, response);			
		}
		
		request.getRequestDispatcher("listaEditori.jsp").include(request, response);
		//response.getWriter().append(sb.toString());
		request.getRequestDispatcher("footer.jsp").include(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("nomeEditore") != null && !request.getParameter("nomeEditore").trim().equals("") ) {
			Editore e = new Editore(0, request.getParameter("nomeEditore"));
			
			try {
				ed.addEditore(e);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		doGet(request, response);
	}

}
