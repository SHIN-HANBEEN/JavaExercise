package main;

import java.util.ArrayList;

class Student {
	int studentId;
	String name;
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	
}

public class Quiz2 {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1001, "둘리"));
		studentList.add(new Student(1002, "또치"));
		studentList.add(new Student(1003, "도우너"));
		for (Student student : studentList) {
			System.out.println(student.studentId + "," + student.name);
		}
	}

}
