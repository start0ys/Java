package exam;

public interface MyInterface {
	public void method1();
//	public void method2() {
//		
//	} //원래 오류
	
	public default void method2() {
		System.out.println("MyInterface method2 실행");
	} //자바 8 에서 추가된 기능 (디폴트 메소드)
}
