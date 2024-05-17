package chapter7;

public class Triangle {
	public static void main(String[] args) {
		int a = 0;
		int b[]; // 배열 변수만 선언
		b = new int[10]; // 실제 배열 할당
//		b = {1, 2, 3};
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		
		long ll[] = new long[5];
		
		int[] studentIDs = new int[10];
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] 값: " + b[i]);
		} // end for
		
		int c[] = {1, 2, 3}; // c 배열에 초기화와 동시에 값 셋팅
		for(int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "] 값: " + c[i]);
		}
	} // end main
} // end class
