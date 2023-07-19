package main;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 파일에 한 바이트씩 출력하기
 * */
public class Ex6 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("output.txt"); //output.txt 파일 이름으로 파일출력스트림 생성
			fos.write(65);  //A. 파일에 숫자를 쓰면 해당 아스키코드 값으로 변환됨.
			fos.write(66);  //B
			fos.write(67);  //C
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
	//프로그램을 실행하고 프로젝트를 새로고침하여 파일이 생겼는지 확인 (Refresh 메뉴 또는 F5키) 
}
