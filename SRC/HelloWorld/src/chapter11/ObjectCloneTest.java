package chapter11;

// 원점을 의미하는 Point 클래스
class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", " + "y = " + y;
	}
} // end Point class


class Circle implements Cloneable{ // 객체복제가 가능하단 의미로 Cloneable 인터페이스를 함께 선언
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.radius = radius;
		point = new Point(x, y);
	}
	
	public String toString() {
		return "원점은 " + point + " 이고, " + "반지름은 " + radius + "입니다.";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
} // end Circle class

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
//		Circle copyCircle = circle; // Shallow Copy
		
		System.out.println(circle);
		System.out.println(copyCircle);
		// Hash 값이 다른 것은 두 개가 다른 값이다. Deep Copy
		// Deep Copy 방법
		// 1. cloneable 구현
		// 2. 재정의 
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
} // end ObjectCloneTest class
