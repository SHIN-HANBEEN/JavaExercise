package object;

public class Customer {
	String name; 
	int money;
	int buyCount;
	int price;
	
	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buy(Cafe cafe, Menu menu) {
		if (menu.menuName == "Americano") {
			price = 4000;
		} else if (menu.menuName == "Latte") {
			price = 4500;
		}
		this.money -= price;
		this.buyCount++;
		menu.buy(price);
		cafe.buy(price);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", money=" + money + ", buyCount=" + buyCount + "]";
	}
	
}
