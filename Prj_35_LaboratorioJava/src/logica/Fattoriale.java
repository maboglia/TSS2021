package logica;

public class Fattoriale {

	public static void main(String[] args) {
		int x = 5;
		
		//5*4*3*2*1=20*3*2*1=60*2*1=120*1=120
		
		int i = fact(x);
		System.out.printf("il fattoriale di x è %d", i);
	}
//                             5
	private static int fact(int x) {
		if(x==0)
			return 1;
		else {
			System.out.println("il valore di x è: " + x);
			return x * fact(x-1);
		}
	}
}