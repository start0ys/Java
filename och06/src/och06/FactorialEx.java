package och06;

import java.util.Scanner;

class Factorial {
	int result = 1;
	// 재귀적 함수
	void factorial(int cnt) {
		if (cnt >1) {
			result *=cnt;
			System.out.print(cnt + " * ");
			factorial(--cnt);
		}
		else {
			System.out.println(cnt);
			System.out.println("Factorial 결과는 "+result);
			return;
		}
	}
}



public class FactorialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial e = new Factorial();
		int InNum;
		System.out.println("Factorial 할 10이하의 숫자를 입력하세요 ? ");
		Scanner sc = new Scanner(System.in);
		InNum = sc.nextInt();
//		InNum = System.in.read() -'0';
		e.factorial(InNum);
	}

}
