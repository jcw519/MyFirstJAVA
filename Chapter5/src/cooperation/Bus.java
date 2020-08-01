package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber+"�� ������ ž���� �մ��� "+ passengerCount+"�� �Դϴ�.");
		System.out.println("������ "+money+"�Դϴ�.");
	}
}
