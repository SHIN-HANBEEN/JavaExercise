package quiz;

// 크기가 5인 배열에 10, 5, 1, 30, 15 를 저장한다
// 그리고 값 15가 저장된 위치를 찾는다. 
// 단 동적으로 처리 가능하도록 구현한다.
public class Quiz7 {

	public static void main(String[] args) {
		int[] arr = {10, 5, 1, 30, 15};
		int x = 30; // 찾고자 하는 값을 x 변수에 담는다. 
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				System.out.println(x + "는 " + (i+1) + "번 째에 있습니다.(배열 index : " + i + ")");
				break;
			}
		}
	}
}
