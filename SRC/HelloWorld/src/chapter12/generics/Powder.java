package chapter12.generics;

public class Powder extends Material {

	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Powder입니다.";
	}

}
