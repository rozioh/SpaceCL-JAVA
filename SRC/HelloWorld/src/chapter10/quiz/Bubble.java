package chapter10.quiz;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bubble implements Sort {

	@Override
	public List<Integer> acending(List<Integer> list) {
		Collections.sort(list);
//		list.sort(Comparator.naturalOrder());
		return list;
	}

	@Override
	public List<Integer> descending(List<Integer> list) {
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
			
		});
//		list.sort(Comparator.reverseOrder());
		return list;
	}

	@Override
	public void description(List<Integer> list) {
		for(Integer l : list) {
			System.out.print(l + " ");
		}
		System.out.println();

	}

} // end class
