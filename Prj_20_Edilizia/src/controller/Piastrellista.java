package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Forma;
import model.Piastrella;
import model.Quadrato;
import model.Rettangolo;
import model.Triangolo;

/**
 * Servlet implementation class Piastrellista
 */
@WebServlet("/piastrelle")
public class Piastrellista extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ArrayList<Forma> stanze;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Piastrellista() {
    	this.stanze = new ArrayList<>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		this.stanze.add(new Triangolo("bagno", 4, 2));//4
//		this.stanze.add(new Quadrato("Cucina", 5));//25
//		this.stanze.add(new Rettangolo("Ingresso", 5, 2));//10
//		this.stanze.add(new Rettangolo("Camera Letto", 5, 4));//20
//		this.stanze.add(new Rettangolo("Camera Letto 2", 6, 5));//30
	
		StringBuilder sb = new StringBuilder();
		double superficie = 0;
		
		Collections.sort(stanze);
		
		for (Forma stanza : stanze) {
			sb.append(stanza);
			superficie += stanza.calcolaSuperficie();
		}
		sb.append("La superficie complessiva è di mq " + superficie);
		
		Piastrella p = new Piastrella(0.4, 1.2);
		
		double nPiastrelle = superficie / p.getSuperficie();
		
		sb.append("Il numero di piastrelle è: " + nPiastrelle);
		sb.append("Il prezzo delle piastrelle è: " + (nPiastrelle * p.getPrezzo()));
		
		request.setAttribute("stanze", stanze);
		request.setAttribute("nPiastrelle", nPiastrelle);
		request.setAttribute("area", superficie);
		request.getRequestDispatcher("lista_stanze.jsp").forward(request, response);
		
		//response.getWriter().append(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forma = request.getParameter("forma");//r,t,q
		String nome = request.getParameter("nomeStanza");
		double lato1 = Double.parseDouble(request.getParameter("latoCorto"));
		double lato2 = Double.parseDouble(request.getParameter("latoLungo"));
		
		switch (forma) {
		case "r":
			this.stanze.add(new Rettangolo(nome, lato1, lato2));
			break;
		case "t":
			this.stanze.add(new Triangolo(nome, lato1, lato2));
			break;
		case "q":
			this.stanze.add(new Quadrato(nome, lato1));
			break;

		default:
			break;
		}//fine switch
		
		doGet(request, response);
		
	}

}
