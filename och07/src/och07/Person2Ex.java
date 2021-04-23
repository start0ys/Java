package och07;



//부모 rv = new 자식(); up casting OK
//부모 method()와 자식 method() 이름을 같을 때는  자식 메소드 실행
//부모의 멤버변수와 자식의 멤버변수가 이름이  같을 때는 부모 멤버변수 실행
//
//자식 rv2 = new 부모(); down casting X //이거은 부모가 생성자?
//자식 rv3 = (자식)부모객체;  down casting //이것은 부모가 인스턴스? 미리 인스턴스생성이 되어있어야함
//강제 형변환 하면 
//1) 문법적 에러가 없음 
//2) 에러가 있을 때도 없을 때도 있다
//대도록이만 안하는게 좋음????



public class Person2Ex {

	public static void main(String[] args) {
		Person2[] ps =  new Person2[5];
		ps[0] = new Student2("옥주현", 23, "1203667");
		ps[1] = new Student2("김유신", 53, "1386889");
		ps[2] = new Teacher2("대조영", 48, "Java");
		
		ps[3] = new Manager2("김소현", 28, "청소");
		ps[4] = new Manager2("젼현무", 40, "영업");
		
		for( Person2 p : ps) {
			p.print();
			if (p instanceof Manager2) {
				
				System.out.println("2번째 방법 : "+((Manager2) p).getPart());
				
			}
		}

	}

}
