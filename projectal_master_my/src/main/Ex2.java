package main;

import java.util.Scanner;

// Q. 변수 x 에 정수를 입력 받고, x + 5 를 연산해 변수 y에 저장한다.
public class Ex2 {

	public static void main(String[] args) {
		int x; // x는 정수를 저장하기 위한 변수이다
		int y; // y는 결과를 저장하기 위한 변수이다
		
		Scanner scanner = new Scanner(System.in);
		
		x = scanner.nextInt();
		y = x + 5;
		System.out.println(y);
	}
}

