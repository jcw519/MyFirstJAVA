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
		System.out.println(busNumber+"번 버스에 탑승한 손님은 "+ passengerCount+"명 입니다.");
		System.out.println("수입은 "+money+"입니다.");
	}
}
