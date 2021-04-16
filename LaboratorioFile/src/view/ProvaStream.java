package view;

import java.util.List;

import controller.ProvinciaCtrl;
import model.Provincia;

public class ProvaStream {

	public static void main(String[] args) {
		ProvinciaCtrl pro = new ProvinciaCtrl();
		
//		pro.copiaFile();
//		List<Provincia> prov = pro.leggiConScanner();
//		
//		System.out.println(prov.size());
//		
//		prov.stream().filter(p->p.getTotale() > 500000).forEach(System.out::println);
		
//		pro.copiaFileBinario();
		pro.leggiURL();
	
	}

}
