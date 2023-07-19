package main;

import java.io.FileInputStream;
import java.io.IOException;

/*
 *  FileInputStream 사용하기
 *  -input.txt 없이 실행
 *  -input.txt 만들고 다시 실행
 * */
public class Ex3 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("input.txt"); //input.txt 파일과 연결된 입력스트림 생성
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());

		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close(); //열린 스트림 닫기
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e); //스트링이 생성되지 않았으므로 null에러가 발생함. 해당오류는 컴파일오류가 발생하지 않으므로 수동으로 작성할 것
			}
		}
		System.out.println("end");
	}

}
