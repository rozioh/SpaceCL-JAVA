package chapter4;

public class BreakExample1 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; sum < 100; num++) {
			sum += num;
		} // end for
		System.out.println("num: " + num);
		System.out.println("sum: " + sum);
	} // end main
} // end class
