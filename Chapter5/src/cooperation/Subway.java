package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber+"호선 지하철에 탑승한 손님은 "+ passengerCount+"명 입니다.");
		System.out.println("수입은 "+money+"입니다.");
	}
}
