package interfaceex;

public interface Calc {
	double pi = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	public String stringAdd(String s1, String s2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		
		for(int i : arr) {
			total+= i;
		
		}
		
		return total;
	}
	
	
	
}