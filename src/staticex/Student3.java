package staticex;

public class Student3 {
	String name;
	int studentID;
	int studentCard;
	private static int serialNum = 1000;
	
	public Student3(String name) {
		this.name = name;
		Student3.serialNum++;
		this.studentID = Student3.serialNum;
		this.studentCard = studentID + 100;
	}

	@Override
	public String toString() {
		return "Student3 [name=" + name + ", studentID=" + studentID + ", studentCard=" + studentCard + "]";
	}
	
	
}
