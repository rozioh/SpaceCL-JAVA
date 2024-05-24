package chapter10.quiz;

import java.util.List;

public interface Sort {
	// 오름차순
	public List<Integer> acending(List<Integer> list);
	
	// 내림차순
	public List<Integer> descending(List<Integer> list);
	
	// 출력
	public void description(List<Integer> list);
}
