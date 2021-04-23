package och01;
import java.util.*;

class Super{
	public Super(int view) {
		System.out.println("상위 클래스의 생성자");
	}
	public void disp() {
		System.out.println("상위 클래스의 메소드");
	}
}
//Super 클래스를 상속받은 Sub클래스
class Sub extends Super{
	public Sub(int view){
		super(view);
	}
}


public class Hello {

	public static void main(String[] args) {
		
		Sub sub = new Sub(1);
		sub.disp();
		
	}

}