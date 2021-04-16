package restcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ClientiCtrl;
import controller.ContiCtrl;
import model.Cliente;
import model.Conto;

/**
 * Servlet implementation class Conti
 */
@WebServlet("/Conti")
public class Conti extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ContiCtrl conti;
	private ClientiCtrl clienti;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Conti() {
        super();
        this.conti = new ContiCtrl();
        this.clienti = new ClientiCtrl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		request.setAttribute("conti", this.conti.getConti());
		request.getRequestDispatcher("elenco_conti.jsp").forward(request, response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeCorrentista = request.getParameter("cliente");
		Cliente c = this.clienti.cercaPerNome(nomeCorrentista);
		System.out.println(c);
		this.conti.addConto(c);
		doGet(request, response);
	}

}
