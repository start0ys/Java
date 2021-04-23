package och02;

public class ComcatExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "num"+3+4; //문자열로 시작하면 뒤에도 문자열로 인식
		String str2 = 3+4+"=num"; //숫자로 시작하면 연산 후 문자 결합시 문자열 인식
		System.out.println(str1);
		System.out.println(str2);
	}

}
