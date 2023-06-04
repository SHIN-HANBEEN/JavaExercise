package object;

public class CafeTest {

	public static void main(String[] args) {
		// 고객 인스턴스 생성 (Customer 클래스 사용)
		Customer kim1 = new Customer("Kim1", 10000);
		Customer kim2 = new Customer("Kim2", 10000);
		Customer kim3 = new Customer("Kim3", 100000);
		// 고객 인스턴스 생성 (Customer2 클래스 사용)
		Customer2 kim4 = new Customer2("Kim4", 100000);
		//카페 인스턴스 생성 (Cafe2 클래스 사용)
		Cafe2 starCafe = new Cafe2("starCafe");
		Cafe2 beanCafe = new Cafe2("beanCafe");
		// 음료 주문 시작 (Cafe2 클래스 사용)
		kim4.buy(starCafe, Menu.Americano);
		kim4.buy(beanCafe, Menu.Latte);
		// 음료 주문 시작 (Cafe 클래스 사용)
		kim1.buy(Cafe.starCafe, Menu.Americano);
		kim1.buy(Cafe.beanCafe, Menu.Americano);
		kim2.buy(Cafe.starCafe, Menu.Latte);
		kim2.buy(Cafe.beanCafe, Menu.Latte);
		kim3.buy(Cafe.starCafe, Menu.Americano);
		kim3.buy(Cafe.starCafe, Menu.Americano);
		kim3.buy(Cafe.starCafe, Menu.Americano);
		kim3.buy(Cafe.starCafe, Menu.Americano);
		kim3.buy(Cafe.starCafe, Menu.Americano);
		kim3.buy(Cafe.starCafe, Menu.Latte);
		kim3.buy(Cafe.starCafe, Menu.Latte);
		kim3.buy(Cafe.starCafe, Menu.Latte);
		kim3.buy(Cafe.starCafe, Menu.Latte);
		kim3.buy(Cafe.beanCafe, Menu.Latte);
		kim3.buy(Cafe.beanCafe, Menu.Latte);
		kim3.buy(Cafe.beanCafe, Menu.Latte);
		kim3.buy(Cafe.beanCafe, Menu.Americano);
		
		
		System.out.println(kim1.toString());
		System.out.println(kim2.toString());
		System.out.println(kim3.toString());
		System.out.println(kim4.toString());
		System.out.println(Cafe.starCafe.toString());
		System.out.println(Cafe.beanCafe.toString());
		System.out.println(Menu.Americano.toString());
		System.out.println(Menu.Latte.toString());
		
	}

}
