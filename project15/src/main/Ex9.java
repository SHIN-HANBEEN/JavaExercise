package main;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader로 읽기
 * */
public class Ex9 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("reader.txt"); // 파일이름을 입력받아 입력스트림 생성
			int i;
			while ((i = fr.read()) != -1) { // 한글이 제대로 읽힘
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
