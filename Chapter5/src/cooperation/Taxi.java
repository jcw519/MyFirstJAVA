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
		System.out.println(taxiNumber+"�� �ýð� �¿� �մ��� ��"+passengerCount+"���Դϴ�.");
		System.out.println("�� ������ "+money+"�Դϴ�");	
	}
}
