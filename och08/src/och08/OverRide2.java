package och08;


class B1{
	void print1() {
		System.out.println("바꾸기 가능");
	}
	
	final void print2() {
		System.out.println("바꾸기 불가능");
	}
	
}

class B2 extends B1{
	@Override
	void print1() {
		System.out.println("난 자식 ");
	}
	
//	void print2() {
//		System.out.println("난 자식 ");
//	}  //final이면 불가능
	
}




public class OverRide2 {

	public static void main(String[] args) {
		B1 b1 = new B2();
		b1.print1();
		b1.print2();

	}

}
