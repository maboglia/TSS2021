package view;

public class Anonimo1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread() {
			public void run() {
				System.out.println("sono un thread");
			}
		};
		System.out.println("il mio primo thread");	
		
		t.sleep(2500);
		t.start();

		System.out.println("il mio primo thread");
		
		new Thread(()->System.out.println("sono il 3 thread")).start();
		
		
	}

}
