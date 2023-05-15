package exercise;

public class Ex05 {

	public static void main(String[] args) {
		// operator 값이 +, -, *, / 인 경우에 사칙 연산을 수행하는 프로그램을 if-else if 문과 switch case 문을 사용해 작성해 보세요.
		int num1 = 10;
		int num2 = 2;
		int result1 = 0;
		int result2 = 0;
		char operator = '+';
		char operator1 = '+';
		
		if (operator == '+') {
			result1 = num1 + num2;
		} else if (operator == '-') {
			result1 = num1 - num2;
		} else if (operator == '*') {
			result1 = num1 * num2;
		} else if (operator == '/') {
			result1 = num1 / num2;
		}
		
		switch (operator1) {
		case '+' : 
			result2 = num1 + num2;
			break;
		case '-' : 
			result2 = num1 - num2;
			break;
		case '*' : 
			result2 = num1 * num2;
			break;
		case '/' : 
			result2 = num1 / num2;
			break;
		}
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
