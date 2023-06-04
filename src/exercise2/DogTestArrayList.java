package exercise2;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog("산들이", "파티푸들"));
		dogList.add(new Dog("구름이", "진도개"));
		dogList.add(new Dog("강아지1", "시츄"));
		dogList.add(new Dog("강아지2", "달마시안"));
		dogList.add(new Dog("강아지3", "페르시안"));
		
		for (int i = 0; i < dogList.size(); i++) {
			System.out.println(dogList.get(i).showDogInfo());
		}
	}

}
