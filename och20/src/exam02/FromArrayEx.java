package exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayEx {

	public static void main(String[] args) {
		String [] strArray = { "둘리","또치","고길동" };
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach( a -> System.out.print(a+ ","));
		System.out.println("");
		System.out.println("-----------------------------");
		
		int[] intArray = { 1,2,3,4,5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach( a -> System.out.print(a+","));
		System.out.println();
	}

}
