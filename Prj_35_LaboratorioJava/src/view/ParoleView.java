package view;

import controller.ParoleCtrl;

public class ParoleView {

	public static void main(String[] args) {
		ParoleCtrl pc = new ParoleCtrl();
		
		pc.getParole()
			.stream()
			.filter(p->p.length()==4)
			.forEach(System.out::println);

	}

}
