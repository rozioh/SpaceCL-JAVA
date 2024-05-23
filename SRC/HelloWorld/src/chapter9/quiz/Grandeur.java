package chapter9.quiz;

public class Grandeur extends Car {

	final private String CAR_NAME = "Grandeur";
	
	@Override
	void start() {
		System.out.println(CAR_NAME + " 시동을 켭니다.");
	}

	@Override
	void drive() {
		System.out.println(CAR_NAME + " 달립니다.");
	}

	@Override
	void stop() {
		System.out.println(CAR_NAME + " 멈춥니다.");
	}

	@Override
	void turnoff() {
		System.out.println(CAR_NAME + " 시동을 끕니다.");
	}

}
