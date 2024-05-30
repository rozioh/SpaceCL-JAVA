package chapter14.exception;

public class ThrowsTest {
	public static void main(String[] args) {
		try {
			showPrint("던져");
		}catch (Exception e) {
			System.out.println("에러 발생!! 비상비상!");
			e.printStackTrace();
			throw new NullPointerException();
		}
		
	} // end main
	
	// throws 내가 처리하지 않고 던져버려
	public static void showPrint(String str) throws Exception {
		System.out.println(str);
		int a = 10;
		a = a / 0;
	}
} // end class
