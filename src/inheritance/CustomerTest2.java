package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		VIPCustomerExtends customerKim = new VIPCustomerExtends(10020, "김유신", 2020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
