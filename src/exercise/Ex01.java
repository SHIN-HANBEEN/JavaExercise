package exercise;

public class Ex01 {

	public static void main(String[] args) {
		// 1부터 100까지 수 중에서 3의 배수만 출력하는 코드를 완성해 보세요. 
		// for 와 continue 를 사용하세요.
		
		int num;
		int sum = 0;
		
		for (num = 1; num <= 100; num ++) {
			int value = num % 3;
			
			if (value != 0) {
				continue;
			}
			sum += num;
		}
		
		System.out.println(sum);
	}

}
