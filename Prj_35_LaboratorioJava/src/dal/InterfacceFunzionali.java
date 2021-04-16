package dal;

@FunctionalInterface
interface SenzaParam{
	void stampa();
}

@FunctionalInterface
interface ConUnParam{
	void stampa(String s);
}

@FunctionalInterface
interface ConDueParam{
	void stampa(String s, String b);
}


public class InterfacceFunzionali {

	public static void main(String[] args) {
	
		SenzaParam sp = () -> System.out.println("ciao 0");
		ConUnParam cp = param -> System.out.println("ciao " + param);
		ConDueParam cdp = (p1, p2) -> System.out.println("ciao " + p1+p2);
		sp.stampa();
		cp.stampa("mauro");
		cdp.stampa("uno", "due");
		
	}

}
