package exercise;

public class Ex02 {

	public static void main(String[] args) {
		// 0부터 1씩 증가하는 숫자들의 합을 계산하여 100이 넘는 순간을 알아내라
		int num;
		int sum =0;
		
		for (num = 1; ; num++) {
			sum += num;
			
			if (sum >= 100) {
				break;
			}
		}
		
		System.out.println("num = " + num);
		System.out.println("sum = " + sum);
		
	}

}
