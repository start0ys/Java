package och06;






public class EncapsuleEx {

	public static void main(String[] args) {
		Encapsule h1 = new Encapsule();
		//정보 보호
//		h1.name = "홍길동";
//		h1.age = 26;
//		System.out.println("이름 : " + h1.name);
//		System.out.println("나이 : " + h1.age);
		
		h1.setName("홍길동");
		h1.setAge(26);
		System.out.println("이름 : " + h1.getName());
		System.out.println("나이 : " + h1.getAge());

	}

}
