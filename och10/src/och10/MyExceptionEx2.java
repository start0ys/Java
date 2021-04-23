package och10;

import java.util.Scanner;

public class MyExceptionEx2 {

	public static void main(String[] args) {
		int kkk ;
		Scanner sc = new Scanner(System.in);
		for (int i=1;i<4;i++) {
			try {
				System.out.println("월급을 입력 하세요");
				kkk = Integer.parseInt(sc.nextLine());			
				if (kkk < 100) throw new MyException1();
				if (kkk > 1000) throw new MyException2();
				System.out.println("정살실행");
				
			 
			} catch (MyException1 e) {
				System.out.println("하한 급여->"+e.getMessage());
			} catch (MyException2 e) {
				System.out.println("상한 급여->"+e.getMessage());
			} finally {
				System.out.println("-----------------------");
			}
		}

	}

}
