package chapter4;

public class WhileExam2 {
	public static void main(String[] args) {
		final int LOOP_NUM = 10;
		int num = 1, sum = 0;
		
		do {
			sum += num;
			num++;
		}while(num <= LOOP_NUM);
		
		System.out.println("1부터 " + LOOP_NUM + "까지의 합은 " + sum + "입니다.");
		
	} // end main
} // end class
