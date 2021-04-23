package och12;

class Account2User extends Thread{
	Account2 act;
	boolean flag;
	public Account2User(Account2 act, String name) {
		super(name);
		this.act=act;
	}
	@Override
	public void run() {
		for (int i = 0 ; i < 4 ; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			} 
			synchronized (act) {
				if(flag) act.deposit((int)(Math.random()*10000), getName());
				else act.withdraw((int)(Math.random()*10000), getName());
				flag = !flag; //flag SWAP
			}
		}
		
	}
}

public class Account2Ex {

	public static void main(String[] args) {
		//둘리만화의 계좌
		Account2 act  = new Account2(10000);
		//짱구만화의 계좌
		Account2 act2 = new Account2(15000);
		Account2User au1 = new Account2User(act, "둘리");
		Account2User au2 = new Account2User(act, "또치");
		Account2User au3 = new Account2User(act, "마이콜");
		Account2User au4 = new Account2User(act2, "짱구");
		Account2User au5 = new Account2User(act2, "맹구");
		Account2User au6 = new Account2User(act2, "철수");
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();
		

	}

}
