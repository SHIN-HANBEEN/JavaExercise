package singleton;

public class Car {
	String name;
	static int serialNum = 10000;
	int carNum;
	int carCount=0;
	
	public Car(String name) {
		serialNum++;
		this.carNum = serialNum;
		this.name = name;
		this.carCount++;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", carNum=" + carNum + ", carCount=" + carCount + "대 생성]";
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
