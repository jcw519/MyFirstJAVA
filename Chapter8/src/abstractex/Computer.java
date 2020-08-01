package abstractex;

public abstract class Computer {
	
	//추상 클래스는 보통 상위 클래스에서 선언됨
	
	
	public abstract void display(); //하위 클래스에서 메써드가 구현
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
}
