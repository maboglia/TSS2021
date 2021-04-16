package view;

public class MioRunnable implements Runnable{

	@Override
	public void run() {
		int iterazioni = 3;
		
		try {
			
			for (int i = 0; i < iterazioni; i++) {
				System.out.println("sono il runnable " + i);
				Thread.sleep(15000);
			}
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		
		
	}

}
