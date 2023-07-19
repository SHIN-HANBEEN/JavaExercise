package main;

import java.util.Scanner;

// Q. 변수 score에 정수를 입력 받고, score 가 70점 이상인가를 판별하여 출력한다
public class Ex3 {
	public static void main(String[] args) {
		int score; // score는 정수를 저장하기 위한 변수이다
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // 정수를 입력받아 score 에 저장한다. 
		
		if (score >= 70) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
