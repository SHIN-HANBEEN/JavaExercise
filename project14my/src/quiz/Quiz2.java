package quiz;

public class Quiz2 {
	
	public static void main(String[] args) {
		Object x = new Integer(0);
		try {
			System.out.println((String)x); // Integer 클래스를 String 클래스로 형변환			
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		System.out.println("정상적으로 프로그램이 종료됩니다.");
	}
}
