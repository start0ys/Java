package exam05;

import java.util.Arrays;
import java.util.List;

public class MapEx {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("둘리",10),
				new Student("또치",20),
				new Student("희동이",30)
		);
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach( score -> System.out.println(score));

	}

}
