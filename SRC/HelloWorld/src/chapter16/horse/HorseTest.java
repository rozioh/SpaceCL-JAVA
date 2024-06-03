package chapter16.horse;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class HorseTest {
	
	public static void main(String[] args) {
		Frame frm = new Frame("쓰레드 경마장");
		Canvas canvas = new Canvas();
		
		frm.setSize(400, 400);
		frm.add(canvas);
		frm.setVisible(true);
		frm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 자바 프로그램 종료
			}
		});
		
		ArrayList<Horse> moveHorse = new ArrayList<Horse>();
		
		Horse h1 = new Horse(canvas, 30, "1번말");
		Horse h2 = new Horse(canvas, 70, "2번말");
		Horse h3 = new Horse(canvas, 110, "3번말");
		Horse h4 = new Horse(canvas, 150, "4번말");
		Horse h5 = new Horse(canvas, 190, "5번말");
		Horse h6 = new Horse(canvas, 230, "6번말");
		Horse h7 = new Horse(canvas, 270, "7번말");
		
		moveHorse.add(h1);
		moveHorse.add(h2);
		moveHorse.add(h3);
		moveHorse.add(h4);
		moveHorse.add(h5);
		moveHorse.add(h6);
		moveHorse.add(h7);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		h6.start();
		h7.start();
		
		// 우승한 말을 찾아서 콘솔에 출력
		
		// 말의 등수를 체크하자
		boolean isWhile = true;
		int rank = 1;
		while(isWhile) {
			for(int i = 0; i < moveHorse.size(); i++) {
				Horse h = moveHorse.get(i);
				
				if(!h.getIsRankEnd() && h.getHorseRunRange() >= 300) {
					System.out.println(rank +"등 말은 " + h.getHorseName() + "입니다.");
					h.setIsRandEnd(true);
					rank++;
					break; // for문 탈출
				}
			} // end for
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(rank > moveHorse.size()) { // 7등 이상부터는 없기 때문에 
				isWhile = false; // while문 탈출
			}
			
		} // end while
		
		
	} // end main
}
