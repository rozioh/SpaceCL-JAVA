package chapter12.generics2;

public class Point<T, V> {
	T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
	
//	public static void main(String[] args) {
////		Point<Integer, Double> p1 = new Point<Integer, Double>(null, null);
//		Point<Integer, Double> p1 = new Point<>(900, 9.9); // 생략 가능. 값 대입 가능
//	}
}
