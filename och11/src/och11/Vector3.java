package och11;

import java.util.Vector;

public class Vector3 {

	public static void print(Vector<String> v) {
		System.out.println(v);
		System.out.println("size : "+v.size());
		System.out.println("capacity : "+v.capacity());
	}
	
	
	
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<>(); //size가 넘어갈숬음
		v.add("1");
//		v.add(2); // String 이기때문에 String형태로만 들어와야한다. 
		v.add("3");
		v.add("4");
		v.add("5");
		v.add("6");
		v.add("7");
		v.add("8");
		v.add("9");
		v.add("10");
		v.add("11");
		v.add("12");
	
		print(v);
		
		v.trimToSize();
		System.out.println("=== After trimToSize() ===");
		print(v);
	}

}
