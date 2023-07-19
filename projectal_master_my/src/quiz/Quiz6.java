package quiz;

import java.util.Scanner;

// 크기가 5인 배열을 생성한다
// Scanner 클래스를 사용하여 배열에 숫자 5개를 입력받는다
// 배열에 저장된 모든 숫자의 합을 구한다 
public class Quiz6 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in); // 사용자 입력을 받은 scanner 객체
		int sum = 0; // 배열의 합을 저장할 변수 
		
		for (int i = 0; i < arr.length; i++) {
			int x = scanner.nextInt(); // x 변수는 사용자 입력값을 받는다.
			arr[i] = x; // x 변수의 값을 배열에 넣어준다. 
			sum = sum + x; // sum 에 x 를 더한다. 
		}
		
		System.out.println(sum);
	}
}
