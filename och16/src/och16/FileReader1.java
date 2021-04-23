package och16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽을 파일명을 입력");
		String fileName = sc.nextLine();
		FileReader fr = new FileReader(fileName);
		int data = 0;
		while ((data=fr.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println();
		fr.close();
		System.out.println("출력끝");
		sc.close();

	}

}
