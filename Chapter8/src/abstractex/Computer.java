package abstractex;

public abstract class Computer {
	
	//�߻� Ŭ������ ���� ���� Ŭ�������� �����
	
	
	public abstract void display(); //���� Ŭ�������� �޽�尡 ����
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
}
