package och11;


import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("또치", "010-2222-3333");
		ht.put("둘리", "010-3333-3333");
		ht.put("마이콜", "010-4455-3333");
	
		System.out.println("또치 TEL : "+ht.get("또치"));
		System.out.println("둘리 TEL : "+ht.get("둘리"));
		System.out.println("마이콜 TEL : "+ht.get("마이콜"));

	}

}
