package och06;

class Data{
	int kor;
	int eng;
	int math;
	// Call by Reference 참조?
	//객체를 넘겨줄때
	void addRef (Data d1 ,Data d2) {
		d1.kor = d2.eng;
		System.out.println("Method국어 점수 : "+d1.kor);
	}
	//Call by Value
	//	Primitive 자료를 넘겨줄때
	void addVal (int kor ,int eng) {
		eng = kor;
//		this.kor = kor;
//		this.eng = eng;
		System.out.println("Method영어 점수 : "+eng);
	}
}




public class DataEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
		//Call by Value
//		d1.kor = 50; // d1.kor = 70;
//		d1.addVal(50, 70);
//		System.out.println("d1 Method영어 점수 : "+d1.eng);
		
		// Call by Reference
		Data d2 = new Data();
		Data d3 = new Data();
		d1.kor  = 50; //d1.kor = 70;
		d1.math = 70; //d1.kor = 70;
		d2.eng  = 80;
		d3.addRef(d1, d2);  //Instance를 넘겨주면 주소값을 넘겨주는 효과
		System.out.println("Main 국어 점수 : "+d1.kor);
		

	}

}
