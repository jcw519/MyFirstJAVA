package staticex;

public class Company {
	//유일한 인스턴스 생성, 외부에서 생성자를 통해서 생성불가
	private static Company instance = new Company();
	
	private Company() {} //compilar가 외부에서 public한 생성장 x
	
	//외부에서 해당 인스턴스를 호출할 public 한 매서드
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
