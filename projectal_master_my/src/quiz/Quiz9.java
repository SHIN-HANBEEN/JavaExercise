package quiz;

// 크기가 5인 배열에서 가장 큰 값을 찾아라. 
public class Quiz9 {
	public static void main(String[] args) {
		int[] arr = {10, 5, 1, 30, 15};
		int larger = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > larger) {
				larger = arr[i];
			}
		}
		
		System.out.println("가장 큰 값은 " + larger + "입니다.");
	}
}
