package cooperationpractice;

public class Taxi {
	int money;
	int passengerCount;
	String taxiRegion;
	String taxiName;
	
	public Taxi(String taxiRegion, String taxiName) {
		this.taxiRegion = taxiRegion;
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(taxiRegion + " " + taxiName + "의 승객 수는 " + passengerCount + "이며, 수입은 " + this.money + "원 입니다.");
	}
}
