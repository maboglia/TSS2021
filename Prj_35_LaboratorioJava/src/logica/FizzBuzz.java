package logica;

import java.util.stream.IntStream;

public class FizzBuzz {
	public static void main(String[] args) {
//		for (int i = 0; i < 100; i++) {
//			if (i % 3 == 0)
//				System.out.println("FIZZ");
//			if (i%5==0)
//					System.out.println("BUZZ");
//			if (i%3==0 && i%5==0)
//				System.out.println("FIZZBUZZ");
//		}
	
	
		IntStream.range(0, 100).forEach(i->{
			if (i % 3 == 0)
				System.out.println("FIZZ");
			if (i%5==0)
					System.out.println("BUZZ");
			if (i%3==0 && i%5==0)
				System.out.println("FIZZBUZZ");
		});
		
		
	
	}
	
	
	
}