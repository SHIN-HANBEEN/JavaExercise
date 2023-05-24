package reference;

public class Student3 {
	int studentID;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student3(int studentId, String studentName, Subject korean, Subject math) {
		this.studentID = studentId;
		this.studentName = studentName;
		this.korean = korean;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student3 [studentID=" + studentID + ", studentName=" + studentName + ", korean=" + korean + ", math="
				+ math + "]";
	}
	
	
}
