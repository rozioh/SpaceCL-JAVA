package chapter12.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "안녕하세요?");
		map.put("BB", "저의 이름은 비비탄 입니다.");
		
		System.out.println(map.get("BB"));
		
		Iterator<String> ir = map.keySet().iterator();
		while(ir.hasNext()) { // 다음 key가 있으면
			String key = ir.next();
			String value = map.get(key);
			System.out.println(key + " " + value);
		}
	}
}
