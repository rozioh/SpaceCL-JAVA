package chapter4;
// p.123
public class Quiz2 {
	public static void main(String[] args) {
		for(int dan = 2; dan < 10; dan++) {
			if(dan % 2 != 0) 
				continue;
			for(int times = 1; times < 10; times++) {
				System.out.println(dan + " * " + times + " = " + (dan * times));
			} // end for
			System.out.println("==========");
			
			
		}
	} // end main
} // end class
