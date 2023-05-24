package cooperationpractice;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void shoInfo() {
		System.out.println(this.busNumber + "번 버스의 승객 수는 " + this.passengerCount + "이며, 수입은 " + this.money + "원 입니다.");
	}
}
