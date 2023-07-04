package main;

public class Ex5 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			arr[5] = 5;
		} catch (ClassCastException e) {  // 발생한 예외 인스턴스가 매개변수에 저장됨
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e.getMessage());  // 예외 메시지 출력
			e.printStackTrace();  // 발생한 위치와 예외 메시지 출력
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}
