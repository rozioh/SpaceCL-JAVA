package chapter11;

public class StringTest {
	public static void main(String[] args) {
		String a = "안녕";
		a = a.concat("하세요");
		
		a += " 그리고 반갑습니다.";
		System.out.println(a);
		
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		sb.append("안녕");
		sb.append("하세요");
		
		Integer number1 = Integer.valueOf("100");
	}
}
