package chapter13.lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(s1 + s2);
				
			}
		}.makeString(s1, s2);
//		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
//		concat2.makeString(s1, s2);
	}
}
