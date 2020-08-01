package customer;

public class GOLDCustomer extends Customer {

	private double salesRatio;
	
	
	public GOLDCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		salesRatio = 0.1;
		bonusRatio = 0.02;	
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*salesRatio);
	}

	
	
	
	
	
}
