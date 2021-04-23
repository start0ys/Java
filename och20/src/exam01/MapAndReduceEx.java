package exam01;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceEx {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("둘리", 10),
				new Student("또치", 20),
				new Student("고길동", 30)
		);
		
		double avg = studentList.stream()
				//중간처리(학생 객체를 점수로 매핑)
				.mapToInt(Student :: getScore)
				//최종 처리 (평균 점수)
				.average()
				.getAsDouble();
		
//		int avg = studentList.stream()
//				//중간처리(학생 객체를 점수로 매핑)
//				.mapToInt(Student :: getScore)
//				//최종 처리 (평균 점수)
//				.sum();
				
				
		
		System.out.println("평균 점수 : "+ avg);

	}

}
