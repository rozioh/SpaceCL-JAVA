package chapter13;

import chapter13.ABC.In;

public class BB {
	public static void main(String[] args) {
		ABC abc = new ABC();
		In in = abc.new In();
		
		ABC.SSSIn sssin = new ABC.SSSIn();
	}
}
