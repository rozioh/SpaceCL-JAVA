package chapter13;

import chapter10.Calc;

public class Anonymous {
	
	private Anonymous an = new Anonymous(); // 멤버 변수
	
	
	public static void main(String[] args) {
		Calc c = new Calc() {
			
			@Override
			public int substract(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Runnable runable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
