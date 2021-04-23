package och05;

public class Car3Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 c1 = new Car3("소나타",10, 14);
		Car3 c2 = new Car3("산타페",9, 20);
		Car3 c3 = new Car3("모 닝",12, 13);
		
//		c1.AMPRETIME =5000;   //AMPRETIME가 final이기때문에 변경불가 오류발생 
		
		c1.print();
		c2.print();
		c3.print();

	}

}
