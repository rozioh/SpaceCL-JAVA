package chapter6;

public class CardCompanyTest {
	public static void main(String[] args) {
		CardCompany cardCompany = CardCompany.getInstance();
		Card[] cardList = cardCompany.createCard(3);
		
		for(int i = 0; i < cardList.length; i++) {
			cardList[i].showCardInfo();
		} // end for
	} // end main
} // end class
