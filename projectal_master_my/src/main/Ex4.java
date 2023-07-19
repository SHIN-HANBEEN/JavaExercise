package main;

// <반복문>
// 정수 1 부터 10까지 모두 합하여 결과를 출력한다.
public class Ex4 {
	public static void main(String[] args) {
		int i; // i 는 반복문의 조건으로 사용하기 위한 변수이다.
		int sum = 0; // sum은 결과를 저장하기 위한 변수이다. 
		
		// i가 1부터 10이 될 때까지 10번 반복된다. 
		for(i=1; i<=10; i++) {
			sum = sum + i; // sum 에 i 를 더한다. 
		}
		
		System.out.println(sum); // sum 을 출력한다.
	}
}
