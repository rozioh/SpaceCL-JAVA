package chapter16;
/**
 * 스레드는 멀티로 프로그램을 실행시키기 위해 만들어진 것
 */
public class ThreadTest2 {
	public static void main(String[] args) {
		
		System.out.println("ThreadTest2 - main() 시작");
		
		for(int i = 1; i <= 10; i++) {
			PtRun run = new PtRun(i);
//			PtRun은 인터페이스를 구현할 뿐이라 run() 이 없다.
			new Thread(run).start(); // 다르다.
		}
		
		System.out.println("ThreadTest2 - main() 종료");
		
//		PtRun run = new PtRun(100);
//		Thread t = new Thread(run);
//		t.start();
//		t.start();
		
	}
}
