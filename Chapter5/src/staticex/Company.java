package staticex;

public class Company {
	//������ �ν��Ͻ� ����, �ܺο��� �����ڸ� ���ؼ� �����Ұ�
	private static Company instance = new Company();
	
	private Company() {} //compilar�� �ܺο��� public�� ������ x
	
	//�ܺο��� �ش� �ν��Ͻ��� ȣ���� public �� �ż���
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
