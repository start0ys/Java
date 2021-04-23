package och05;

// 이것을 생성자 OverLoading이라고 한다 - 다른것도 있나봄
class Sonata{
	//기본 생성자 - 매개변수가 없는 생성자
	Sonata(){ //class와 같은 이름 = 생성자
		System.out.println("난 기본 ");
	}Sonata(int a){
		System.out.println("문의 수는 "+ a);
	}Sonata(String str){
		System.out.println("옶션 "+str);
	}
}


public class ConstrEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata(4);
		Sonata s3 = new Sonata("에어백");

	}

}
