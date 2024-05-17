package chapter4;
//p.123
import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수를 입력하세요: ");
		int dan = sc.nextInt();
		
		for(int i = 1; i <= dan; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		} // end for
		
	} // end main
} // end class
