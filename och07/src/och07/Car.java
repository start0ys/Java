package och07;

public class Car {
	String kind;
	Engine eg;
	//Engine 객체를 넣는다는것은 Engine eg가 인스턴스화 되어있을때 가능
	Car (String kind, Engine eg){
		this.kind = kind;
		this.eg = eg;
	}
	void print() {
		System.out.println("종류 : "+kind);
		eg.print();
		System.out.println("============");
	}
	public static void main(String[] args) {
		Engine eg = new Engine("알파엔진", 2000);
		Engine eg2 = new Engine("베타엔진", 3000);
		// Car 객체에 Engine객체가 들어가기때문에 무조건 Engine먼저 인스턴스화해야한다
		Car[] c =new Car[3];
		c[0] = new Car("소나타",eg);
		c[1] = new Car("모 닝",eg);
		c[2] = new Car("벤 츠",eg2);
		for (Car c1 : c) {
			c1.print();
		}

	}

}
