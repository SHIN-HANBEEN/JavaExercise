package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex6 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/main/a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}
}
