package quiz;

import java.util.Scanner;

// Q. Scanner 클래스를 사용하여 두 숫자를 입력 받는다. 
// 첫 번째 숫자가 두 번째 숫자로 나누어 떨어지는지 확인 한다.
// 결과에 따라 '나누어 떨어짐' '나누어떨어지지않음' 을 출력한다. 
public class Quiz2 {

	public static void main(String[] args) {
		int i1;  // 입력 받을 첫 번째 수
		int i2;  // 입력 받을 두 번째 수
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 수 입력");
		i1 = scanner.nextInt();
		System.out.println("두 번째 수 입력");
		i2 = scanner.nextInt();
		
		if (i1 % i2 == 0) {
			System.out.println("나누어 떨어진다");
		} else {
			System.out.println("나누어 떨어지지 않는다.");
		}
	}
}
