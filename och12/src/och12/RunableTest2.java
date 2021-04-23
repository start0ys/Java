package och12;

class Ra3 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+"대박"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
	
}

class Ra4 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+"월요일"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
	
}

public class RunableTest2 {

	public static void main(String[] args) {
		Ra3 r1 = new Ra3();
		Ra4 r2 = new Ra4();
		Thread th1 = new Thread(r1,"ㅋㅋ");
		Thread th2 = new Thread(r2,"ㅠㅠ");
		th1.start();
		th2.start();

	}

}
