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
import repos.EditoreDAOImpl;
import repos.LibroDAO;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/libri")
public class Libri extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LibroDAO ld;
	EditoreDAOImpl ed;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Libri() {
        super();
        ld = new LibroDAO();
        ed = new EditoreDAOImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		try {
			request.setAttribute("elenco", ld.getLibri());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		
		if (request.getParameter("aggiungi")!=null) {
			
			try {
				request.setAttribute("editori", ed.getAll());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("formLibro.jsp").include(request, response);			
		}		
		
		request.getRequestDispatcher("lista.jsp").include(request, response);
		//response.getWriter().append(sb.toString());
		request.getRequestDispatcher("footer.jsp").include(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("titolo") != null && !request.getParameter("titolo").trim().equals("") ) {
			Libro l = new Libro();
			l.setTitolo(request.getParameter("titolo"));
			int pagine = Integer.parseInt(request.getParameter("pagine"));
			l.setPagine(pagine);
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			l.setPrezzo(prezzo);
			int editore_id = Integer.parseInt(request.getParameter("editore"));
			l.setEditore_id(editore_id);
			
			try {
				ld.addLibro(l);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		doGet(request, response);
	}

}
