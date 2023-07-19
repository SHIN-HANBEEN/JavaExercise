package main;

import java.io.File;
import java.io.IOException;

/*
 * File 클래스 테스트하기
 * */
public class Ex14 {

	public static void main(String[] args) throws IOException {
		// newFile.txt와 연결된 파일 클래스 생성. 파일을 다루기 위한 클래스를 생성하 것이지 파일을 생성한 것이 아님
		File file = new File("C:\\Users\\yoyt1\\newFile.txt");
		file.createNewFile(); //실제 파일 생성

		System.out.println(file.isFile()); //파일 속성 보기
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());

		file.delete(); //파일 삭제
	}
}
