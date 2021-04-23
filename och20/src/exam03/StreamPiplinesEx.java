package exam03;

import java.util.Arrays;
import java.util.List;

public class StreamPiplinesEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("1.짱구",Member.MALE,30),
				new Member("2.짱아",Member.FEMALE,20),
				new Member("3.철수",Member.MALE,45),
				new Member("4.유리",Member.FEMALE,27)
		);
		double ageAvg = list.stream()
				.filter( m -> m.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		int ageSum = list.stream()
				.filter( m -> m.getSex() == Member.FEMALE)
				.mapToInt(Member :: getAge)
				.sum();
		
		System.out.println("남자 평균 나이 : "+ageAvg);
		System.out.println("여자 평균 나이 : "+ageSum);

	}

}
