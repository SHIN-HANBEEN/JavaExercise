package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex7 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/main/a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			if (fis !=  null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e);
				}
				System.out.println("사용한 리소스를 닫았습니다. ");
			}
		}
	}
}