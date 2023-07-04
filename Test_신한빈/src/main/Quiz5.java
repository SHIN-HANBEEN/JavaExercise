package main;

import java.util.ArrayList;

abstract class Animal {
	abstract String move();
	abstract String sleep();
}

class Human extends Animal {

	@Override
	String move() {
		return "사람이 두 발로 걷습니다.";
	}

	@Override
	String sleep() {
		return "밤에는 잠을 잡니다";
	}
	
	public String read() {
		return "사람이 책을 읽습니다";
	}
}

class Tiger extends Animal {

	@Override
	String move() {
		return "호랑이가 네 발로 뜁니다.";
	}

	@Override
	String sleep() {
		return "밤에는 잠을 잡니다";
	}
	
	public String hunt() {
		return "호랑이가 사냥을 합니다";
	}
}

public class Quiz5 {

	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<>();
		list.add(new Human());
		list.add(new Tiger());
		Animal human = list.get(0);
		Animal tiger = list.get(1);
		
		System.out.println(human.move());
		System.out.println(human.sleep());
		if (human instanceof Human) {
			Human human2 = (Human)human;
			System.out.println(human2.read());
		}
		
		System.out.println(tiger.move());
		System.out.println(tiger.sleep());
		if (tiger instanceof Tiger) {
			Tiger tiger2 = (Tiger)tiger;
			System.out.println(tiger2.hunt());
		}
		
	}

}
