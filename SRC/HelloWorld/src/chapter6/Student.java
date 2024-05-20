package chapter6;

public class Student {
	
	public static int serialNum = 10; // 고정된 = 전역!
	
	private String studentName; // 학생 이름
	private int grade; // 학년
	private int money; // 학생이 가지고 있는 돈
	
	// 학생 이름과 가진 돈을 매개변수로 받는 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public int takeBus(Bus bus) {
		bus.take(); // 버스 돈+
		money -= bus.CHARGE; // 학생 돈-
		return money;
	}
	
	// 학생이 지하철을 타면 1500원을 지불하는 기능을 구현한 메서드
	public int takeSubway(Subway subway) {
		subway.take();
		this.money -= subway.CHARGE;
		return money;
	}
	
	public void takeBusOff(Bus bus) {
		bus.takeOff(); // 해당 버스에서 내릴게요
	}
	
	public void takeSubwayOff(Subway subway) {
		subway.takeOff(); // 지하철 하차
	}
	
	// 학생의 현재 정보를 출력하는 메서드
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
} // end class
