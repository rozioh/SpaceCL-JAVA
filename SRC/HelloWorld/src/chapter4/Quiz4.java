package chapter4;

import java.util.Scanner;

//p.123
public class Quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사이즈 입력: ");
		int size = sc.nextInt();
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < (size-1)-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}// end for
	} // end main
} // end class

//   *
//  ***
// *****
//*******