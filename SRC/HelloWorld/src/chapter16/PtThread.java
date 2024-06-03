package chapter16;

/**
 * print하는 스레드
 */
public class PtThread extends Thread {
	
	private int seq;
	
	public PtThread(int seq) {
		this.seq = seq;
	}

	// start를 하면 vm에서 자동으로 run을 실행시켜준다.
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
