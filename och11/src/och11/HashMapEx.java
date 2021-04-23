package och11;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		//       Key  , Value
		HashMap<String, String> hm = new HashMap<>();
		hm.put("또치", "010-2222-3333");
		hm.put("둘리", "010-3333-3333");
		hm.put("마이콜", "010-4455-3333");
		hm.put("둘리", "010-3456-7890");
		hm.put("둘리2", "010-3456-7890");
		System.out.println("또치 TEL : "+hm.get("또치"));
		System.out.println("둘리 TEL : "+hm.get("둘리"));
		System.out.println("마이콜 TEL : "+hm.get("마이콜"));
		System.out.println("둘리2 TEL : "+hm.get("둘리2"));
	}

}
