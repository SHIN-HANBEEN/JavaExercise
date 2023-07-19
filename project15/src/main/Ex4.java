package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 파일 끝까지 읽기
 * */
public class Ex4 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("input.txt");
			int i;
			while ( (i = fis.read()) != -1){ //파일 끝에 도달하면 -1을 반환. -1을 만날때까지 반복
				System.out.println((char) i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//바이트단위 스트림의 문제점
//		try {
//			FileInputStream fis = new FileInputStream("reader.txt");
//			int i;
//			while ( (i = fis.read()) != -1){  //한글을 바이트 단위로 읽어 오면 무슨 글자인지 알수없음
//				System.out.println((char) i);
//			}
//			System.out.println("end");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
