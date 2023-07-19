package quiz;

// 크기가 5인 배열에 10, 5, 1, 30, 15 를 저장한다
// 가장 작은 값을 찾는다.
public class Quiz8 {
	public static void main(String[] args) {
		int[] arr = {10, 5, 1, 30, 15};
		int small = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		
		System.out.println("배열의 가장 작은 값은 " + small + " 입니다.");
	}
}
