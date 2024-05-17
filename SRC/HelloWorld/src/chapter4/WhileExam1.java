package chapter4;

public class WhileExam1 {
	public static void main(String[] args) {
		final int LOOP_NUM = 100; // 상수 값은 고정, 최상단
		int num = 1;
		long sum = 0;
		
		while(num <= LOOP_NUM) {
			sum += num;
			num++;
		} // end while
		
		System.out.println("1부터 " + LOOP_NUM + "까지 합: " + sum);
		
		// 1~10 홀수는 홀쑤끼리 짝수는 짝수끼리 더하기
		num = 1; // 초기화
		int oddSum = 0;
		int evenSum = 0;
		
		while(num <= LOOP_NUM) {
			if(num % 2 == 0) { // 짝수
				evenSum += num;
			}else { // 홀수
				oddSum += num;
			}
			num++;
		} // end while
		
		System.out.println("짝수의 합: " + evenSum);
		System.out.println("홀수의 합: " + oddSum);
	} // end main
} // end class
