package och08;


//*******       추상 Class   Vs Interface 비교******
//추상 Method         하나이상         전체
//상속            extends          implements
//변수             O                  X
//상수             O                  O
//사용             기본은 유지           설계
//                확장하여 사용         표준



//추상 Class 인터페이스와 차이점 알기??
abstract class C1{
	int k ;
	public C1() {
		System.out.println("추상Class 생성자");
	}
	void setK(int k ) {
		this.k=k;
	}
	abstract void print(); // 하나이상의 추상 메소드가 존재 해야 함
}

class C2 extends C1{
	//추상 class를 상속받았기떄문에 무조건 추상 메소드를 사용해야한다 ->안하면 오류
	void print() {
		System.out.println("C2 k = "+k);
	}
}



public class OverRide3 {

	public static void main(String[] args) {
		C1 c1 = new C2();
		c1.setK(12);
		c1.print();
		C2 c2 = new C2();
		c2.setK(7);
		c2.print();      //c2,k 와 c1.k  -->각각 값이 다름
		c1.print();

	}

}
