package chapter5;
/**
 * calc 과제
 * @author ahn
 * @since 2024.05.16
 * @version 1.0
 */
public class Calc {
	public void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	public void minus(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}
	
	public void multiple(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}
	
	public void divide(int a, int b) {
		System.out.println(a + " / " + b + " = " + ((double)a / b));
	}
	public static void main(String[] args) {
		Calc cal1 = new Calc();
		
		// add 함수를 호출 했을 때 a, b 인수값을 더한 값을 출력
		cal1.add(10, 20);
		
		// minus 함수를 호출 했을 때 a, b 인수값을 뺀 값을 출력
		cal1.minus(10, 20);
		
		// multiple 함수를 호출 했을 때 a, b 인수값을 곲한 값을 출력
		cal1.multiple(10, 20);
		
		// divide 함수를 호출 했을 때 a, b 인수값을 나눈 값을 출력
		cal1.divide(10, 20);
		
	}
}
