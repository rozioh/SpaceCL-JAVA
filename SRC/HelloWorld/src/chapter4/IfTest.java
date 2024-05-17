package chapter4;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		1. 20세 미만 입장료 1000원
//		2. 20~40세 +1000원
//		3. 40~60세 +1000원
//		4. 65세 이상이면 할인 20%
		
//		Q1) 41세 일 때 입장료?
//		Q2) 65세 일 때 입장료?
//		Q3) 19세 일 때 입장료?
		
		Scanner sc = new Scanner(System.in); // 입력을 받는 코드
		System.out.println("나이를 입력해주세요");
		
		int price = 1000;
		int age = sc.nextInt(); // 입력받을 때까지 커서가 깜빡이면서 대기하는 코드
		
//		if(age >= 40) {
//			price = 3000;
//		}else if(age >= 20) {
//			price = 2000;
//		}else {
//			price = 1000;
//		}
		
		if(age >= 20) {
			price += 1000;
		}
		if(age > 40) {
			price += 1000;
		}
		
		if(age >= 65) {
//			price = price - (price * 20 / 100);
//			price = price - (int)(price * 0.2);
//			price = (int)(price * 0.8);
			price -= (price * 0.2);
		}
		
		System.out.println(age + "세의 입장료는 " + price + "입니다.");
	}
}
