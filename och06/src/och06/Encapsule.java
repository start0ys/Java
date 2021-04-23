package och06;

public class Encapsule {
//	String name;
//	int age;
	
	private String name;
	private int age;

//	Encapsule(String name , int age){
//		this.name = name;
//		this.age = age;
//	}
//	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age < 0) System.out.println("나이 입력 오류");
		else this.age=age;
	}
	
}
