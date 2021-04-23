package och12;
//1. interface로 상속 받음
class B1 implements Runnable{
	@Override
	public void run() {
		for (int i = 0 ; i < 5 ; i ++) {
			System.out.print(Thread.currentThread().getName() + " : "+i+"대박\t");
			if(i%5 ==0) System.out.println();
		}
		
	}
	
}

public class RunTest {
	public static void main(String[] args) {
//		1. interface로 상속 받음
		B1 b1 = new B1();
		B1 b2 = new B1();
		//2. 구현 객체를 new Thread() 로 감싸준다
		Thread th1 = new Thread(b1,"첫번째");
		Thread th2 = new Thread(b1,"두번째");
		Thread th3 = new Thread(b2,"세번째");
		Thread th4 = new Thread(b2,"네번째");
		//3 .M.I 극복 (Multiple Inheritance) 다중상속
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
