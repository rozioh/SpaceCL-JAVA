package chapter6;

public class Bus {
	private int busNumber; // 버스 번호
	private int passengerCount; // 승객 수
	private int money; // 버스 수입
	public final int CHARGE; // 버스 요금
	
	// 버스 번호를 매개변수로 받는 생성자
	public Bus(int busNumber, int charge) {
		this.busNumber = busNumber;
		this.CHARGE = charge;
	}
	
	/**
	 * 버스요금을 받아서 money(수익)을 증가 시키겠다.
	 */
	// 승객이 버스에 탄 경우를 구현한 메서드
	public int take() {
		this.money += CHARGE;
		passengerCount += 1;
		return CHARGE;
	}
	
	
	/**
	 * 몇 명이 내렸는지 카운트 세는 메서드
	 * 단 0이하 일때는 마이너스로 표기하지 않는다.
	 * @param passengerCount
	 */
	public void takeOff() {
		if(passengerCount > 0) {
			passengerCount -= 1;
		}
	}
	
	// 버스 정보를 출력하는 메서드
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}
