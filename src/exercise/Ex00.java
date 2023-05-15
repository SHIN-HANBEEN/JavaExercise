package exercise;

public class Ex00 {

	public static void main(String[] args) {
		// 1부터 100까지 수를 더할 때 홀수일 때만 더하고 짝수일 때는 더하지 않는 프로그램을 작성해보자
		int num = 0;
		int sum = 0;
		
		for (num = 1; num <= 100; num++) {
			int numDividedBy2 = num % 2;
			if (numDividedBy2 == 0) {continue;}
			sum += num;
		}
		
		System.out.println(sum);
	}

}
