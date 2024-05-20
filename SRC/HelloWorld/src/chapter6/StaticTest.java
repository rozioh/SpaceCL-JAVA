package chapter6;

import java.util.Arrays;

public class StaticTest {
	private int number;
	private static int staticNumber;
	
	public static void main(String[] args) {
		System.out.println("static class");
		
		System.out.println(Arrays.toString(args));
		
//		number = 200;
		
//		new StaticTest().number = 200;
		
		StaticTest st1 = new StaticTest();
		st1.number = 200;
		
		st1.staticNumber = 600; // 추천하지 않는다.
		StaticTest.staticNumber = 600; // 클래스명.static접근
		
		
		
		staticNumber = 500;
	}
	
	public int getNumber() {
		return this.number;
	}
	

}
