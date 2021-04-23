package och05;

public class Car3 {
	String name; // 차 이름
	int inTime; //입고시간
	int outTime; //출고시간
	int fee; //주차요금
	final int AMPRETIME = 3000; // 시간 당 요금,변하지않는값 (상수),상수는 보통 대문자로 
	
	//생성장, Constructor
	//인스턴스 변수의 초기화 또는 인스턴스 생성시 수행할 작업에 사용
	Car3(String n,int in,int out){
		name = n;
		inTime = in;
		outTime = out;
	}
	
	void print() {
		int fee = ( outTime - inTime) * AMPRETIME;

		System.out.println("차 이름 : " +name);
		System.out.println("입고시간 : " +inTime);
		System.out.println("출고시간 : " +outTime);
		System.out.println("주차요금 : " +fee);
		System.out.println("--------------------------------");
	}
}
