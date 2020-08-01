package cooperation;

public class Taxi {
	int taxiNumber;
	int money;
	int passengerCount;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void tak(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiNumber+"번 택시가 태운 손님은 총"+passengerCount+"명입니다.");
		System.out.println("총 수입은 "+money+"입니다");	
	}
}
