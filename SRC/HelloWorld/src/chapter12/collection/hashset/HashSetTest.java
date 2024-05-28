package chapter12.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("임정순");
		set.add("홍길동");
		set.add("임정순");
		set.add("홍길동");
		set.add("호오");
		
		System.out.println(set);
	} // end main
} // end class
