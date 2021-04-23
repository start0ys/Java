package och12;

import javax.swing.JOptionPane;

class C1 extends Thread {

	public void run() {
		for (int i = 1; i < 10 ; i ++ ) {
			System.out.println(i );
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class Threadtest6 {

	public static void main(String[] args) {
		C1 c = new C1();
		c.start();
		String name = JOptionPane.showInputDialog("이름을 입력해주세요");
		System.out.println("당신의 이름은"+name+"입니다");

	}

}
