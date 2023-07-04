package lambda;

@FunctionalInterface
interface Calculator {
	int add(int arr[]);
}

public class Q2 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		
		Calculator calculator = (intArr) -> {
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				sum = sum + arr[i];
			}
			return sum;
		};
		
		System.out.println(calculator.add(arr));
	}
}
