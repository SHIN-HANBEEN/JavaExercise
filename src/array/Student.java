package array;

public class Student {
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}

	public void showStudentInfo() {
		System.out.println(this.studentID + "," + this.name);
	}
}
