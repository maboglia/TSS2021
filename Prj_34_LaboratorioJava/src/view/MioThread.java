package view;

public class MioThread extends Thread {

	@Override
	public void run() {
		int iterazioni = 10;
		
		try {
			for (int i = 0; i < iterazioni; i++) {
				System.out.println("sono il thread secondario " + i);
					sleep(1500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("spiacenti, si è verificata un'eccezione: " + e.getMessage());
		}
		
		
	}

	
	
}
