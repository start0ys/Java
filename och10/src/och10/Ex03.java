package och10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		FileReader reader;
		char [] buffer = new char[100];
//		String file_name = ".classpath"; //C:\Java Programming\Sources\och10\.classpath
		String file_name = "Start"; 
		try {
			reader = new FileReader(file_name);
			reader.read(buffer,0,100); // 0부터 100까지 buffer로 넣어줌
			String str = new String(buffer); //String 형태로
			System.out.println("읽은건 "+str);
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch(IOException e) {
			System.out.println("파일을 읽다가 오류가 발생하였습니다.");
		} finally {
			System.out.println("읽었습니다.");
		}
	}

}
