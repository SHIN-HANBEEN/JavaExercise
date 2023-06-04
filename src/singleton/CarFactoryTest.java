package singleton;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar("mySonata");
		Car yourSonata = factory.createCar("youSonata");
		System.out.println(mySonata.toString());
		System.out.println(yourSonata.toString());
	}

}
