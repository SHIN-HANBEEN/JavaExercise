package main;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * byte 배열로 읽기
 * -input2.txt 만들고 실행
 * */
public class Ex5 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("input2.txt");
			byte[] bs = new byte[10];
			int i; //read는 읽어 들인 바이트 수를 반환
			while ((i = fis.read(bs)) != -1) { //배열 크기만큼 문자를 읽어서 bs배열에 저장
				for (int k = 0; k < i; k++) {
					System.out.print((char) bs[k]); //읽은 크기만큼 배열요소를 출력
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
