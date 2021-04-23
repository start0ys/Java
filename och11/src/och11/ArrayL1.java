package och11;

import java.util.ArrayList;

public class ArrayL1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("구렁2");
		al.add("팔렁이");
		al.add("구렁2");
		al.add("구렁4");
		al.add("구렁3");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("==============================");
		for (String str : al) {
			System.out.println(str);
		}
	}

}
