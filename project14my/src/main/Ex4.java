package main;

public class Ex4 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			arr[5] = 5;
		} catch (ClassCastException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		// catch 문에 발생한 오류에 해당하는 오류 클래스를 만들어주지 않았으므로 
		// 프로그램이 비정상 종료되게 됩니다. 
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}
