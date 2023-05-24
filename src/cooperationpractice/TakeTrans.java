package cooperationpractice;

public class TakeTrans {
	public static void main(String[] args) {
		Student james = new Student("James", 10000);
		Student thomas = new Student("Thomas", 5000);
		Student ben = new Student("Ben", 17000);
		
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway("subwayGreen");
		Taxi taxiSeoul = new Taxi("서울", "15나1701");
		
		james.takeBus(bus100);
		thomas.takeSubway(subwayGreen);
		ben.takeTaxi(taxiSeoul);
		
		james.showInfo();
		thomas.showInfo();
		ben.showInfo();
		subwayGreen.showInfo();
		taxiSeoul.showInfo();
		bus100.shoInfo();
		
	}

}
