package exam01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("둘리","또치","고길동");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println("----------------------------------");
		
		Stream<String> stream = list.stream();
		stream.forEach( name -> System.out.println(name));
		
		
	}

}
