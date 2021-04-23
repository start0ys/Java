package och10;

public class Throws3 {
	static void method1() throws Exception{
		System.out.println("예외처리 method1");
		method2();
	}
	static void method2() throws Exception{ //에러발생하면 나를 호출한곳에서 에러처리해라
		System.out.println("예외처리 method2");
		throw new Exception("method2 error 발생 ..."); //오류발생
	}
	
	
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 예외처리 "+e.getMessage());
		}

	}

}
