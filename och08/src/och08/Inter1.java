package och08;

//-------------------------------------------------------
//인터페이스는 		1) 양식의 역할( 큼) 함 , 
//   		    2) 다중상속 지원(극히 일부분..)
//     			3) class 와 class 를 연결 해줌 (중요)
//-------------------------------------------------------


public interface Inter1 {
	int a =3;
	void display();
	void print();
}


//인터페이스에서 상속받은 추상메서드를 무조건 서야함
class D implements Inter1{

	@Override
	public void display() {
		//a++; 값을 변경할수없음
		System.out.println("재 정의 했음 - a->"+a);
		
	}

	@Override
	public void print() {
		System.out.println("재 정의 된 Print..");
		
	}
	
}