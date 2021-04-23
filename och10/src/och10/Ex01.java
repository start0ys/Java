package och10;

public class Ex01 {
	static void method(boolean b) {
		try {
			System.out.println(1+"b-->"+b);
			if(b)throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) { //ctrl+t로 확인해보면 부모자식관계여서 상속받아서 여기서 실행
			System.out.println("RuntimeException"+"-->"+3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println("예외발생여부에 관계없이 항상 실행되는 문장"+5);
		}
		System.out.println("정상적으로 끝나야 실행되는 문장"); 
		// return이여서 메소드자체가 종료되어 실행되지않음
	}
	
	
	
	public static void main(String[] args) {
		method(true);
		method(false);
	}

}
