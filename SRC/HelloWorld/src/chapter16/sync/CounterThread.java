package chapter16.sync;

public class CounterThread extends Thread {
	
	private Counter mCounter = null;
	
	
	public CounterThread(Counter mCounter) {
		this.mCounter = mCounter;
	}


	@Override
	public void run() {
		// 쓰레드 구현부
		for(int i = 0; i < 10; i++) {
			mCounter.add(i);
		}
		
	}
}
