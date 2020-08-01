package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic  = new Plastic();
		plasticPrinter.setMaterial(plastic);
		
		System.out.println(plasticPrinter);
		
		
		//meterial에 제약조건을 두는 방법
		//상위클래스를 만들어서 상속해준다.
		//GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
		
		powderPrinter.printing();
		
		plasticPrinter.printing();
		
	}

}
