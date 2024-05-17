package chapter3;

public class Operator {
	public static void main(String[] args) {
		int num = 0;
		System.out.println(++num);
		int num2 = 10;
		
		int num3 = num + num2 + num2;
		
		int num4 = (5 > 3) ? 1 : 0;
		
		int num5 = 5 % 3;
		System.out.println(num5);
		
		if (5 < 3 || (4 < 3 && 5 > 3)) {
			System.out.println("실행");
		}
		
		int num7 = 9;
		num7 += num3;
		System.out.println(num7);
	}
}