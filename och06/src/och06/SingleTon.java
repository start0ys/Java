package och06;

public class SingleTon {
	String str;
	private static SingleTon instance; // SingleTon instance  (여기까지) = new SingleTon();  static으로 공유 그래서 null아닐떄 return
	private SingleTon() { //생성자 생성자를 private로 선언해줘서 getInstance매서드를 통해서만 인스턴스화 할수있다.
		
	}
			// SingleTon 타입으로 return
	public static SingleTon getInstance() {
		//처음 사용할때는 선언한 instance가 null이다 그래서 처음 사용할떄 메모리를 할당하여 인스턴스화
		if(instance == null) instance = new SingleTon(); //여기서 마무리  메모리재사용을위해 처음에만 생성 그 후 메모리 공유
		return instance;
	}


}
