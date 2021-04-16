package view;

import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class ProvaGeometrica {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(1,1); 
		Punto p2 = new Punto(5,1); 
		Punto p3 = new Punto(1,4);
		
		Segmento ab = new Segmento(p1, p2);
		Segmento ac = new Segmento(p1, p3);
		Segmento cb = new Segmento(p3, p2);

//		System.out.println("Segmento ab: " + ab);
//		System.out.println("Lunghezza ab: " + ab.lunghezza());
//
//		System.out.println("Segmento ac: " + ac);
//		System.out.println("Lunghezza ac: " + ac.lunghezza());		
//
//		System.out.println("Segmento cb: " + cb);
//		System.out.println("Lunghezza cb: " + cb.lunghezza());		

		Triangolo t = new Triangolo(p1, p2, p3);
//		System.out.println(t.perimetro());
//		System.out.println(t.superficieErone());

		Rettangolo r = new Rettangolo(ab, ac);
		System.out.println(r.perimetro());
		System.out.println(r.superficie());
		
		Rettangolo q = new Quadrato(ab);
		System.out.println(q.perimetro());
		System.out.println(q.superficie());
		
		Rettangolo[] quadrilateri = {r, q};
		
		for (Rettangolo r1 : quadrilateri) {
			if (r1 instanceof Quadrato)
				System.out.println("E' un QUADRATO!!!!!");
			System.out.println(r1.perimetro());
		}
		
	
	}
	
	
}
