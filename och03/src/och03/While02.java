package och03;

import java.io.IOException;

public class While02 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단은?");
//		int num = System.in.read(); 1을 넣으면 아스키코드값이나와서 1의 아스키코드 49가나옴
		int num = System.in.read()-'0'; //문자열 0이 아스키코드 48이여서 48을 뺴주면됨
		System.out.println("num ->"+num);
		
		int i =1;
		if ( num >= 2 && num <= 20) {
			while ( i<=9) {
				System.out.println(num+ " * " + i+" = "+num*i);
				i++;
			}
		}
		else {
			System.out.println("구구단에 없는숫자입니다.");
		}
	}

}
