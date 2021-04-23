package och05;


class Car1 {
	String color; // Member 변수 , 필드 ,instance 변수
	// 나를 선언한 모든 Instance들이 공유
	static int speed; // class 공유변수 static을하면 공유도하고 인스턴스화하지않아도 사용가능
	//인스턴스화를해서 메모리에 올려야 안에 메소드를 사용가능한데 static을 하면 인스턴스화하지안항도 사용가능
	// Car1 v = new Car1()로 인스턴스화해야 사용가능한데 static으로 메소드를 만들면 인스턴스화하지않고 사용가능하다
	
	
	void print() {
//		int kkk = 123; // 지역변수 여기서만 사용할수있다
		System.out.println("색깔:"+color);
		System.out.println("속도"+speed);
		System.out.println("-----------------------");
	}
}



//원래있는것
public class Car1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1.speed = 50; //static으로해주면 인스턴스생성안해도 사용가능
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		c1.color ="빨강";
//		c1.speed=200;
		c2.color="노랑";
		
		c1.print();
		c2.print();
			
		

	}

}
