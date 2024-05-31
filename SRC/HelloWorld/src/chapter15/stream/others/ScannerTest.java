package chapter15.stream.others;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름");
		String name = scanner.nextLine(); // 엔터 칠때까지의 값을 읽어온다.
		
		System.out.println("직업");
		String job = scanner.nextLine();
		
		System.out.println("사번");
		int num = scanner.nextInt();
		
		System.out.println("이름: " + name);
		System.out.println("직업: " + job);
		System.out.println("사번: " + num);
		
		scanner.close();
	}
}
