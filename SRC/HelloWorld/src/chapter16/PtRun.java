package chapter16;

public class PtRun implements Runnable{ // Runnable을 impl하면 run() 이 필요

	private int seq;
	
	public PtRun(int seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() {
		// 실행부
		System.out.println( seq + " 쓰레드 - 시작" );
		
		try {
			// 몇 초간 나의 스레드를 잠재우는 역할
			Thread.sleep(1000); // 1초. 항상 InterruptedException이 발생하기 때문에 처리해야한다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println( seq + " 쓰레드 - 종료" );
	}

}
