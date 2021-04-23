package och16;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 파일명");
		String fileName = sc.nextLine();
		System.out.println("저장할 글을 입력하시오");
		String msg = sc.nextLine();
		//1.Open
		FileWriter fw = new FileWriter(fileName);
		Date date = new Date();
		//2. 쓸 내용 채움
		fw.write(date + " : "+msg);
		//3. File close
		fw.close();
		System.out.println("출력끝");
		sc.close();

	}

}
