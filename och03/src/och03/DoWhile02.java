package och03;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=1,num;
		int answer = (int) (Math.random()*100)+1;// Math클라스 안에 random 메소드사용하기 메소드(클래스안의 함수)
		//random 메서드의 범위가 0.0<=random<1.0이여서 위에는 1부터 100까지 1<=random<101
		do {
			System.out.println("1~100 중 어떤 숫자일까요?");
			num = sc.nextInt();
			if(answer == num) {
				System.out.println(cnt+"번에 맞췄습니다 축하");
				break;
			}else if(answer>num) {
				System.out.println("더 큰수를 입력하세요");
			}else System.out.println("작은수를 입력하세요");
			cnt++;
		}while (true);
		sc.close();
				

	}

}
