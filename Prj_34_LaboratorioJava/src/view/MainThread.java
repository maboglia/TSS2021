package view;

public class MainThread {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int iterazioni = 10;
		
		MioThread thread = new MioThread();
		thread.start();
		
		MioRunnable miorun = new MioRunnable();
		new Thread(miorun).start();
		
		try {
			for (int i = 0; i < iterazioni; i++) {
				System.out.println("sono il main thread " + i);
				Thread.sleep(2500);
				
				if (i == 4) {
					thread.interrupt();
					System.out.println("ho interrotto il thread secondario");
				}
				
			}
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		
		long stop = System.currentTimeMillis();

		System.out.printf("L'elaborazione complessiva è durata: %4.2f",(double)(stop-start)/1000);
		
	}

}

