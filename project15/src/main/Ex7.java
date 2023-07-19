package main;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 파일에 바이트배열로 출력하기 (1)
 * */
public class Ex7 {

	public static void main(String[] args) throws IOException {
		
		try{
			FileOutputStream fos = new FileOutputStream("output2.txt",true); //append속성을 참으로 설정하였으므로 다시 똑같은 코드를 수행하면 기존파일에 내용이 추가됨
			byte[] bs = new byte[26];
			byte data = 65;        //'A'의 아스키 값
			for(int i = 0; i < bs.length; i++){  // A-Z 배열에 넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs);  //배열을 한번에 출력
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		//프로그램을 실행하고 프로젝트를 새로고침하여 파일이 생겼는지 확인
	}
}
