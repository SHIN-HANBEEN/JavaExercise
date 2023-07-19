package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 파일 복사하기
 * */
public class Ex12 {

	public static void main(String[] args) {

		long start = 0;
		long end = 0;
		try {
			//용량이 2MB 정도되는 파일 준비하기 (예제프로젝트에서 a.txt 파일 복사)
			FileInputStream fis = new FileInputStream("a.txt"); //a.txt와 연결된 파일 입력 스트림 생성
			FileOutputStream fos = new FileOutputStream("copy.txt"); //copy.txt와 연결된 파일 출력 스트림 생성
			start = System.currentTimeMillis(); //복사하기 전 시간

			int i;
			while ((i = fis.read()) != -1) { //한문자씩 읽어서 복사하는 중
				fos.write(i);
			}
			end = System.currentTimeMillis(); //복사가 끝난 시간
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사하는 데 " + (end - start) + " milliseconds 소요되었습니다.");
	}
}
