package exercise;

import java.lang.reflect.Method;

public class Ex8 {
	
	public static void main(String[] args) {
		// 반복문을 사용하여 피라미드 모양을 출력하는 프로그램을 만들어 보세요.
		int lineCount = 5;  
		int starCount = 1;
		if (lineCount % 2 == 0) {
			int spaceCount = lineCount/2 +1;
			for(int i = 1; i<=lineCount; i++) {
				for(int j = 0; j<spaceCount; j++) {
					System.out.print(' ');
				}
				for(int j=0; j<starCount; j++) {
					System.out.print('*');
				}
				for(int j = 0; j<spaceCount; j++) {
					System.out.print(' ');
				}
				spaceCount-=1;
				starCount+=2;
				System.out.println();
			}
		} else {
			int spaceCount = lineCount/2 +2;
			for(int i = 1; i<=lineCount; i++) {
				for(int j = 0; j<spaceCount; j++) {
					System.out.print(' ');
				}
				for(int j=0; j<starCount; j++) {
					System.out.print('*');
				}
				for(int j = 0; j<spaceCount; j++) {
					System.out.print(' ');
				}
				spaceCount-=1;
				starCount+=2;
				System.out.println();
			}
		}
	}
	
	

}
