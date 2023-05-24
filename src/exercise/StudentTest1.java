package exercise;

public class StudentTest1 {

	public static void main(String[] args) {
	//클래스형 + 변수명 = new예약어 + 생성자
		Student student1 = new Student();
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		Student student2 = new Student();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
		
		System.out.println(student1);
		System.out.println(student2);
	}

}
