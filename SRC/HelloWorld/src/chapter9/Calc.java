package chapter9;

/**
 * @author Ahn
 * @since 2024.05.23
 * @version 1.0
 * 
 * 추상 클래스 활용
 * CalcAhn을 상속받은 자식 클래스
 */
public class Calc extends CalcAhn {

	@Override
	public double plus(int a, int b) {
		return a + b;
	}

	@Override
	public double minus(int a, int b) {
		return a - b;
	}

	@Override
	public double multiple(int a, int b) {
		return a * b;
	}

	@Override
	public double divide(int a, int b) {
		return a / b;
	}

	@Override
	public void showResult(int type, int a, int b) {
		double result = 0;
		String sign = "";
		if(type == CalcAhn.T_PLUS) {
			result = plus(a, b);
			sign = "+";
		}else if(type == T_MINUS) {
			result = minus(a, b);
			sign = "-";
		}else if(type == T_MULTIPLE) {
			result = multiple(a, b);
			sign = "*";
		}else if(type == T_DIVIDE) {
			result = divide(a, b);
			sign = "/";
		}
		
		System.out.println(a + " " + sign + " " + b + " = " + result);
	}
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.showResult(1, 5, 4);
	} // end main

} // end class
