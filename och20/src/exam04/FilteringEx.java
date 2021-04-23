package exam04;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("둘리","고길동","희동이","고길동","마이콜");
		
		names.stream()
			.distinct()
			.forEach( n -> System.out.print(n+" "));
		System.out.println();
		
		names.stream()
			.filter( n -> n.startsWith("고"))
			.forEach( n -> System.out.print(n+" "));
		System.out.println();
		
		names.stream()
			.distinct()
			.filter( n -> n.startsWith("고"))
			.forEach( n -> System.out.print(n+" "));
		System.out.println();

	}

}
