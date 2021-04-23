package och05;

public class CarEx {

	public static void main(String[] args) {
		//선언            생성
		Car myCar = new Car(); //Car.java파일에 Class //인스턴스
		Car youCar = new Car();
		myCar.color = "블루";
		myCar.speed = 200;
		myCar.speedUp();
		myCar.speedDown();
		myCar.print();
		System.out.println("---------------------");
		youCar.color ="빨가";
		youCar.speed = 120;
		youCar.speedUp();
		youCar.speedDown();
		youCar.print();

	}

}
