package controller;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pomate;
import model.Prodotto;
import model.Spezie;
import model.SpezieOfficinali;

/**
 * Servlet implementation class ProdottiCtrl
 */
@WebServlet("/prodotti")
public class ProdottiCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdottiCtrl() {
        super();
        System.out.println("creato un oggetto di tipo HttpServlet: ProdottiCtrl");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Spezie s1 = new Spezie();
		s1.setCodProdotto("S01");
		s1.setDescrizione("cannella");
		
		SpezieOfficinali s2 = new SpezieOfficinali();
		s2.setCodProdotto("SP05");
		s2.setDescrizione("cardamomo");
		
		Pomate p1 = new Pomate();
		p1.setCodProdotto("P012");
		p1.setDescrizione("arnica");
		
		Magazzino m1 = new Magazzino();
		
		m1.addProdotto(s1);
		m1.addProdotto(s2);
		m1.addProdotto(p1);
		
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		if (request.getParameter("id")!=null) {
			Prodotto prodotto = m1.getProdotti().get(request.getParameter("id"));
			if (prodotto!=null) {
				response.getWriter().append(prodotto.toString());
			} else {
				response.getWriter().append("{\"error\":\"prodotto non disponibile\"}");
			}
		} else {
			response.getWriter().append(m1.getProdotti().values().toString());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
