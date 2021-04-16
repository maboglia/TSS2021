package view;

import java.util.function.Consumer;

import controller.PaesiCtrl;
import model.Paese;

public class PaesiView {

	public static void main(String[] args) {
		
		PaesiCtrl paesi = new PaesiCtrl();

		paesi.getCapitali("europe")
			.stream()
			.sorted((a,b)->b.compareTo(a))
			.forEach(System.out::println);
		
		long sum = paesi.getPaesi()
			.stream()
			.filter(p->p.getRegion().equalsIgnoreCase("europe"))
			.mapToLong(p->p.getPopulation())
			.sum();
		System.out.println(sum);
		
		paesi.getPaesi()
		.stream()
		.filter(p->p.getRegion().equalsIgnoreCase("europe"))
		.sorted((a,b)->(int) (b.getPopulation()-a.getPopulation()))
		.limit(10)
		.forEach(p->System.out.println(p.getName()+ ": " + p.getPopulation()));
		

	}
	
	
	

}
