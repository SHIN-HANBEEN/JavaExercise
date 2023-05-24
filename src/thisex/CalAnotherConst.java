package thisex;

class Person {
	String name;
	int age;
	
	public Person() {
		this("이름 없음", 1); // >>>>> Person(String, int) 생성자 호출 이다!
		System.out.println("안녕하세요");
	}
    
    Person returnItSelf() { // >>>>> this 반환할 때 반환형은 자기자신 클래스형!
    	return this; // >>>>> this 반환 
    }

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CalAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
        
        Person p = noName.returnItSelf( );
        System.out.println(p);
        System.out.println(noName);
	}
}