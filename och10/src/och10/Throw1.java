package och10;

public class Throw1 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		Exception e1 = new Exception("Error만들기");
		
		try {
			throw e1;
		} catch (Exception e2) {
		
			System.out.println(e2.getMessage() + "kkk");
			
		}
		System.out.println("프로그램 정상 종료");

	}

}
