package och16;

import java.io.File;

public class Dir1 {

	public static void main(String[] args) {
		//현재 위치
//		File file = new File("."); // .. 은 부모 폴더로 이동 
		//이것은 cmd 에서 cd C:\Java Programming\Sources\och16 을 하고
		//cd .. 를 하면 부모님 폴더로 가게되고 cd. 현재 나의 폴더로 가게된다.
		
//		File file = new File("src/och16/");
		File file = new File("../och12/src/och12"); //부모 폴더로 간다음 고르기
		String [] list = file.list();
		for (String str : list) {
			System.out.println(str);
		}

	}

}
