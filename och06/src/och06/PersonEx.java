package och06;

public class PersonEx {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("둘리");
		st1.setAge(21);
		st1.setSno("1111");
		
		Teacher th1 = new Teacher();
		th1.setName("마이콜");
		th1.setAge(35);
		th1.setSubject("Java");
		
		Manager mg1 = new Manager();
		mg1.setName("홍길동");
		mg1.setAge(19);
		mg1.setPart("청소");
		
		System.out.println("이름 : "+st1.getName()+" , 나이 : "+st1.getAge()+" 학번 :"+st1.getSno());
		
		th1.printAll();
		mg1.printAll();

	}

}
