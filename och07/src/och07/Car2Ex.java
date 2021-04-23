package och07;

public class Car2Ex {

	public static void main(String[] args) {
		Car2[] car = new Car2[3];
		//부모객체에 자식객체를 매칭시킬수있다 반대는 불가능
		car[0] = new Bus();
		car[1] = new Ambulance();
		car[2] = new FireEngine();
		
		for (Car2 c : car) {
			c.move(); //실행은 부모와 같은 이름의 자식 메소드가 실행 (자식 메소드 수행)
			//메서드는 오버라이딩되서 같은이름의 메소드가 자식에게있다면 자식꺼가 실행
			System.out.println("for Car2 ->"+c.a); //멤버변수는 부모꺼가 실행
			
//			c.special(); //불가능 c가 부모 타입인데 부모에 special이 없기떄문?????
			
			//instanceof -> 객체 Type 비교
			if (c instanceof Ambulance) {
				
				Ambulance am = (Ambulance) c; //캐스팅
				am.special();
				System.out.println("Ambulance a ->"+am.a);
			} else if(c instanceof FireEngine) {
				FireEngine fe = (FireEngine) c;
				System.out.println("FireEngine a ->"+fe.a);
			}
			
		}
	}

}
