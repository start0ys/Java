package exam07;

import java.util.Arrays;
import java.util.List;

public class ReductionEx {

	public static void main(String[] args) {
		List<Student1> studentList = Arrays.asList(
				new Student1("둘리", 92),
				new Student1("또치", 95),
				new Student1("고길동", 88)	
		);
		int sum1 = studentList.stream()
				.mapToInt(Student1 :: getScore)
				.sum();
		System.out.println("sum1 : "+sum1);
		// 사용자 집계(reduce)
		int sum2 = studentList.stream()
				.map(Student1 :: getScore)
				.reduce((a,b) -> a+b)
				.get();
		
		int sum3 = studentList.stream()
				.map(Student1 :: getScore)
				.reduce(0,(a,b) -> a+b);
		
		System.out.println("sum2 : "+sum2);
		System.out.println("sum3 : "+sum3);
	}

}
