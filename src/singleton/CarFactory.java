package singleton;

public class CarFactory {
	
	private CarFactory() {} // 싱글톤 패턴 생성자
	
	private static CarFactory instance = new CarFactory(); // 싱글톤 패턴 유일 인스턴스
	
	public static CarFactory getInstance() { // 싱긅톤 패턴 유일 인스턴스 getter
		return instance;
	}
	
	public Car createCar(String name) {
		Car car = new Car(name);
		return car;
	}
}
