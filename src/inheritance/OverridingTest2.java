package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomerExtends(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
		
//		System.out.println(vc.showVIPInfo());    -> showVIPInfo 는 VIPCustomer 에 소속된 멤버 이므로, vc 는 사용할 수 없다. 
	}
	
}
