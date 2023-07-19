package main;

// 크기가 3인 배열을 생성하고 1, 2, 3 을 저장한다. 
// 그리고 배열의 두 번째 요소를 출력한다. 
public class Ex6 {

	public static void main(String[] args) {
		int arr[] = new int[3]; // arr 은 기본 배열로 크기가 정해진 배열이다. 
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(arr[1]);
	}

}
