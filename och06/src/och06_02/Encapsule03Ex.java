package och06_02;

import och06.Encapsule;

public class Encapsule03Ex {

	public static void main(String[] args) {
		Encapsule h2 = new Encapsule();
//	
//		h2.name = "둘리";
//		h2.age = -60;
//		System.out.println("이름 : " + h2.name);
//		System.out.println("나이 : " + h2.age);
		h2.setName("둘리");
		h2.setAge(-60);
		System.out.println("이름 : " + h2.getName());
		System.out.println("나이 : " + h2.getAge());

	}

}

