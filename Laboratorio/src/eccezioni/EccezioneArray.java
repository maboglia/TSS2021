package eccezioni;

public class EccezioneArray {

	public static void main(String[] args) {
		

		int[] voti = {25,26,27,28,29};
		double somma = 0;
		double media = 0;
		
		try {
			
			for (int i = 0; i <= voti.length; i++) {
				System.out.println(voti[i]);
				media = voti[i] / i;
			}
			
		} catch (ArithmeticException e) {
			System.err.println("Si è verificata un'eccezione arimetica");
			System.err.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Hai provato ad accedere ad un elemento inesistente");
			System.err.println(e.getMessage());
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println("la media è: ");
		
	}

}
