package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader 사용하기
 * */
public class Ex11 {

	public static void main(String[] args) {

		try {
			//FileInputStream 기반스트림 + 내용이 한글일 경우
			InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt")); //기반스트림을 입력받아 보조스트림 생성
			int i;
			while ((i = isr.read()) != -1) { //보조스트림으로 읽기
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
