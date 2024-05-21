package chapter6;

public class CardCompany {
	private static int serialNum = 1000;
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {
		// 다른 객체에서 나를 new 하지 못하게 하는 방법
	}
	
	public static CardCompany getInstance() {
		if(instance == null)
			instance = new CardCompany();
		return instance;
	}
	
	public Card[] createCard(int issueNumber) {
		Card cards[] = new Card[issueNumber];
		
		for(int i = 0; i < issueNumber; i++) {	
			int serial = getCardSerial();
			Card card = new Card(serial);
			cards[i] = card;
		}
		
		return cards;
	}
	
	/**
	 * 카드 고유번호를 발급한다.
	 * @return
	 */
	private int getCardSerial() {
		return ++serialNum;
	}
	
}
