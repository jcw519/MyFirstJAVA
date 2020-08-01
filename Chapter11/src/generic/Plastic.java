package generic;

public class Plastic extends Meterial{
	
	public String toString() {
		return "재료는 plastic입니다";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic로 프린팅 합니다.");
		
	}
}
