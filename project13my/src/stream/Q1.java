package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class TravelCustomer {
	String name;
	int age;
	int cost;

	public TravelCustomer(String name, int age, int cost) {
		super();
		this.name = name;
		this.age = age;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}

public class Q1 {

	public static void main(String[] args) {
		List<TravelCustomer> travelCustomerList = new ArrayList<TravelCustomer>();
		TravelCustomer duli = new TravelCustomer("둘리", 40, 100);
		TravelCustomer ddochi = new TravelCustomer("또치", 13, 50);
		TravelCustomer downer = new TravelCustomer("도우너", 25, 70);

		travelCustomerList.add(duli);
		travelCustomerList.add(ddochi);
		travelCustomerList.add(downer);
		
		//1.
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		travelCustomerList.stream()
			.map(c->c.getName())
			.forEach(s->System.out.println(s));
		
		//2.
		int total = travelCustomerList.stream()
				.mapToInt(c->c.getCost())
				.sum();
		System.out.println("총 여행 비용 :" + total);
		
		//3.
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		travelCustomerList.stream()
			.filter(c->c.getAge() >= 20).map(c->c.getName()).sorted()
			.forEach(s->System.out.println(s));
	}

}
