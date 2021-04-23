package och12;

class Ra1 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i<=20;i++) {
			System.out.println(i+"대박"+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
	
}

class Ra2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i<=20;i++) {
			System.out.println(i+"금요일"+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
	
}






public class RunnableTest1 {

	public static void main(String[] args) {
		Ra1 r1 = new Ra1();
		Ra2 r2 = new Ra2();
		Thread th1 = new Thread(r1,"Pr");
		Thread th2 = new Thread(r2,"No");
		
		th1.start();
		th2.start();

	}

}
