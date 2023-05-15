package exercise;

public class Ex08 {
	
	public static void main(String[] args) {
		// 반복문을 사용하여 피라미드 모양을 출력하는 프로그램을 만들어 보세요.
		int lineCount = 10;
		int starCount = 1;
		for (int i=1; i <=lineCount; i++) {
			int spaceCount = lineCount - i;
			for (int j=1; j<=spaceCount; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=starCount; j++) {
				System.out.print("*");
			}
			for (int j=1; j<=spaceCount; j++) {
				System.out.print(" ");
			}
			starCount += 2;
			System.out.println();
		}
	}
	
	

}
