package quiz;

import java.util.Scanner;

// Scanner 클래스를 사용하여 숫자 3개를 입력 받는다
// 세 개 중 가장 큰 값을 구한다. 
public class Quiz3 {
	public static void main(String[] args) {
		int[] arr = new int[3];  // 입력 받은 숫자를 저장하는 배열 
		int largerInt = 0; // 배열에서 큰 값을 저장하는 변수
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + "번 째 숫자를 입력하세요.");;
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length-1; i++) {
			largerInt = arr[0];
			if (arr[i] < largerInt) {
				continue;
			} else {
				largerInt = arr[i];
			}
		}
		System.out.println("입력된 값 중 가장 큰 값은 " + largerInt + "입니다." );
	}
}
