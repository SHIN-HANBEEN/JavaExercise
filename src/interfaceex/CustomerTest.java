package interfaceex;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order(); // 가상 메서드 발생
		
		Sell seller = customer;
		seller.sell();
		seller.order();  // 가상 메서드 발생
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
			customer2.order();
		}
	}
}
