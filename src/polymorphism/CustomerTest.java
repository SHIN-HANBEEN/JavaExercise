package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerLee.bonusPoint = 1000;
		customerKim.bonusPoint = 1000;
		
		System.out.println(showCustomerInfo(customerKim));
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(showCustomerInfo(customerLee));
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.customerName + "님이 " + calcPrice(customerKim, 10000) + "원 지불하셨습니다.");
		System.out.println(customerKim.customerName + "님이 " + customerKim.calcPrice(10000) + "원 지불하셨습니다.");
		System.out.println(customerLee.customerName + "님이 " + calcPrice(customerLee, 10000) + "원 지불하셨습니다.");
		System.out.println(customerLee.customerName + "님이 " + customerLee.calcPrice(10000) + "원 지불하셨습니다.");
		
		
	}
	
	public static String showCustomerInfo(Customer customer) {
		return customer.showCustomerInfo();
	}
	
	public static int calcPrice(Customer customer, int price) {
		return customer.calcPrice(price);
	}
}
