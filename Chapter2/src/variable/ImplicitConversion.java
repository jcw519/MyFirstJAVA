package variable;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum1 = 20;
		float fNum = iNum;
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;  //두번의 형번환
		
		System.out.println(dNum);
		
		
	}

}
