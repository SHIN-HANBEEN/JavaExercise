package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 버퍼링 기능으로 파일 복사하기
 * */
public class Ex13 {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		
		try {

			FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("copy.txt");
			BufferedInputStream bis = new BufferedInputStream(fis); //파일입력 기반스트림을 입력받아서 버퍼링 보조스트림 생성
			BufferedOutputStream bos = new BufferedOutputStream(fos); //파일출력 기반스트림을 입력받아서 버퍼링 보조스트림 생성
			start = System.currentTimeMillis(); //복사하기 전 시간
			
			int i;
			while ((i = bis.read()) != -1) { //8kb를 한꺼번에 읽어서 복사하는 중
				bos.write(i);
			}
			end = System.currentTimeMillis(); //복사가 끝난 시간
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사하는 데 " + (end - start) + " milliseconds 소요되었습니다.");
	}
}
