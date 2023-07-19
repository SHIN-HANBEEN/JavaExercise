package quiz;

import java.util.ArrayList;

// getSum 함수는 배열에 저장된 모든 숫자의 합을 계산하여 반환합니다
// 메인 함수에서는 배열을 생성하고, getSum 함수를 호출하여 합계를 계산하고 출력합니다. 
public class Quiz4 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		getSum(arr);
	}
	
	public static void getSum(ArrayList<Integer> arr) {
		int sum = 0; // 배열의 숫자 합을 저장할 변수
		for (int i = 0; i < arr.size(); i++) {
			sum = sum + arr.get(i);
		}
		System.out.println(sum);
	}
}
