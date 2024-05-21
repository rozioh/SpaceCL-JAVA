package chapter7;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50, 60};
		int[] array2 = {1, 2, 3, 4};
		
		System.arraycopy(array1, 0, array2, 1, 3);
		
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	} // end main
} // end class
