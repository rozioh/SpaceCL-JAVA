package chapter2;

public class Variable1 {

	public static void main(String[] args) {
//		final int level = 10;
		byte level;
//		level = -129;
		
		short num = 32767;
		int intnum1 = 2147483647;
		int intnum2 = intnum1 * num; // 버그
		
//		System.out.println(intnum2);
		
		float fnum1 = 0.00001f; // 실수형에는 f를 써야한다.
		double dnum1 = 0.00001;
		
		long longnum1 = 10l;
		
//		int plusInt1 = intnum1 + longnum1; // Type mismatch: cannot convert from long to int
//		System.out.println(plusInt1);
		
//		float plusfd1 = fnum1 + dnum1; // Type mismatch: cannot convert from double to float
		
		char ch1 = 'A';
		char ch2 = '한';
		String str1 = "안녕하세요";
		
//		System.out.println(str1 + ch1 + ch2); 
		
		int ch4 = 200;
//		System.out.println((byte)ch4);
		
		boolean b1 = true; // 전기신호 on == 1
		boolean b2 = false; // off == 0
		boolean b3 = !b1;
		boolean b4 = !!b3;
		
		System.out.println(b3 + " " +  b4);
//		var i = 10;
		
	}

}
