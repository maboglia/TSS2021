package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import controller.AnimaliCtrl;
import model.*;

public class GestioneAnimali {

	public static void main(String[] args) {
		AnimaliCtrl ctrl = new AnimaliCtrl();
		
		//gatti
		Gatto chopper = new Gatto();
		chopper.setNome("chopper");
		chopper.setTaglia(Taglia.MEDIA);

		Felino g2 = new Gatto();
		g2.setNome("mau");
		g2.setTaglia(Taglia.GRANDE);
		
		Gatto cinder = new Gatto();
		cinder.setNome("cinder");
		cinder.setTaglia(Taglia.PICCOLA);
		
		Cane c1 = new Cane();
		c1.setNome("kant");
		c1.setTaglia(Taglia.MEDIA);
		
		Cane c2 = new Pinscher();
		c2.setNome("freddy");
		c2.setTaglia(Taglia.PICCOLA);
		
		Animale c3 = new Cane();
		c3.setNome("fritz");
		c3.setTaglia(Taglia.GRANDE);
		
		Felino l1 = new Leone();
		l1.setNome("simba");
		l1.setTaglia(Taglia.GRANDE);

		
		ctrl.addAnimale(l1);
		ctrl.addAnimale(c3);
		ctrl.addAnimale(c2);
		ctrl.addAnimale(c1);
		ctrl.addAnimale(cinder);
		ctrl.addAnimale(g2);
		ctrl.addAnimale(chopper);
		
		
		chopper.diventaPericoloso(()->System.out.println("ffffffffffh"));
		
		
		
		ctrl
			.getAnimali()
			.stream()
			.sorted((uno, due) -> uno.getNmat() - due.getNmat())
			.filter(a->a.getNmat()>3)
			.forEach(a -> System.out.println(a));
		
		Integer[] voti = {22,24,26,28,30};
		List<Integer> lista = Arrays.stream(voti)
									.filter(v->v>25)
									.collect(Collectors.toList());

		boolean anyMatch = Arrays.stream(voti).anyMatch(v->v<26&&v>24);
		Optional<Integer> reduce = Arrays.stream(voti).reduce((a,b)->a+b);
		System.out.println(reduce.get());
		
		
		
		System.out.println(anyMatch);
		
		lista.forEach(System.out::println);
		
	}

}
