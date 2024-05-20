package chapter6;

public class Card {
	private int cardID;
	
	public Card(int serialNum){
		cardID = serialNum;
	}

	public int getCardID() {
		return cardID;
	}

	public void setCardID(int cardID) {
		this.cardID = cardID;
	}
}
