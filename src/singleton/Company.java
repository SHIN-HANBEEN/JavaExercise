package singleton;

public class Company {
	int i=1;
	private Company() {}
	private static Company instance = new Company();
	
	public static Company getInstance() {
		return instance;
	}
}
