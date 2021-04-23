package och11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("또치", "010-2222-3333");
		hm.put("둘리", "010-3333-3333");
		hm.put("마이콜", "010-4455-3333");
	
		System.out.println("또치 TEL : "+hm.get("또치"));
		System.out.println("둘리 TEL : "+hm.get("둘리"));
		System.out.println("마이콜 TEL : "+hm.get("마이콜"));
		
		Set<String> st = hm.keySet();
		for(String str : st) {
			System.out.println(str+"의 전화 [Set]-->"+hm.get(str));
		}
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+"의 전화 "+hm.get(key));
		}
	}

}
