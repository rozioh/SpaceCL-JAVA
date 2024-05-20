package chapter6;

public class CardCompany {
	private static int serialNum = 1000;
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null )
			instance = new CardCompany();
		return instance;
	}
	
	public Card createCard() {
		Card card = new Card(serialNum++);
		return card;
	}
	
}
