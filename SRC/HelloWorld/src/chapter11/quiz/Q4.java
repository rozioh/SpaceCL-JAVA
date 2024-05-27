package chapter11.quiz;

class MyDog {
	String name;
	String type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type + " " + name;
	}
	
} // end MyDog Class

public class Q4 {
	public static void main(String[] args) {
		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog); // toString 메서드가 출력된다.
	} // end main
} // end class
