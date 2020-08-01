
package operator;

public class OperatorEx4 {
	public static void main(String[] args) {
		
		int num1 = 0b0000001010; //10
		int num2 = 0b0000000101; //5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		
		System.out.println(num2<<1); // num2*2^1
		System.out.println(num2<<2); // num2*2^2
		System.out.println(num2<<3); // num2*2^3
		
		
		System.out.println(num2>>1); // num2/2^1
		System.out.println(num2>>2); // num2/2^2
		System.out.println(num2>>3); // num2/2^3
	}
}
