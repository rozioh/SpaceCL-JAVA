package chapter6;

public class Card {
	private int cardID;
	
	public Card(int serialNum){
		cardID = serialNum;
	}

	public void showCardInfo() {
		System.out.println("현재 카드 번호 : " + cardID);
		
	}
}
