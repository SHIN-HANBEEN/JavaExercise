package singleton;

public class Car {
	String name;
	static int serialNum=1000;
	int carNum;
	
	public Car(String name) {
		this.name = name;
		serialNum++;
		this.carNum = serialNum;
	}
	
	
}
