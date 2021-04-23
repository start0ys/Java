package och08;

public interface Lenderable {
	int BORROW = 1;
	int NORMAL = 0;
	void checkOut(String borrower, String date);
	void checkIn();
}

class SeperateVolume implements Lenderable{
	String title;
	String date;
	String borrower;
	int    status; //아무런 값을 주지않으면 int는 0이다.
	
	SeperateVolume(String title){
		this.title = title;
	}
	
	
	
	@Override
	public void checkOut(String borrower, String date) {
		// NORMAL -->0 ,빌려갈수 없는 상태
		if (status != NORMAL) {
			System.out.println(borrower+"가 "+title+"을 대여 할 수 없습니다.");
			return;
		}
		this.date     =  date;
		this.borrower =  borrower;
		status        =  BORROW;
		//BORROW = 1; 안됨
	    System.out.println(borrower+"가 "+date+"일에 "+title+"을 대여했다.");
		
	}

	@Override
	public void checkIn() {
		if (status != BORROW) {
			System.out.println(title+"은 이미 반납되어있습니다.");
			return;
		}
		System.out.println(borrower+"가 "+title+"을 반납했다.");
		date     = null;
//		title    = null;
		borrower = null;
		status   = NORMAL;
	}
	
}
