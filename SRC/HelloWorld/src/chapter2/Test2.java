package chapter2;

public class Test2 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(+num);
		System.out.println(-num); // 10에 -가 붙어서 -10이 출력되지만 num 값이 실제로 바뀌지는 않음
		System.out.println(num);
		
		num = -num; // num 값을 음수로 바꿔서 다시 num에 대입함.
		System.out.println(num);
	}
}
