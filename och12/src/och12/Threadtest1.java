package och12;


//Thread 만드는 첫번째 방법
class A1 extends Thread{
	public A1(String str) {
		super(str);
		
	}
	@Override
	public void run() {
		for (int i =1 ; i<=30 ; i++) {
			System.out.print(getName()+i+"\t");
			if(i%10==0)System.out.println();//10번째마다 줄 바꿈
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
		}

	}
	
}

public class Threadtest1 {

	public static void main(String[] args) {
		A1 a1 = new A1("subA");
		A1 a2 = new A1("subB");
		a1.start();
		a2.start();
//		a1.run();
//		a2.run();
		for (int i =1 ; i<=30 ; i++) {
			System.out.print("Main "+i+"\t");
			if(i%10==0)System.out.println();
		}
	}

}
