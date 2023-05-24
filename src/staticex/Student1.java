package staticex;

public class Student1 {
	public static int serialNum = 1000;   // static 변수는 인스턴스 생성 이전에 먼저 생성한다.
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
