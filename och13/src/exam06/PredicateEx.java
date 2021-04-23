package exam06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateEx {
	private static List<Student> list = Arrays.asList(
		new Student("짱구","남자",90),
		new Student("짱아","여자",90),
		new Student("철수","남자",95),
		new Student("유리","여자",92)
	);
	public static double avg(Predicate<Student> predicate ) {
		int count = 0,sum = 0;
		for (Student student : list) {
			System.out.println("1.student.getName() : "+student.getName());
			if(predicate.test(student)) {
				System.out.println("2.student.getName() : "+student.getName());
				count++;
				sum += student.getScore();
				System.out.println("3.student.getScore() : "+student.getScore());
			}
		}
		
		return  (double) sum / count;
	}
	public static void main(String[] args) {
		double maleAvg = avg( t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수 : "+maleAvg);
		double femaleAvg = avg( t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수 : "+femaleAvg);

	}

}
