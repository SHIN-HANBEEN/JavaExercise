package object;

public class Cafe2 {
	String name;
	int money;
	int sellCount;

	
	public Cafe2(String name) {
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
