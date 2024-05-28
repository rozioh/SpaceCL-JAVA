package chapter12.generics2;

public class Shape<T> {
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		return 0;
	}
	
	// 호출
	public static void main(String[] args) {
		
		Shape<String> sp = new Shape<String>();
		
		Point<Integer, Double> p1 = new Point<>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double dd = Shape.makeRectangle(p1, p2);
		System.out.println(dd);
		
	}
}
