package och08;

public class LenderableEx {

	public static void main(String[] args) {
		SeperateVolume sv = new SeperateVolume("젊은 베르테르 슬픔");
		sv.checkIn();
		sv.checkOut("둘리", "2021/04/05");
		sv.checkOut("또치", "2021/04/05");
		sv.checkIn();
		sv.checkOut("또치", "2021/04/07");

	}

}
