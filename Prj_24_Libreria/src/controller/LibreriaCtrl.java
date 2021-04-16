package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro;
import model.Scaffale;

/**
 * Servlet implementation class LibreriaCtrl
 */
@WebServlet("/librerie")
public class LibreriaCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Libro[] libri = {
		new Libro("HUGO", "L'UOMO CHE RIDE", 0),
		new Libro("IBSEN HENRIK", "SPETTRI UN NEMICO DEL POPOLO L'ANITRA SELVATICA ROSMER.", 0),
		new Libro("MAUPASSANT GUI DE", "UNA VITA", 0),
		new Libro("STENDHAL", "DELL'AMORE", 0),
		new Libro("STEVENSON ROBERT LOUIS", "IL RAGAZZO RAPITO", 0),
		new Libro("DA PONTE LORENZO", "MEMORIE LIBRETTI MOZARTIANI", 0),
		new Libro("LACLOS", "LE RELAZIONI PERICOLOSE", 0),
		new Libro("SVETONIO TRANQUILLO", "VITA DEI CESARI", 0),
		new Libro("PROCOPIO DI CESAREA", "CARTE SEGRETE", 0),
		new Libro("DOSTOEVKIJ FEDOR", "IL GIOCATORE", 0),
		new Libro("ALFIERI VITTORIO", "VITA", 0),
		new Libro("MUSIL ROBERT", "IL GIOVANE TORLESS", 0),
		new Libro("STENDHAL", "ARMANCE", 0),
		new Libro("MAUPASSANT", "FORTE COME LA MORTE", 0),
		new Libro("DIDEROT DENIS", "LA MONACA", 0),
		};

		Scaffale s1 = new Scaffale("S1");
		Scaffale s2 = new Scaffale("S2", new ArrayList<>(Arrays.asList(libri)));
		
		ScaffaleCtrl ctrl1 = new ScaffaleCtrl(s1);
		ctrl1.addLibro(libri[0]);
		
		ScaffaleCtrl ctrl2 = new ScaffaleCtrl(s2);
		ctrl2.addLibro(libri[0]);
		
		request.setAttribute("libri", ctrl1.getAll());
		request.getRequestDispatcher("libreria.jsp").forward(request, response);
	
	}

}
