package och07;

class B1{
	int a =7;
	int b =8;
	void display() {
		System.out.println("B1 대박 ");
	}
	void print() {
		System.out.println("B1 난 부모 print 메소드");
	}
}

class B2 extends B1{
	int a =10;
	
	
	void print() {
		super.print(); // 부모 Method 찾기
		System.out.println("B2 부모멤버  a = "+super.a);
		System.out.println("B2 난 자식 메소드 a = "+a);//this가 생략된것으로 봄
		System.out.println("B2 난 자식 메소드 b = "+b); //나에게 b가없으므로 부모의 b를 가져옴
		System.out.println("========================================="); 
	}
}

public class Super1 {

	public static void main(String[] args) {
		B2 b = new B2();
		b.print();
		b.display(); //자식에 diplay가 없으므로 부모 diplay를 가져옴

	}

}
