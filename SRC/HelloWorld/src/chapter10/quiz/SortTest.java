package chapter10.quiz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortTest {
	public static void main(String[] args) throws IOException {
		Sort sort = new Bubble();
		
		List<Integer> list = new ArrayList<Integer>();
		
		// list 초기화
		list.add(10);
		list.add(3);
		list.add(7);
		list.add(1);
		list.add(5);
		
		System.out.println("현재 list 출력");
		sort.description(list);
		
		System.out.println("오름차순 출력");
		sort.acending(list); // 오름차순
		sort.description(list); // 출력
		
		System.out.println("내림차순 출력");
		sort.descending(list); // 내림차순
		sort.description(list); // 출력
	} // end main
} // end class
