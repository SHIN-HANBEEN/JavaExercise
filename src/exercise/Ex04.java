package exercise;

public class Ex04 {

	public static void main(String[] args) {
		// 1부터 더했을 때 합이 500이 넘는 자연수는 얼마인가요?
		int sum = 0;
		int num;
		
		for (num = 0; ; num++) {
			sum += num;
			if (sum >= 500) {
				break;
			}
		}
		
		System.out.println("합이 500이 넘는 순간 num = " + num);
		System.out.println("합이 500이 넘는 순간 sum = " + sum);
	}

}
