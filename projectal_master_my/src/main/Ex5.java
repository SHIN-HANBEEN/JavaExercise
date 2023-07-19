package main;

import java.util.Scanner;

// 함수 예제
public class Ex5 {

	public static void add(int n1, int n2) { // 함수 정의 
		int sum; // sum 은 결과를 저장하기 위한 변수이다
		sum = n1 + n2;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int num1; // num1, num2 는 정수를 저장하기 위한 변수이다. 
		int num2;
		
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();  // 정수를 입력받아 num1 에 저장한다
		num2 = scanner.nextInt();  // 정수를 입력받아 num2 에 저장한다
		
		add(num1, num2);
	}

}
