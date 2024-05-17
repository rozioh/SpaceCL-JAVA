package chapter4;

public class ForExam1 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		} // end for
		
		System.out.println("1부터 10까지의 합: " + sum);
		
		// 구구단 찍기 - 중첩 for 문
		for(int dan = 2; dan <= 9; dan++) {
			for(int times = 1; times <= 9; times++) {
				int guguRes = dan * times;
				System.out.println(dan + " * " + times + " = " + (guguRes));
			}
			System.out.println("===========");
		} // end for
		
	} // end main
} // end class
