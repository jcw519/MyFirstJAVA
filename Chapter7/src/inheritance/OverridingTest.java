package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 10000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(priceLee);
		System.out.println(priceKim);
		
		//customerJeong�� Ÿ���� Customer������ �޼���� �ν��Ͻ��������� ����
		Customer customerJeong = new VIPCustomer();
		customerKim.setCustomerName("��ä��");
		customerKim.setCustomerID(10030);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		int priceJeong = customerJeong.calcPrice(10000);
		System.out.println(priceJeong);
	}

}
