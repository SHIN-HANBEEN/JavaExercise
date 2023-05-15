package exercise;

public class Ex8 {
	
	public static void main(String[] args) {
		// 반복문을 사용하여 피라미드 모양을 출력하는 프로그램을 만들어 보세요.
		int lineCounter = 8;
		int starCounter = 1;
		for (int i=1; i <=lineCounter; i++) {
			int spaceCounter = lineCounter - i;
			for (int j=1; j<=spaceCounter; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=starCounter; j++) {
				System.out.print("*");
			}
			for (int j=1; j<=spaceCounter; j++) {
				System.out.print(" ");
			}
			starCounter += 2;
			System.out.println();
		}
	}
	
	

}
