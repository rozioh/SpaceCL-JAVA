package chapter16.sync;

public class Counter {
	private long count = 0;
	
	public synchronized void add(long value) { 
		this.count += value;
		System.out.println("valud: " + value + " count: " + count);
	}
	
	public void printLong() {
		System.out.println("count값: " + count);
	}
}
