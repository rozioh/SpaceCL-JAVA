package chapter10;

public interface Calc2 extends Calc{
	final double PI = 3.14;
	final int ERROR = -999999;
	
	int times(int a, int b);
	int divide(int a, int b);
	void calcP(Calc c);
}
