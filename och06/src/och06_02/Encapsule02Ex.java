package och06_02;

import och06.Encapsule;

public class Encapsule02Ex {

	public static void main(String[] args) {
		Encapsule h3 = new Encapsule();
		
//		h3.name = "마이콜";
//		h3.age = -10;
//		System.out.println("이름 : " + h3.name);
//		System.out.println("나이 : " + h3.age);
//		
		h3.setName("마이콜");
		h3.setAge(-10);
		System.out.println("이름 : " + h3.getName());
		System.out.println("나이 : " + h3.getAge());

	}

}
