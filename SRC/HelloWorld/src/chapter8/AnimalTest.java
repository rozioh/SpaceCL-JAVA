package chapter8;

import java.util.ArrayList;

/**
 * @author ahn
 * @since 2024.05.23
 * 
 * 상위 클래스 Animal
 */
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

/**
 * Animal을 상속받은 Human 클래스
 */
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

/**
 * Animal을 상속받은 Tiger 클래스
 */
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

/**
 * Animal을 상속받은 Eagle 클래스
 */
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest{
	ArrayList<Animal> aniList = new ArrayList<Animal>(); // 배열의 자료형을 Animal
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();
	}


	public void addAnimal() {
		// ArrayList에 추가되면서 Animal형으로 형 변환
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		// 배열 요소를 Animal형으로 꺼내서 move()를 호출하면 재정의된 함수가 호출됨
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) { 	// 모든 배열 요소를 하나씩 돌면서
			Animal ani = aniList.get(i); 			// Animal형으로 가져옴
			if(ani instanceof Human) {				// Human이면
				Human h = (Human)ani;				// Human형으로 다운캐스팅
				h.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}

}


