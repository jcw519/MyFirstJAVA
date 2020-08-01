package exampletest3;

import staticex.Company;

public class CardCompany {

	
	
	private static CardCompany instance = new CardCompany();

	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	//생성자 매서드
	public Card createCard() {
		Card card = new Card();
		return card;
	}

	
	
}
