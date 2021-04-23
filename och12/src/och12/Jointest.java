package och12;

import java.util.ArrayList;

class Before extends Thread{
	Before(String str){
		super(str);
	}
	void addCar() {
		System.out.println("addCar");
		Jointest.carList.add("벤츠");
		Jointest.carList.add("아우디");
		Jointest.carList.add("SM7");
		Jointest.carList.add("포르쉐");
	}
	public void run() {
		System.out.println(getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
//			e.printStackTrace();
		}
		addCar();
	}
}
class After extends Thread{
	After(String str){
		super(str);
	}
	public void run() {
		System.out.println(getName());
		for(String car :  Jointest.carList) {
			System.out.println(car);
		}
	}
}

//순차적으로 실행 필요시...
public class Jointest {
	public static ArrayList<String> carList = new ArrayList<>(); 
	public static void main(String[] args) {
		Before bf = new Before("우선");
		After  af = new After("나중에");
		bf.start();
		try {
			bf.join();// 자신을 실행시키고 자신이 끝날때까지 기다리게 하는것
		} catch (InterruptedException e) {
			// TODO: handle exception
//			e.printStackTrace();
		}
		af.start();

	}

}
