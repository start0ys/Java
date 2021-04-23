package exam01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:/log/test.txt");
		int reaCharNo;
		char[] cbuf = new char[100];
		while((reaCharNo=fr.read(cbuf)) != -1) {
			String data = new String (cbuf,0,reaCharNo);
			System.out.println(data);
		}
		fr.close();
	}

}
