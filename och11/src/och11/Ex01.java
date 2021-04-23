package och11;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> cha = new ArrayList<>();
		ArrayList<Integer> hap = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		cha.addAll(list1);
		cha.removeAll(list2);
		//list2를 제거하지않고 list1 - 1,2,3,4,
		//를 가지고있으면 중복을 허용하기때문에 
		//hap 은 1,2,3,4,3,4,5,6,이 출력
		
		hap.addAll(cha);
		hap.addAll(list2);

		System.out.println(" 합집합       :  " +hap);
		System.out.println(" 차집합       :  " +cha);
		
		
		
		
		
	}

}
