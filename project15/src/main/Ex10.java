package main;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter로 쓰기
 * */
public class Ex10 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("writer.txt"); // 파일이름을 입력하여 출력스트림 생성
			fw.write('A'); // 문자 하나 출력
			char buf[] = { 'B', 'C', 'D', 'E', 'F', 'G' };

			fw.write(buf); // 문자 배열 출력
			fw.write("안녕하세요"); // 문자열 출력
			fw.write(buf, 1, 2); // 문자배열 일부 출력
			fw.write("65"); // 숫자를 그대로 출력

			fw.write("\n"); // 줄바꾸기
			fw.write("반갑습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("출력이 완료되었습니다.");
	}
}
