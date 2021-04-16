package controller;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import entities.Editore;
import entities.Libro;
import repos.EditoreDAOImpl;
import repos.LibroDAO;

public class LibroCtrl {

	public static void main(String[] args) {
		LibroDAO ld = new LibroDAO();
		EditoreDAOImpl ed = new EditoreDAOImpl();
		
		//Libro l = trovaLibro(ld, 24);

		//l.setTitolo("Quel che resta del mese");
		
//		try {
//			ld.updateLibro(l);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		try {
			ld.deleteLibro(24);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Eliminazione libro non riuscite: " + e.getMessage());
//			e.printStackTrace();
		}
		
//		try {
//			ld.addLibro(l);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		trovaTutti(ld);
		
//		trovaEditori(ed);
		
		
	}

	private static void trovaEditori(EditoreDAOImpl ed) {
		try {
			Map<Integer, Editore> editori = ed.getAll();
			
			Set<Integer> chiaviEditori = editori.keySet();
			
			for (Integer idEditore : chiaviEditori) {
				System.out.println(editori.get(idEditore));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void trovaTutti(LibroDAO ld) {
		try {
			Map<Integer, Libro> libri = ld.getLibri();
			
			Set<Integer> idLibri = libri.keySet();
			
			for (Integer idLibro : idLibri) {
				System.out.println(libri.get(idLibro));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Libro trovaLibro(LibroDAO ld, int i) {
		Libro l = null;
		try {
			l = ld.getLibro(i);
			System.out.println(l);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("libro non trovato");
			e.printStackTrace();
		}
		
		return l;
	}
	
	
	
}
