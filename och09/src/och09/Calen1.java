package och09;

import java.util.Calendar;

public class Calen1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //싱글톤이여서 이렇게 인스턴스..?
		int year     = cal.get(Calendar.YEAR);
		int month    = cal.get(Calendar.MONTH) + 1; // 0월부터
		int date     = cal.get(Calendar.DATE);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다. \n",year,month,date);
		
		int hour     = cal.get(Calendar.HOUR);
		int min      = cal.get(Calendar.MINUTE);
		int sec      = cal.get(Calendar.SECOND);
		System.out.printf("지금은 %d 시 %d 분 %d 초 입니다. \n",hour,min,sec);
		
		int day1     = cal.get(Calendar.DAY_OF_MONTH); //이번달 몇일지났는지
		int day2     = cal.get(Calendar.DAY_OF_YEAR); // 이번년도 몇일지났는지
		System.out.println(day1+" , "+day2);
	}

}
