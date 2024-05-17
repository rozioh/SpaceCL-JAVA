package chapter2;

public class Test1 {
	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 2.0;
		System.out.println((int)(num1 + num2));
		
		System.out.println(num1 + (int)num2); // downcasting 값을 잃을 수 있다.
		
		char c = '\uAE00';
		System.out.println(c);
		
		
	}
}
