package och06;

public class SingleTonEx {

	public static void main(String[] args) {
		SingleTon st1 = SingleTon.getInstance(); //static이기떄문에 인스턴스생성없이 매서드 사용가능
		SingleTon st2 = SingleTon.getInstance();
//		SingleTon st3 = new SingleTon();
		st1.str = "시작입니다";
		System.out.println(st2.str); //공유
		if (st1 ==st2) System.out.println("같다"); //메모리가 공유됨
		else System.out.println("다르다");

	}

}
