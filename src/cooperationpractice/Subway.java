package cooperationpractice;

public class Subway {
	String subwayName;
	int passengerCount;
	int money;
	
	public Subway(String subwayName) {
		this.subwayName = subwayName;
	}

	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(this.subwayName + "의 승객 수는 " + passengerCount + "이며, 수입은 " + money + "원 입니다.");
	}
}
