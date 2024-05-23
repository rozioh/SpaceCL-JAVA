package chapter9;
/**
 * @author Ahn
 * @since 2024.05.23
 * 
 * 추상 클래스 활용
 * 부모 클래스
 */
public abstract class CalcAhn {
	
	public static final int T_PLUS = 0;
	public static final int T_MINUS = 1;
	public static final int T_MULTIPLE = 2;
	public static final int T_DIVIDE = 3;
	
	public abstract double plus(int a, int b);
	
	public abstract double minus(int a, int b);

	public abstract double multiple(int a, int b);
	
	public abstract double divide(int a, int b);
	
	public abstract void showResult(int type, int a, int b);
	
} // end class
