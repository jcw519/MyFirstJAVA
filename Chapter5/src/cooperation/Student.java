package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeTaxi(Taxi taxi, int getMoney) {
		taxi.tak(getMoney);
		this.money -= getMoney;
	}
	
	
	public void showInfo() {
		System.out.println(studentName+"���� �������� "+money+"�Դϴ�.");
	}
}
