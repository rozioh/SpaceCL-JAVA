package chapter12.generics;

public class GenericPrinter<T extends Material>{ // Material의 자식들만 들어갈 수 있따. 
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); // 
		
	}
	
	public static void main(String[] args) {
		GenericPrinter<Plastic> gp = new GenericPrinter<Plastic>();
//		GenericPrinter<String> gp2 = new GenericPrinter<String>(); // Material의 자식들만 들어갈 수 있따. String 안돼!
	}
}
