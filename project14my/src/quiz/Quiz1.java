package quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		try {
			String str = null;
			str.length();
			int num = 0/0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}