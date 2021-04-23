package och02;

public class CastExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num1 = (short) 300; //int 타입 상수 300을 short 타입으로 변환
		//short 는 2바이트
		byte num2 = (byte) 300; //int 타입 상수 300을 byte 타입으로 변환
		//byte 는 1바이트 256까지 300-256 = 44
		int num3 = (int)12.9; //double 타입 상수 12.9를 int 타입으로 변환
		
		System.out.println("num1->"+num1);
		System.out.println("num2->"+num2);
		System.out.println("num3->"+num3);

	}

}
