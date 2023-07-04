package main;

import java.time.Period;
import java.util.ArrayList;

class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public String eat() {
		return this.name + "가 밥을 먹는다";
	}
}

class Student2 extends Person {

	public Student2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public String study() {
		return this.name + " 학생이 공부를 한다";
	}
}

class Employee extends Person {

	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public String work() {
		return this.name + " 회사원이 일을 한다";
	}
	
}
public class Quiz4 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Student2("둘리"));
		list.add(new Employee("또치"));
		Person duli = list.get(0);
		Person ddochi = list.get(1);
		
		System.out.println(duli.eat());
		System.out.println(ddochi.eat());
		if (duli instanceof Student2) {
			Student2 duliStudent2 = (Student2)duli;
			System.out.println(duliStudent2.study());
		}
		if (ddochi instanceof Employee) {
			Employee ddochiEmployee = (Employee)ddochi;
			System.out.println(ddochiEmployee.work());
		}
	}

}
