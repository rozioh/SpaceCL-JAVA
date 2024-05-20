package chapter6;

public class Subway {
	private String lineNumber; // 지하철 노선
	private int passengerCount; // 승객 수
	private int money; // 수입액
	public final int CHARGE;
	
	// 지하철 노선 번호를 매개변수로 받는 생성자
	public Subway(String lineNumber, int charge) {
		this.lineNumber = lineNumber;
		this.CHARGE = charge; // 상수 초기화
	}
	
	/**
	 * 지하철 탑승 + 수익 계산
	 */
	// 승객이 지하철에 탄 경우를 구현한 메서드
	public int take() {
		this.money += CHARGE; // 수입 증가
		passengerCount += 1; // 승객 수 증가
		return CHARGE;
	}
	
	public int takeOff(int psgCnt) {
		if(passengerCount - psgCnt > 0) {
			passengerCount -= psgCnt;
		}else {
			passengerCount = 0;
		}
		return passengerCount; 
	}
	// 지하철 정보 출력하는 메서드
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
} // end class
