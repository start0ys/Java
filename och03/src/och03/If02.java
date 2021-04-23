package och03;

public class If02 {

	public static void main(String[] args) {
		//(String[] args)변수를 받으라고 해주는거임
		//args - > main의 parameter,parsing Integer.parseInt(문자를 숫자로 변환)
	
		int a = Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		if ( a > 0) {
			System.out.println(a+"는 양수");
			System.out.println("월요일");
		}else {
			System.out.println(a+"는 음수");
			System.out.println("29일");
		}
		System.out.println("프로그램 종료");
		System.out.println("b ->"+b);
	}

}
