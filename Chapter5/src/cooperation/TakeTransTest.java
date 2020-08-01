package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("정채원", 10000);
		Student studentL = new Student("이효근", 20000);
		Student studentE = new Student("Edward", 45000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		
		Subway subwayGreen = new Subway(2);
		
		Taxi taxi4885 = new Taxi(4885);
		
		studentJ.showInfo();
		studentL.showInfo();
		studentE.showInfo();
		
		studentJ.takeBus(bus100);
		studentL.takeBus(bus100);
		studentE.takeTaxi(taxi4885, 10000);
		
		bus100.showBusInfo();
		bus200.showBusInfo();
		subwayGreen.showSubwayInfo();
		
		studentE.showInfo();
		taxi4885.showTaxiInfo();
		
		
	}

}
