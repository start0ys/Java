package och06;

class Account {
	String accountNo; //계좌번호
	String ownerName; //계좌 주
	int balance; //잔액
	
	//저축
	void deposit() {
		balance += 1000;
	}
	//인출
	void withdraw() {
		balance -= 1000;
	}
	//잔액 전달
	int getBal() {
		return balance;
	}
}


public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1 = new Account();
		ac1.accountNo = "국민-222-333";
		ac1.ownerName = "홍길동";
		ac1.balance = 5000;
		
		for (int i = 0; i < 3; i++ ) {
			ac1.deposit(); //저축
		}
		System.out.println(ac1.ownerName+" 잔액 : " + ac1.getBal());
		
		for (int i = 0; i < 3; i++ ) {
			ac1.withdraw(); //인출
		}
		System.out.println("성명 : "+ac1.ownerName+" 계좌 : "+ac1.accountNo+" 잔액 : "+ ac1.getBal());
		
		System.out.println("------------------------------");
		Account ac2 = new Account();
		ac2.accountNo = "신한-222-333";
		ac2.ownerName = "이순신";
		ac2.balance = 10000;
		
		for (int i = 0; i < 3; i++ ) {
			ac2.deposit(); //저축
		}
		System.out.println(ac2.ownerName+" 잔액 : " + ac2.getBal());
		
		for (int i = 0; i < 3; i++ ) {
			ac2.withdraw(); //인출
		}
		System.out.println("성명 : "+ac2.ownerName+" 계좌 : "+ac2.accountNo+" 잔액 : "+ ac2.getBal());
		
		
	}

}
