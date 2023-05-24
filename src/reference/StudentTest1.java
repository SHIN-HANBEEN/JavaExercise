package reference;

public class StudentTest1 {

	public static void main(String[] args) {
		Subject math = new Subject("math", 80);
		Subject korean = new Subject("korean", 75);
		Student3 kim = new Student3(2011102546, "Kim Byungsun", korean, math);
		System.out.println(kim.toString());
		
		Student3 kim2 = new Student3(2011102546, "Kim2 Byungsun", korean, math); //korean 과 math 는 kim 과 kim2 가 동일하므로 해당 참조변수를 그대로 상요하면 된다.
		System.out.println(kim2.toString());
		
		Subject math2 = new Subject("math", 70);
		Subject korean2 = new Subject("korean", 75);
		Student3 kim3 = new Student3(2011102546, "Kim3 Byungsun", korean2, math2);
		System.out.println(kim3.toString());
	}

}
