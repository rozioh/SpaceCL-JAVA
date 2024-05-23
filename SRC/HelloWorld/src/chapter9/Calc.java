package chapter9;

/**
 * @author Ahn
 * @since 2024.05.23
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
		
		// static 끼리는 서로 호출이 되는데 showResult는 아니니까 객체 생성 후에 사용해야한다.
		calc.showResult(T_PLUS, 5, 4);
		calc.showResult(T_MINUS, 5, 4);
		calc.showResult(T_MULTIPLE, 5, 4);
		calc.showResult(T_DIVIDE, 5, 4);

	} // end main

} // end class
