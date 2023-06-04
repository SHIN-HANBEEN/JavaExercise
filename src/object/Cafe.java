package object;

public class Cafe {
	String name;
	int money;
	int sellCount;
	public static Cafe starCafe = new Cafe("starCafe");
	public static Cafe beanCafe = new Cafe("beanCafe");

	
	public Cafe(String name) {
		this.name = name;
	}
	
	public void buy(int money) {
		sellCount++;
		this.money += money;
	}

	@Override
	public String toString() {
		return "Cafe [name=" + name + ", money=" + money + " sellCount=" + sellCount + "]";
	}
	
	
}
