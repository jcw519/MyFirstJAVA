
package operator;

public class OperatorEx5 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		//short circuit evaluation 단락 회로 평가
		boolean value = ( (num1 = num1 + 10)<10) || ((i = i+2)<10);
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println(value);
		
		
		//삼항연산자.
		int num2 = 10;
		int num3 = 20;
		
		int max = (num2>num3)?num2:num3;
		
		System.out.println(max);
		
	}
}
