package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaEx {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("둘리",90),
				new Student("또치",92)
		);
		Stream<Student> stream = list.stream();
//		stream.forEach( s -> {
//			String name = s.getName();
//			int score   = s.getScore();
//			System.out.println(name + "-" + score);
//		});
		
		stream.forEach( s -> {	System.out.println(s.getName() + "-" + s.getScore());});

	}

}
