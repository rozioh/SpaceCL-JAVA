package chapter12;

import java.util.ArrayList;
import java.util.List;

public class GenericPrinter<T> {
	private T meterial;
	
	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
	public T getMeterial() {
		return meterial;
	}
	
	public static void main(String[] args) {
		GenericPrinter gp = new GenericPrinter<String>(); //
		gp.setMeterial(100);
		System.out.println(gp.getMeterial());
		
		List<String> list = new ArrayList<String>();
	} // end main
} // end class
