package exercise;

public class Ex07 {

	public static void main(String[] args) {
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요
		// break 문 사용
		
		int num1;
		int num2;
		
		
		for (num1 = 1; num1 <= 9; num1++) {
			for (num2 = 1; ; num2++) {
				System.out.println(num1 + " X " + num2 + " = " + (num1 * num2) + " 입니다.");
				if (num2 >= num1) {
					break;
				}
			}
		}

	}

}
