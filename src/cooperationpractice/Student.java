package cooperationpractice;

public class Student {
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		this.money -= 1000;
		bus.take(1000);
	}
	
	public void takeSubway(Subway sub) {
		this.money -= 1500;
		sub.take(1500);
	}
	
	public void takeTaxi(Taxi taxi) {
		this.money -= 7000;
		taxi.take(7000);
	}
	
	public void showInfo() {
		System.out.println(this.name + "의 현재 잔액은 " + this.money + "원 입니다.");
	}
}
