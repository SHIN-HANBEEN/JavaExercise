package singleton;

public class CarFactory {
	private CarFactory() {}
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Car createCar(String name) {
		Car car = new Car(name);
		System.out.println("차 1대가 생성되었습니다.");
		System.out.println("차 이름 : " + car.name);
		System.out.println("차 번호 : " + car.carNum);
		return car;
	}
}
