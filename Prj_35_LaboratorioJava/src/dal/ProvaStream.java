package dal;

import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ProvaStream {

	public static void main(String[] args) {

		
		OptionalDouble average = IntStream
			.range(1, 91)
			//intermedia
			.filter(e->e%2==0)
			.filter(n->n%3==0).average();
			//.filter(n->n%5==0)
			//terminale
			//.forEach(e->System.out.println(e));
		
		if(average.isPresent())
			System.out.println(average);
		

	}

}
