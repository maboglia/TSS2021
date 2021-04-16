package restcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import controller.ClientiCtrl;
import model.Cliente;

/**
 * Servlet implementation class Clienti
 */
@WebServlet("/clientijson")
public class ClientiJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientiJson() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//mi faccio ritornare i clienti		
		JSONArray clienti = new JSONArray();
		
		System.out.println(ClientiCtrl.getClienti().size());
		if (ClientiCtrl.getClienti().size() > 0) {
			
			for (Cliente c : ClientiCtrl.getClienti()) {
				JSONObject cliente  = new JSONObject();
				cliente.put("nome", c.getNome());
				clienti.add(cliente);
			}
			
			
		}

		
		response.setContentType("application/json");
		response.getWriter().append(clienti.toJSONString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//this.controller.getClienti().clear();
		//ricevo nella richiesta il parametro nome con cui costruire un oggetto cliente e aggiungerlo alla lista di clienti
		String nome = request.getParameter("nomeCliente");
		//this.controller.addCliente(nome);
		
		//quindi chiamo doGet per mostrare l'elenco dei clienti
		doGet(request, response);
	}

}
