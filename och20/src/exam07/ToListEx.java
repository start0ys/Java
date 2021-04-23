package exam07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListEx {

	public static void main(String[] args) {
		List<Student2> totalList = Arrays.asList(
				new Student2("짱구", 10, Student2.Sex.MALE),
				new Student2("짱아", 6, Student2.Sex.FEMALE),
				new Student2("철수", 10, Student2.Sex.MALE),
				new Student2("유리", 6, Student2.Sex.FEMALE)
		);
		
		List<Student2> maleList = totalList.stream()
				.filter(s -> s.getSex() == Student2.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
			.forEach( s -> System.out.println(s.getName()));
		
		System.out.println();
		
		/////
		Set<Student2> femaleSet = totalList.stream()
				.filter( s -> s.getSex() == Student2.Sex.FEMALE)
//				.collect(Collectors.toCollection(HashSet :: new));
//				.collect(Collectors.toCollection(() -> {return new HashSet<Student2>(); } ) )
				.collect(Collectors.toCollection(() -> new HashSet<Student2>()));
		femaleSet.stream()
			.forEach(  s -> System.out.println(s.getName()));

	}

}
