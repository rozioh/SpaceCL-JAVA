package chapter14.exception;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
			System.out.println("예외 발생! 처리는 이쪽에서!");
			aiobe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			if(e instanceof ArithmeticException) {
				System.out.println("ArithmeticExcetion 발생");
			}else {
				System.out.println("Exception 발생");
			}
		}
		System.out.println("프로그램 종료");
	}
}
