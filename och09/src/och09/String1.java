package och09;

public class String1 {

	public static void main(String[] args) {
		String a1 = "Java"; //문자열 상수를 생성자에 전달해서 String 객체를 생성한 예
		String a2 = "Java";
		String a3 = new String("Java"); //String 객체에 문자열 리터럴을 저장
		String a4 = new String("java");
		System.out.println(a1+","+a2+","+" , "+a3);
		if( a1 == a2) System.out.println("a1과 a2는 같다");
		else System.out.println("a1과 a2는 다르다");
		if( a1 == a3) System.out.println("a1과 a3는 같다");
		else System.out.println("a1과 a3는 다르다");
		// string객체에서는 equals을 오버라이딩해서 값이같으면 같도록해줬음
		if(a1.equals(a2)) System.out.println("equals a1과 a2는 같다");
		else System.out.println("equals a1과 a2는 다르다");
		if(a1.equals(a3)) System.out.println("equals a1과 a3는 같다");
		else System.out.println("equals a1과 a3는 다르다");
		
		if(a1.equals(a4)) System.out.println("equals a1과 a4는 같다");
		else System.out.println("equals a1과 a4는 다르다");
		//대소문자 구별업이
		if(a1.equalsIgnoreCase(a4)) System.out.println("equals a1과 a4는 같다");
		else System.out.println("equals a1과 a4는 다르다");
		if(a3.equalsIgnoreCase(a4)) System.out.println("equals a3과 a4는 같다");
		else System.out.println("equals a3과 a4는 다르다");
	
	
	}
	

}
