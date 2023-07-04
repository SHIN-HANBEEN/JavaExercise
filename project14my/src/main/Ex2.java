package main;

public class Ex2 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[5] = 5; // 런타임 오류가 발생하면서 프로그램이 끝까지 실행되지 못함.
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}
