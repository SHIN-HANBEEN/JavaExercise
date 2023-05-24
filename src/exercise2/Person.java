package exercise2;

public class Person {
	int age;
	String name;
	boolean isMarried;
	int numberOfChild;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person james = new Person();
		james.age = 40;
		james.name = "James";
		james.isMarried = true;
		james.numberOfChild =3;
		
		System.out.println(james.age);
		System.out.println(james.name);
		System.out.println(james.isMarried);
		System.out.println(james.numberOfChild);
		
	}

}
