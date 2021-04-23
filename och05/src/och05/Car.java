package och05;


// class --> 설계도
public class Car {
	String color; // Member 변수 , 필드
	int speed;
	
	void speedUp() { //Method (영문자 또는 $로시작) 두번째부터 숫자가능
		System.out.println(speed+"속도향상");
	}
	void speedDown() { 
		System.out.println(speed+"속도저하");
	}
	
	void print() {
		System.out.println("색깔:"+color);
		System.out.println("속도"+speed);
	}
}
