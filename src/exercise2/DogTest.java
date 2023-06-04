package exercise2;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogList = new Dog[5];
		dogList[0] = new Dog("산들이", "파티푸들");
		dogList[1] = new Dog("구름이", "진도개");
		dogList[2] = new Dog("강아지1", "시츄");
		dogList[3] = new Dog("강아지2", "달마시안");
		dogList[4] = new Dog("강아지3", "페르시안");
		
		for (int i = 0; i < 5; i++) {	
			System.out.println(dogList[i].showDogInfo());
		}
	}

}
