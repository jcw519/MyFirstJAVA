package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}
	
	//template method
	//프레임워크의 형태
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	//final 예약어
	//final 메서드는 하위 클래스에서 재정의 (overriding)할 수 없음
	//final 클래스는 더 이상 상속되지 않음
	//ex) java의 String클래스
	
}
