package exercise;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
	}

}
