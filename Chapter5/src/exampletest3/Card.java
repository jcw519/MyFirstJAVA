package exampletest3;

public class Card {

	private static int serialNum=10000;
	private int cardNumber;
	
	public Card() {
		serialNum++;
		this.cardNumber = serialNum;
	}
	
	
	public int getCardNumber() {
		return cardNumber;
	}
	
}
