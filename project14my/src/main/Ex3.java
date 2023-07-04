package main;

public class Ex3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			arr[5] = 5;  // 예외가 발생할 가능성이 있는 코드를 작성한다. 
		} catch (IndexOutOfBoundsException e) {  // 예외 클래스를 사용하여 catch 문을 작성한다. 
			System.out.println(e);  // 예외 클래스에 해당하는 에러가 발생했을 때 실행된다. 
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}
