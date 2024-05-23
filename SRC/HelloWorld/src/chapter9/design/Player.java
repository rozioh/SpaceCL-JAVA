package chapter9.design;

public class Player {
	PlayerLevel level;

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel plevel) {
		
	}
	public void play() {
		// 상속, 다형성
		Object an = new AdvancedLevel();
		PlayerLevel sl = new SuperLevel();
	}
}
