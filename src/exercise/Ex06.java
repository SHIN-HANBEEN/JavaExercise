package exercise;

public class Ex06 {

	public static void main(String[] args) {
		// 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요. 
		int num1;
		int num2;
		
		for (num1 = 1; num1 <= 9; num1++) {
			if ((num1 % 2) != 0) {
				continue;
			}
			for (num2 = 1; num2 <= 9; num2++) {
				System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
			}
		}

	}

}
