package dal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class CodeDiRondine {

	public static void main(String[] args) {
		PriorityQueue<String> linguaggi = new PriorityQueue<>();

		linguaggi.add("Java1");
		linguaggi.add("PHP");
		linguaggi.add("Javascript");
		linguaggi.add("Java2");
		linguaggi.add("C");
		
//		boolean offer = linguaggi.offer("Python");
//		System.out.println(offer);
		
//		System.out.println(linguaggi.peek());
//		System.out.println(linguaggi.poll());
		

//		Iterator<String> iterator = linguaggi.iterator();
//	
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	
//		for (var lang:linguaggi) {
//			System.out.println(lang);
//		}
		
//		Queue<String> coda = new PriorityQueue<>();
//		for (int i=0; i<50; i++) {
//			coda.offer("String #" + i);
//		}
//		while (!coda.isEmpty()) {
//			System.out.println(coda.poll());
//		}
//		
		List<String> coda2 = new ArrayList<>();
		for (int i=0; i<50; i++) {
		coda2.add("String #" + i);
		}		
		Collections.sort(coda2);
		for (String string : coda2) {
			System.out.println(string);
		}
		
		
		
	}

}
