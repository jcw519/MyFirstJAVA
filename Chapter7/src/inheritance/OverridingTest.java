package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 10000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(priceLee);
		System.out.println(priceKim);
		
		//customerJeong의 타입은 Customer이지만 메서드는 인스턴스기준으로 후출
		Customer customerJeong = new VIPCustomer();
		customerKim.setCustomerName("정채원");
		customerKim.setCustomerID(10030);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		int priceJeong = customerJeong.calcPrice(10000);
		System.out.println(priceJeong);
	}

}
