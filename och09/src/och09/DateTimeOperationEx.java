package och09;

import java.time.LocalDateTime;

public class DateTimeOperationEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 : "+now);
		LocalDateTime targeDateTime = now.plusYears(3).minusMonths(2);
		System.out.println("연산후 : "+targeDateTime);

	}

}
