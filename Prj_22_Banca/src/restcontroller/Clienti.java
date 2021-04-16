package restcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ClientiCtrl;
import model.Cliente;

/**
 * Servlet implementation class Clienti
 */
@WebServlet("/Clienti")
public class Clienti extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ClientiCtrl controller;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Clienti() {
        super();
        this.controller = new ClientiCtrl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//mostra elenco clienti
//		for (Cliente c: this.controller.getClienti()) {
//			System.out.println(c);
//		}
		
		if (request.getParameter("azione")!=null) {

				if (request.getParameter("azione").equals("addConto")) {
					request.setAttribute("clienti", this.controller.getClienti());
					request.getRequestDispatcher("addConto.jsp").forward(request, response);
					
				}
			
		} else {
			request.setAttribute("clienti", this.controller.getClienti());
			request.getRequestDispatcher("elenco_clienti.jsp").forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//this.controller.getClienti().clear();
		//ricevo nella richiesta il parametro nome con cui costruire un oggetto cliente e aggiungerlo alla lista di clienti
		String nome = request.getParameter("nomeCliente");
		this.controller.addCliente(nome);
		
		//quindi chiamo doGet per mostrare l'elenco dei clienti
		doGet(request, response);
	}

}
