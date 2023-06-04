package object;

public class Menu {
	String menuName;
	int menuSellCount;
	int money;
	public static Menu Americano = new Menu("Americano");
	public static Menu Latte = new Menu("Latte");
	
	public Menu(String menuName) {
		this.menuName = menuName;
	}
	
	public void buy(int money) {
		this.money += money;
		this.menuSellCount++;
		System.out.println(this.menuName + "이 현재까지 " + menuSellCount + "잔 팔렸습니다.");
	}


	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", menuSellCount=" + menuSellCount + ", money=" + money + "]";
	}
	
	
}
